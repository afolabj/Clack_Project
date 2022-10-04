package data;
import java.util.Objects;

// this class inherits from ClackData

public class File Clack Data extends ClackData{
    private String fileName;
    private String fileContents;

//    constructor  to set up username, filename,type, and calls super constructor

    public void FileClackData(userN,file_1,type_1){
        super(userN, type_1);
        fileName = file_1;
        fileContents = null;
    }

    //default constructor
    public FileClackData(){ super();}
    public void setFileName(String file_1){this.fileName = file_1;}
    public String getFileName(){
        return this.fileName;
    }
    public String getData(){ return null;}
    public void readFileContents(){}
    public void writeFileContents(){}

    @Override
    public int hashCode(){return Objects.hash(fileName, fileContents);}

//    not implemented yet
    public boolean equals(){}

    public String toString(){
        String file_info;
        file_info = "FILENAME:" + fileName + "\nFILE_CONTENTS:" + fileContents + "\nUSERNAME:" + super.userName + "\nGET_DATE:" + super.getDate() + "\nGET_TYPE: " + super.getType();
        return file_info;
    }
}