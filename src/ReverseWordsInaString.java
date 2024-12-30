public class ReverseWordsInaString {
    public static void main(String[] args) {

        String word = "I am learning java programming";
        String[] arr = word.split(" ");
        String reverseString = "";
        for(String w:arr){
            String reverseWord = "";
            for(int i=w.length()-1;i>=0;i--){
                reverseWord = reverseWord + w.charAt(i);
            }
            reverseString = reverseString + reverseWord +" ";
        }
        System.out.println(reverseString);

    }
}
