
import java.rmi.*;

public class ArrServer {
    public static void main(String args[]) {
        try {
            ArrImpInterf aii = new ArrImpInterf();
            Naming.bind("ArrServer", aii);
            System.out.println("Server is Started....");
        } catch (Exception e) {
            System.out.println("Exception in caught in server" + e);
        }
    }
}
