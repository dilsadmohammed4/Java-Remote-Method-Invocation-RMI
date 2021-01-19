
import java.rmi.*;

public class CircleServer {
    public static void main(String args[]) {
        try {
            CircleImpInterf aii = new CircleImpInterf();
            Naming.bind("CircleServer", aii);
            System.out.println("Server is Started....");
        } catch (Exception e) {
            System.out.println("Exception in caught in server" + e);
        }
    }
}
