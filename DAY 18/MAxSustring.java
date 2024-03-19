public class MAxSustring {
    public static void main(String[] args) {
        String A="bba";
        int B=2;
        int end=B;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<A.length();i+=B){
            int count=0;
            String temp="";
            if(end>A.length()){
                temp=A.substring(0, A.length());
            }
            else temp=A.substring(i, end);

            for(int j=0;j<temp.length();j++){
                if(temp.charAt(j)=='a') count++;
            }
            if(count>max) max=count;

            end=end+B;
        }
        System.out.println(max);
    }
}
