package Recursive;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println(isPalindrome("ana"));
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("java"));


    }
    public static boolean isPalindrome (String word){
        if (word.length()<= 1){
            return true;
        }
        char firstChar = word.charAt(0);
        char lastChat = word.charAt(word.length() - 1);
        if (firstChar != lastChat){
            return false;
        }
        String remainingSubString = word.substring(1, word.length()-1);
        return isPalindrome(remainingSubString);
    }
}
