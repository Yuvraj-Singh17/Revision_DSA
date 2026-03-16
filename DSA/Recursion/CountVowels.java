public class CountVowels {
    public static void main(String[] args) {
        String str = "Yuvraj Singh";
        System.out.println(count(str , str.length()-1));
    }
    public static int count(String str , int idx){
        if(idx == -1){
            return 0;
        }
        if(str.charAt(idx) == 'a' || str.charAt(idx) == 'e' || str.charAt(idx) == 'i' || str.charAt(idx) == 'o' || str.charAt(idx) == 'u'){
            return 1 + count(str , idx-1);
        }
        return count(str , idx - 1);
    }
}
