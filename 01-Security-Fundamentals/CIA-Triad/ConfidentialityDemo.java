
public class ConfidentialityDemo {

    public static void main(String[] args) {

        String authorizedUser = "admin";
        String enteredUser = "guest";

        if (authorizedUser.equals(enteredUser)) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Access Denied");
        }
    }
}
