
public class AuthenticationAuthorizationDemo {

    public static void main(String[] args) {

        String correctUsername = "admin";
        String correctPassword = "admin123";

        String enteredUsername = "admin";
        String enteredPassword = "admin123";

        String userRole = "ADMIN";

        // Step 1: Authentication
        if (correctUsername.equals(enteredUsername)
                && correctPassword.equals(enteredPassword)) {

            System.out.println("Authentication Successful");

            // Step 2: Authorization
            if (userRole.equals("ADMIN")) {

                System.out.println("Authorization Successful");
                System.out.println("Welcome to Admin Dashboard");

            } else {

                System.out.println("Authorization Failed");
                System.out.println("Access Denied");
            }

        } else {

            System.out.println("Authentication Failed");
            System.out.println("Invalid Credentials");
        }
    }
}
//o/p:Authentication Successful
//Authorization Successful
//Welcome to Admin Dashboard