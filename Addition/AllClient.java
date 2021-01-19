import java.rmi.*;

class AllClient {
    public static void main(String args[]) {
        try {
            String R_URL = "rmi://" + args[0] + "/AddServer";
            AllServIntf asi = (AllServIntf) Naming.lookup(R_URL);
            System.out.println("The first number is " + args[1]);
            System.out.println("The second number is " + args[2]);
            int a = Integer.parseInt(args[1]);
            int b = Integer.parseInt(args[2]);
            System.out.println("The sum of two numbers= " + asi.addition(a, b));
            System.out.println("The sub of two numbers= " + asi.subtraction(a, b));
            System.out.println("The mul of two numbers= " + asi.multiplication(a, b));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
