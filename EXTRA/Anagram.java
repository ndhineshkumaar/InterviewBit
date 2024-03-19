import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String A="welcome";
        String B="come";
        int[] freqA=new int[26];
        int[] freqB=new int[26];
        for(int i=0;i<A.length();i++){
            freqA[A.charAt(i)-'a']++;
        }
        for(int i=0;i<B.length();i++){
            freqB[B.charAt(i)-'a']++;
        }
        int count=0;
        for(int i=0;i<freqA.length;i++){
            if(freqA[i]==freqB[i]) count++;
        }
        if(count==26-(A.length()-B.length())) System.out.println("True");
        else System.out.println("False");
    }
}
