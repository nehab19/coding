package guru.springframework.spring5webapp.questions;

public class AddBinary {

    static String addBinary(String A, String B)
    {
       int i=A.length()-1;
       int j=B.length()-1;
       int carry=0;
       int sum=0;
       StringBuilder stringBuilder=new StringBuilder();
       while(i>=0 || j>=0 || carry==1){
           sum=carry;
           if(i>=0) sum=sum+A.charAt(i) -'0';
           if(j>=0) sum=sum+B.charAt(j) -'0';
           stringBuilder.append((char) (sum%2+'0'));
           carry=sum/2;
           i--;
           j--;
       }
       return stringBuilder.reverse().toString();


    }

    //Driver code
    public static void main(String args[])
    {
        String a = "1101", b="101";

        System.out.print(addBinary(a, b));
    }
}
