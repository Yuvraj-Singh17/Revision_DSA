public class toUpperCase {
    public static void main(String[] args) {
        String str = "rohit";
        StringBuilder sb = new StringBuilder();
        System.out.println(toUpper(str, sb, 0));
    }
    public static String toUpper(String str ,StringBuilder sb , int idx){
        if(idx == str.length()){
            return sb.toString();
        }
        
        char ch = (char) ('A' + str.charAt(idx) - 'a');
        sb.append(ch);
        
        return toUpper(str ,sb , idx+1);
    }
}
