import java.rmi.*;
import java.net.*;

class HelloServer {
    public static void main(String args[]) {
        try {
            HelloIntfImpl aii = new HelloIntfImpl();
            Naming.bind("AddServer", aii);
        } catch (Exception e) {
            System.out.println("Exception in caught in server" + e);
        }
    }
}
