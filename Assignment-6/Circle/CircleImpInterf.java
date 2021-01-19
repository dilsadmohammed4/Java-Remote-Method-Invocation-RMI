import java.rmi.*;

import java.rmi.server.*;

public class CircleImpInterf extends UnicastRemoteObject implements CircleInterface {

    public CircleImpInterf() throws RemoteException {

    }

    public double Area(int r) throws RemoteException {
        double circleArea;
        double pi = 3.141;
        circleArea = pi * r * r;
        return circleArea;

    }

    public double Perimeter(int r) throws RemoteException {
        double circlePerimeter;
        double pi = 3.141;
        circlePerimeter = 2 * pi * r;
        return circlePerimeter;

    }
}
