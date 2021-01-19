import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
public class HelloImplement extends UnicastRemoteObject implements 
HelloInterface {
public HelloImplement() throws RemoteException{
super();
}
public String Hello(String n) throws RemoteException {
			return "Hello " + n;
       }
}