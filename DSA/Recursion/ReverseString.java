public class ReverseString {
    public static void main(String[] args) {
        String str = "Rohit";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(Reverse(sb , 0 , str.length()-1));
    }
    public static String Reverse(StringBuilder sb , int st , int end){
        if(st >= end){
            return sb.toString();
        }
        char temp = sb.charAt(st);
        sb.setCharAt(st, sb.charAt(end));
        sb.setCharAt(end, temp);

        return Reverse(sb , st+1, end-1);
    }
}
