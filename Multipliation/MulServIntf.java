import java.rmi.*;

public interface MulServIntf extends Remote {

    public int multiplication(int x, int y) throws RemoteException;
}
