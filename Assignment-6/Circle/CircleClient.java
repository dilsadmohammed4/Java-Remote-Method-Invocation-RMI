
import java.rmi.*;

public class CircleClient {
    public static void main(String[] args) {
        try {
            String R_URL = "rmi://" + args[0] + "/CircleServer";
            CircleInterface asi = (CircleInterface) Naming.lookup(R_URL);
            System.out.println("Radius Of Circle: " + args[1]);
            int a = Integer.parseInt(args[1]);
            System.out.println("Area Of Circle: " + asi.Area(a));
            System.out.println("Perimeter Of Circle: " + asi.Perimeter(a));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
