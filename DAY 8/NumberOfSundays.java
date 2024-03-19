public class NumberOfSundays {
    public static void main(String[] args) {
        String A="Sunday";
        int B =1;
        String[] days= {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for(int i=0;i<days.length;i++){
            if(days[i]==A){
                System.out.println((i+B)/7);
            }
        }
    }
}
