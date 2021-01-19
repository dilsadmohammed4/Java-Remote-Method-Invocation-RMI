import java.io.*;
import java.rmi.*;

class MulClient {
    public static void main(String args[]) {
        try {
            String R_URL = "rmi://" + args[0] + "/MulServer";
            MulServIntf asi = (MulServIntf) Naming.lookup(R_URL);
            System.out.println("The first number is " + args[1]);
            System.out.println("The second number is " + args[2]);
            int a = Integer.parseInt(args[1]);
            int b = Integer.parseInt(args[2]);
            System.out.println("The sum of two numbers= " + asi.multiplication(a, b));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
