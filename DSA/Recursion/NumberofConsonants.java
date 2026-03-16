public class NumberofConsonants {
    public static void main(String[] args) {
        String s = "ashutosh";
        System.out.println(count(s , 0));
    }
    public static int count(String s , int idx){
        if(idx == s.length()){
            return 0;
        }
        if(s.charAt(idx) != 'a' && s.charAt(idx) != 'e'&& s.charAt(idx) != 'i' && s.charAt(idx) != 'o'&& s.charAt(idx) != 'u'){
            return 1+count(s , idx+1);
        }
        return count(s ,idx + 1);
    }
}
