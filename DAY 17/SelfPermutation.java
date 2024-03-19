public class SelfPermutation {
    public static void main(String[] args) {
        String A="scaler";
        String B="relasc";
        int[] freqA=new int[26];
        int[] freqB=new int[26];
        for(int i=0;i<A.length();i++){
            freqA[A.charAt(i)-97]++;
        }
        for(int i=0;i<B.length();i++){
            freqB[B.charAt(i)-97]++;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(freqA[i]==freqB[i]) count++;
        }
        if(count>A.length()) System.out.println(1);
        else System.out.println(0);
    }
}
