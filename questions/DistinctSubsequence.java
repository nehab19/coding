package guru.springframework.spring5webapp.questions;

import java.util.HashSet;
import java.util.Set;

public class DistinctSubsequence {

    public static void subsequences(Set<String> sn, char[] s, char[] op, int i, int j, int n){
        if (i == n) {
            op[j] = '\0';
            sn.add(String.valueOf(op));
            return;

        }else{
            op[j]=s[i];
            subsequences(sn,s,op,i+1,j+1,n);
            subsequences(sn,s,op,i+1,j,n);
            return;
        }


    }

    public static void main(String[] args)
    {
        char[] str = { 'g', 'g', 'g' };

        // Create an empty set to store the subsequences
        Set<String> sn = new HashSet<String>();
        char[] op = new char[str.length + 1]; // extra one for having
        // \0 at the end

        // Function Call
        subsequences(sn, str, op, 0, 0, str.length);

        // Output will be the number
        // of elements in the set
        System.out.println(sn.size());
        System.out.println(sn);
        sn.clear();

        // This code is contributed by Aditya Sharma
    }


}
