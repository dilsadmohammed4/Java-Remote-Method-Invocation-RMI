
import java.rmi.*;

public interface CircleInterface extends Remote {

    public double Area(int x) throws RemoteException;

    public double Perimeter(int x) throws RemoteException;

}
