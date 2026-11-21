
public class IntegrityDemo {

    public static void main(String[] args) {

        int originalBalance = 10000;
        int modifiedBalance = 50000;

        if (originalBalance == modifiedBalance) {
            System.out.println("Data is unchanged");
        } else {
            System.out.println("Warning! Data has been modified");
        }
    }
}

//O/P:Warning! Data has been modified