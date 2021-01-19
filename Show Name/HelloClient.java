import java.io.*;
import java.rmi.*;

class HelloClient {
    public static void main(String args[]) {
        try {
            String R_URL = "rmi://" + args[0] + "/AddServer";
            HelloServIntf asi = (HelloServIntf) Naming.lookup(R_URL);
            String a = args[1];
            System.out.println(asi.name(a));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
