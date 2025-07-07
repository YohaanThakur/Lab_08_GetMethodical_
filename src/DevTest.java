import java.util.Scanner;

class TestGetRegExString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ssn = SafeInput.getRegExString(in, "Enter SSN (###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("You entered SSN: " + ssn);
        in.close();
    }
}
