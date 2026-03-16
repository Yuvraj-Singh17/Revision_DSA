public class Palindrome{
    public static void main(String[] args) {
        String str = "NAMAN";
        System.out.println(isPalindrome(str , 0 , str.length()-1));
    }
    public static boolean isPalindrome(String str , int st , int end){
        if(st >= end){
            return true;
        }
        if(str.charAt(st) != str.charAt(end)){
            return false;
        }

        return isPalindrome(str, st+1, end-1);
    }

}