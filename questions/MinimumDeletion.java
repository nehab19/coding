package guru.springframework.spring5webapp.questions;

public class MinimumDeletion {

    // Utility function for calculating
// Minimum element to delete
    public static int utility_fun_for_del(String str,
                                          int i, int j)
    {
        if (i >= j)
            return 0;

        // Condition to compare characters
        if (str.charAt(i) == str.charAt(j))
        {

            // Recursive function call
            return utility_fun_for_del(str,
                    i + 1, j - 1);
        }

        int min_value=Math.min(utility_fun_for_del(str, i + 1, j), utility_fun_for_del(str, i, j - 1));
        // Return value, incrementing by 1
        return 1 + min_value;
    }

    // Function to calculate the minimum
// Element required to delete for
// Making string palindrome
    public static int min_ele_del(String str)
    {

        // Utility function call
        return utility_fun_for_del(str, 0,
                str.length() - 1);
    }

    // Driver Code
    public static void main(String[] args)
    {
        String str = "aebcbda";

        System.out.println("Minimum element of deletions = " +
                min_ele_del(str));
    }
}
