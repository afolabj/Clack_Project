import java.util.*;
package main;
import data.*;
import java.util.Objects;


//This class contains information about the port number that clients connect to
public class ClackServer {
    private int port;
    private boolean closeConnection;
    private int dataToReceiveFromClient;
    private int dataToSendToClient;

    public ClackServer(int port1){
        this.port = port1;
        this.dataToReceiveFromClient = null;
        this.dataToSendToClient = null;
    }


    //      defualt constructor that sets port to default 7000 number
    public ClackServer(){
        this(7000);
    }

    public void start(){}
    public void receiveData(){}
    public void sendData(){}


    //      returns the port
    public int getPort(){
        return this.port;
    }


    //    overrides the hashcode function
    @Override
    public int hashCode(){
        return Objects.hash(port,closeConnection,dataToReceiveFromClient,dataToSendToClient);
    }

    //overriding the equal function not implemented
    public boolean equals(){}



    @Override
    public String toString(){
        String file_info =  "PORT:" + port + "\nCLOSE_CONNECTION: " + closeConnection + "\nDATA_TO_SEND_SERVER: " + dataToSendToClient+ "\nDATA_TO_RECEIVE_FROM_SERVER" + dataToReceiveFromClient;
        return file_info;
    }


}
