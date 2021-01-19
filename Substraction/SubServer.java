import java.rmi.*;
import java.net.*;
class SubServer {
public static void main(String args[ ]) {
try {
SubIntfImpl aii = new SubIntfImpl();
Naming.bind("SubServer", aii);
}catch(Exception e) {
System.out.println("Exception in caught in server" +e);
          }
      }
 }
