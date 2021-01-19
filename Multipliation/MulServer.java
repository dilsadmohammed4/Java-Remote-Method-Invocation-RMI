import java.rmi.*;
import java.net.*;

class MulServer {
    public static void main(String args[]) {
        try {
            MulIntfImpl aii = new MulIntfImpl();
            Naming.bind("MulServer", aii);
            System.out.println("Server started...");
        } catch (Exception e) {
            System.out.println("Exception in caught in server" + e);
        }
    }
}
