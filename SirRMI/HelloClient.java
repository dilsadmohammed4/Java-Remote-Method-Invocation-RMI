import java.io.*;
import java.rmi.*;
class HelloClient {
public static void main(String args[ ]) {
try {
String R_URL="rmi://"+args[0]+"/HelloServer"; //rmi://localhost/HelloServer
HelloInterface hii= (HelloInterface)Naming.lookup(R_URL);
String msg=hii.Hello("MCA 4th Semester Guys");
String a = args[1];
System.out.println(hii.Hello(a));

}
catch(Exception e) {
e.printStackTrace();
}
}
}