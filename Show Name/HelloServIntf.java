import java.rmi.*;

public interface HelloServIntf extends Remote {
    public String name(String x) throws RemoteException;
}
