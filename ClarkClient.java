package main;
import data.*;
import java.util.Objects;


//  the class represents the client user
// contains username,hostname of the server connected to, port number connected to


public class ClackClient {
    private String userName;
    private String hostName;
    private int port;
    private boolean closeConnection;
    private ClackData dataToSendToServer;
    private ClackData dataToReceiveFromServer;



//      constructor for username,hostname,port

    public ClackClient(String userN,String host_1, int port_1){
        this.userName = userN;
        this.hostName = host_1;
        this.port = port_1;
        this.closeConnection = false;
        this.dataToSendToServer = null;
        this.dataToReceiveFromServer = null;
    }


//     constructor sets port to default port number 7000

    public ClackClient(String userN, String host_1){
        this(userN,host_1,7000);
    }


//    constructor sets the host name to be "localhost

    public ClackClient(String userN){
        this(userN,"localhost");
    }

//     default constructor sets anonymous user

    public ClackClient(){
        this("unknown");
    }

    public void start(){}

    public void sendData(){}

    public void receiveData(){}

    public void printData(){}


//     return username

    public String getUserName(){
        return this.userName;
    }


//      return host name


    public String getHostName(){
        return this.hostName;
    }


//    return port

    public int getPort(){
        return this.port;
    }

    @Override
    public int hashCode(){
        return Objects.hash(userName,hostName,port,closeConnection,dataToSendToServer,dataToReceiveFromServer);
    }

    public boolean equals(){}
    //havent implemented equals yet


    @Override
    public String toString(){
        String file_info = "\nUSERNAME : " + userName + "\nHOSTNAME: " + hostName + "\nPORT: " + port + "\nCLOSE_CONNECTION:" + closeConnection + "\nDATA_TO_SEND: " + dataToSendToServer + "\nDATA_RECEIVE_FROM : " + dataToReceiveFromServer;
        return file_info;
    }


}

