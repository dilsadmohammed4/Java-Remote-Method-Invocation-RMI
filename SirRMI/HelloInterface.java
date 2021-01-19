import java.rmi.*;
               public interface HelloInterface extends Remote {
	                public String Hello(String n) throws RemoteException;
	                 }