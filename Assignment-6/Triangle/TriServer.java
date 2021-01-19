
import java.rmi.*;

public class TriServer {
    public static void main(String args[]) {
        try {
            TriImpInterf aii = new TriImpInterf();
            Naming.bind("TriServer", aii);
            System.out.println("Server is Started....");
        } catch (Exception e) {
            System.out.println("Exception in caught in server" + e);
        }
    }
}
