package data;
import java.util.Date;

//the class represents the data between the client and the server

public class ClackData {
    protected String username;                           // name of client user
    protected int type;
    protected Date date;                                 // date when ClackData object was created

    public ClackData(String userN,type_1){
        this.username = userN;
        this.type = type_1;
        this.date = new Date();
    }
    public ClackData(int type_1){   // constructor calling another constructor
        this("Anon", type_1)
    }
    public ClackData(){this(-1);}                  // default constructor
    public int getType(){
        return this.type;
    }
    public String getUserName(){return this.username;}
    public Date getDate(){
        return this.date;
    }

//    Abstract Method

    public abstract String getData();
}

