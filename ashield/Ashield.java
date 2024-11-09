package guru.springframework.spring5webapp.ashield;



import org.springframework.util.StringUtils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class Ashield {
    public static void main(String[] args) {
        try {
               /*String error_code="";
            Boolean duplicate=((!StringUtils.isEmpty(error_code)) &&"TSL-ORD-OPN-0002,TSL-PACK-EXISTS".contains(error_code)) *//*|| ("FAILURE".equalsIgnoreCase("") && "DUPLICATE_REQUEST".equalsIgnoreCase("Failure"))*//*;
            System.out.println(duplicate);*/
            //"HmacSHA512"
            String mid = "031";
            String merTxnId = "TXN1724225446073744080"; //unique random uuuid
            String txnId = "37142918-3795-4d85-8bd9-6d64ce1a1ac3"; //pre register api
            Mac mac = Mac.getInstance("HmacSHA512");
            String secKey = "fa5608487dc4a746ab83e64467f57852";
            String data = mid + merTxnId + txnId;
            mac.init(new SecretKeySpec(secKey.getBytes(), "HmacSHA512"));
            byte[] hexBytes = new org.bouncycastle.util.encoders.Hex().encode(mac.doFinal(data.getBytes()));
            System.out.println(new String(hexBytes, "UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
