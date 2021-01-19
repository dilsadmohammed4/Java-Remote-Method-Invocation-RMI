import java.rmi.*;
import java.rmi.server.*;

public class MulIntfImpl extends UnicastRemoteObject implements MulServIntf {
    public MulIntfImpl() throws RemoteException {

    }

    public int multiplication(int x, int y) throws RemoteException {
        return (x * y);
    }
}
