package guru.springframework.spring5webapp.searching;

public class FirstRepeatedElement {
    public static int getFirstRepeatedElement(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,34,45,59,90,9,2,67,9};
        int elementIndex=getFirstRepeatedElement(arr);
        System.out.println("First repeated element is: " + arr[elementIndex]);
    }

}
