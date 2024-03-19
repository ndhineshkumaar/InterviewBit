public class MinParanthesis {
    public static void main(String[] args) {
        String A="(((((()))))))";
        int req=0;
        for(int i=0;i<A.length();i++){
            if (A.charAt(i)==(char)40){
                req++;
            }
            else if (A.charAt(i)==(char)41){
                req--;
            }
        }
        System.out.println(Math.abs(req));
    }
}
