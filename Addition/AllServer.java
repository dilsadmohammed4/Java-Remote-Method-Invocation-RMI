import java.rmi.*;

class AllServer {
    public static void main(String args[]) {
        try {
            AllIntfImpl aii = new AllIntfImpl();
            Naming.bind("AddServer", aii);
			System.out.println("Server is Started....");
        } catch (Exception e) {
            System.out.println("Exception in caught in server" + e);
        }
    }
}
