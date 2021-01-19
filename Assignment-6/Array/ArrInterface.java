
import java.rmi.*;

public interface ArrInterface extends Remote {

    public String arraySum(int array[]) throws RemoteException;

}
