import java.util.*;
package Data;

public class ClackData {
    private String username; // name of client user
    private int type;
    private Date date; // date when ClackData object was

    public void ClackData(userName,type){
        this.userName = userName;
        this.type = type;
        this.date = new Date();
    }
    public void ClackData(type){}
    public void ClackData(){}
    public int getType(){
        return type;
    }
    public String getUserName(){
        return username;
    }
    public void getDate(){
        return date;
    }

    //Abstract Method

    getData(){}
}

public class MessageClackData extends ClackData{
    private String message;

    public void MessageClackData(userName,message,type){
        super(userName, message)
    }
    public void MessageClackData(){}
    public void getData(){}
    public int hashCode(){}
    public boolean equals(){}
    public String toString(){
        return
    }

}

public class File Clack Data extends ClackData{
    private String fileName;
    private String fileContents;

    public void FileClackData(userName,fileName,type){}
    public void FileClackData(){}
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