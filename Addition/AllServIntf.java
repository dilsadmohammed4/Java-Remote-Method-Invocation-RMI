import java.rmi.*;

public interface AllServIntf extends Remote {
    public int addition(int x, int y) throws RemoteException;

    public int subtraction(int x, int y) throws RemoteException;

    public int multiplication(int x, int y) throws RemoteException;
}
