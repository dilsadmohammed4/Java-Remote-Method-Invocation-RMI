import java.util.*;
import java.rmi.*;

public class ArrClient {
    public static void main(String[] args) {
        try {

            Scanner input = new Scanner(System.in);
            // System.out.print("Enter the Localhost Adress:");
            // String lhost = input.next();

            String lhost = "127.0.0.1";
            String R_URL = "rmi://" + lhost + "/ArrServer";
            ArrInterface asi = (ArrInterface) Naming.lookup(R_URL);
            System.out.print("Enter the array range:");
            int num = input.nextInt();
            int array[] = new int[num];
            System.out.print("Enter the array element:");
            for (int i = 0; i < num; i++) {
                array[i] = input.nextInt();
            }
            System.out.println(asi.arraySum(array));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
