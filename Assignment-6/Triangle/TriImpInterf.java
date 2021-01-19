import java.rmi.*;

import java.rmi.server.*;

public class TriImpInterf extends UnicastRemoteObject implements TriInterface {

    public TriImpInterf() throws RemoteException {

    }

    public String TriArea(int b, int h, int s) throws RemoteException {
        double triangleArea, trianglePerimeter;
        double pi = 3.141;
        triangleArea = (b * h) / 2;
        trianglePerimeter = b + h + s;
        return "Area Of Triangle:" + triangleArea + "\n" + "Perimeter Of Triangle:" + trianglePerimeter;

    }

}
