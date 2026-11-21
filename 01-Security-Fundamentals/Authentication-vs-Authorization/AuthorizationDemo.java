
public class AuthorizationDemo {

    public static void main(String[] args) {

        String userRole = "CUSTOMER";

        if (userRole.equals("ADMIN")) {

            System.out.println("Access Granted");
            System.out.println("Welcome to Admin Dashboard");

        } else {

            System.out.println("Access Denied");
            System.out.println("You are not authorized");
        }
    }
}
//o/p:Access Denied
You are not authorized
/*Now change:
String userRole = "ADMIN";


Output:
Access Granted
Welcome to Admin Dashboard*/