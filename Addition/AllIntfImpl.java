import java.rmi.*;
import java.rmi.server.*;

public class AllIntfImpl extends UnicastRemoteObject implements AllServIntf {
    public AllIntfImpl() throws RemoteException {

    }

    public int addition(int x, int y) throws RemoteException {
        return (x + y);
    }

    public int subtraction(int x, int y) throws RemoteException {
        return (x - y);
    }

    public int multiplication(int x, int y) throws RemoteException {
        return (x * y);
    }
}
