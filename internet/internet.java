// default imports

import java.io.*;
import java.net.*;


// internet class

public class Internet {
    
    public class void internet() {
        
        InetAddress localAddress = InetAddress.getLocalHost();
        URL tcpServer = new URL("tcp://127.0.0.1:" +tcpServerPort +"");
        URLConnection tcpServerConnection = tcpServer.openConnection();
        InputStream tcpServerInput = tcpServerConnection.getInputStream();
        int datas = tcpServerConnection.getContentLenght();
        
    }
    
}
