
public class AuthenticationDemo {

    public static void main(String[] args) {

        String correctUsername = "sam";
        String correctPassword = "java123";

        String enteredUsername = "sam";
        String enteredPassword = "java123";

        if (correctUsername.equals(enteredUsername)
                && correctPassword.equals(enteredPassword)) {

            System.out.println("Authentication Successful");
        } else {
            System.out.println("Invalid Username or Password");
        }
    }
}
//o/p:Authentication Successful
/*Now change:
String enteredPassword = "wrong123";


Output:
Invalid Username or Password*/