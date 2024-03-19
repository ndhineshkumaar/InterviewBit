public class ValidPassword {
    public static void main(String[] args) {
        String A="scaler@1";
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#%&!$*])(?=\\S+$).{8,15}$";
        if (A.matches(regex)) {
            System.out.println(1);
            return;
        } else {
            System.out.println(0);
            return;
        }
    }
}
