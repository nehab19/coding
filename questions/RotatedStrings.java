package guru.springframework.spring5webapp.questions;

public class RotatedStrings {
    public static boolean isRotated(String str1, String str2)
    {
      if(str1.length()!=str2.length()){
          return false;
      }
      if(str1.length()<=2 ){
          return str1.equalsIgnoreCase(str2);
      }
      String clockwiseRotation="";
      String anticlockwiseRotation="";

      String lastCharacters=str2.substring(str2.length()-2);
      String firstCharacters=str2.substring(0,str2.length()-2);
      anticlockwiseRotation=lastCharacters+firstCharacters;

      String last=str2.substring(2);
      String first=str2.substring(0,2);
      clockwiseRotation=last+first;
      return str1.equalsIgnoreCase(anticlockwiseRotation) || str1.equalsIgnoreCase(clockwiseRotation);
    }

    public static void main(String[] args)
    {

        String str1 = "amazon";
        String str2 = "azonam";
        System.out.println(isRotated(str1, str2)); // Output: true
    }
}
