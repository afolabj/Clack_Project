package Data;

public class ClackData {
    private String username; // name of client user
    private int type; //
    private int date; // date when ClackData object was

    public void ClackData(userName,type){}
    public void ClackData(type){}
    public void ClackData(){}
    public void getType(){
        return type;
    }
    public void getUserName(){}
    public void getDate(){}

    //Abstract Methods

    getData(){}
}

public class MessageClackData extends ClackData{
    private String message;

    public void MessageClackData(userName,message,type){}
    public void MessageClackData(){}
    public void getData(){}
    public void hashCode(){}
    public void equals(){}
    public void toString(){}

}

public class File Clack Data extends ClackData{
    private String fileName;
    private String fileContents;

    public void FileClackData(userName,fileName,type){}
    public void FileClackData(){}
    public void setFileName(fileName){}
    public void getFileName(){
        return fileName;
    }
    public void getData(){}
    public void readFileContents(){}
    public void writeFileContents(){}
    public void hashCode(){}
    public void equals(){}
    public void toString(){}
}
