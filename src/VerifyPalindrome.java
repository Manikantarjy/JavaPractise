public class VerifyPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        String reversed = new StringBuffer(str).reverse().toString();

        if(str.equals(reversed)){
            System.out.println("The String is palindrome");
        }
        else{
            System.out.println("The String is not a palindrome");
        }

    }
}
