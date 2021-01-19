
import java.rmi.*;

public class TriClient {
    public static void main(String[] args) {
        try {
            String R_URL = "rmi://" + args[0] + "/TriServer";
            TriInterface asi = (TriInterface) Naming.lookup(R_URL);
            System.out.println("Triangle Base: " + args[1]);
            System.out.println("Triangle Height: " + args[2]);
            System.out.println("Triangle Side: " + args[3]);
            int b = Integer.parseInt(args[1]);
            int h = Integer.parseInt(args[2]);
            int s = Integer.parseInt(args[3]);
            System.out.println(asi.TriArea(b, h, s));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
