package guru.springframework.spring5webapp.leetcode.StringOrArrays;

public class PowerOfTwo {
    public static boolean isPowerOfTwoApproachOne(int n){
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        return n%2==0 && isPowerOfTwoApproachOne(n/2);
    }

    public static boolean isPowerOfTwoApproachTwo(int n){
      return (n>0) && ((n & (n-1))==0);

    }


    public static boolean isPowerOfTwoApproachThree(int n){
        if(n<=0){
            return false;
        }
        return Integer.bitCount(n)==1;

    }




    public static void main(String[] args) {
        System.out.println(isPowerOfTwoApproachOne(8));
        System.out.println(isPowerOfTwoApproachTwo(8));
        System.out.println(isPowerOfTwoApproachThree(8));
    }
}
