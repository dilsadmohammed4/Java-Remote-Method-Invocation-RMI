import java.rmi.*;
import java.rmi.server.*;

public class SubIntfImpl extends UnicastRemoteObject implements SubServIntf {
public SubIntfImpl() throws RemoteException {

}

public int subtraction(int x, int y) throws RemoteException {
return (x-y);
    }
}  
