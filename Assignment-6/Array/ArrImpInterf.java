import java.rmi.*;

import java.rmi.server.*;

public class ArrImpInterf extends UnicastRemoteObject implements ArrInterface {

    public ArrImpInterf() throws RemoteException {

    }

    public String arraySum(int array[]) throws RemoteException {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return "Sum:" + sum;

    }

}
