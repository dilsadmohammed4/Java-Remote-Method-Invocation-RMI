import java.rmi.*;
import java.net.*;
class HelloServer {
public static void main(String args[ ]) {
try {
HelloImplement hi= new HelloImplement();
Naming.bind("HelloServer", hi);// registering the object
}catch(Exception e) {
System.out.println("Exception in caught in server" +e);
          }
      }
 }




