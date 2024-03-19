import java.util.ArrayList;

public class FizzBuzz{
    public static void main(String[] args) {
        int A=30;
        ArrayList<String> res=new ArrayList<>();
        for(int i=1;i<=A;i++){
            if(i%3==0 & i%5==0){
                res.add("FizzBuzz");
            }
            else if(i%3==0){
                res.add("Fizz");
            }
            else if(i%5==0){
                res.add("Buzz");
            }
            else{
                res.add(Integer.toString(i));
            }
        }
        System.out.println(res);
    }
}