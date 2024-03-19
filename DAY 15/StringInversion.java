public class StringInversion {
    public static void main(String[] args) {
        String A="InterviewBit";
        StringBuilder B=new StringBuilder();
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)>=65 && A.charAt(i)<=90){
                B.append((char)(A.charAt(i)+32));
            }
            else{
                B.append((char)(A.charAt(i)-32));
            }
        }
        System.out.println(B.toString());
    }
}
