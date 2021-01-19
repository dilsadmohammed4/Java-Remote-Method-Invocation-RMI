import java.io.*;
import java.rmi.*;
class SubClient {
public static void main(String args[ ]) {
try {
String R_URL="rmi://"+args[0]+"/SubServer";
SubServIntf asi= (SubServIntf)Naming.lookup(R_URL);
System.out.println("The first number is "+args[1]);
System.out.println("The second number is "+args[2]);
int a = Integer.parseInt(args[1]);
int b = Integer.parseInt(args[2]);
System.out.println("The Subtraction of two numbers= " +asi.subtraction(a,b));
}
catch(Exception e) {
e.printStackTrace();
}
}
}
