package data;
import java.util.*;


public class ClackData {
    protected String username;                           // name of client user
    protected int type;
    protected Date date;                                 // date when ClackData object was

    public ClackData(String userN,type_1){
        this.username = userN;
        this.type = type_1;
        this.date = new Date();
    }
    public ClackData(int type_1){   // constructor calling another constructor
        this("Anon", type_1)
    }
    public ClackData(){this(-1);}                             // default constructor
    public int getType(){
        return this.type;
    }
    public String getUserName(){return this.username;}
    public Date getDate(){
        return this.date;
    }

    //Abstract Method

    public abstract String getData();
}

public class MessageClackData extends ClackData{
    private String message;

    public MessageClackData(String userN,String message_1,type_1){
        super(userN, type_1);
        this.message = message_1;
    }
    
    public MessageClackData(){ super();}
    public void getData(){ return message;}
    public int hashCode(){}  
    public boolean equals(){}
    
    @Override
    public String toString(){
        String sentence = "MESSAGE :" + message + "\nUSERNAME: " + super.userName + "\nGET_TYPE: " + super.getType()+ "\nGET_DATE: " + super.getDate();
        return sentence; }

}

public class File Clack Data extends ClackData{
    private String fileName;
    private String fileContents;

    public void FileClackData(userN,file_1,type_1){
        super(userN, type_1);
        fileName = file_1;
        fileContents = null;
    }
    
    public void FileClackData(){ super();}                       //default constructor
    public void setFileName(fileName){}
    public String getFileName(){
        return fileName;
    }
    public void getData(){}
    public void readFileContents(){}
    public void writeFileContents(){}
    public int hashCode(){}
    public boolean equals(){}
    public String toString(){}
}