
import java.rmi.*;

public interface TriInterface extends Remote {

    public String TriArea(int x, int y, int z) throws RemoteException;

}
