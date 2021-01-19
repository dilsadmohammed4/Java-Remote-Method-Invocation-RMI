import java.rmi.*;
import java.rmi.server.*;

public class HelloIntfImpl extends UnicastRemoteObject implements HelloServIntf {
    public HelloIntfImpl() throws RemoteException {

    }

    public String name(String x) throws RemoteException {
        return "Hello "+x;
    }
}
