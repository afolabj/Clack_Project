package data;
import java.util.Objects;

//This class inherits from ClarkData
public class MessageClackData extends ClackData{
    private String message;

    
//     constructor that sets up username, message and type
    public MessageClackData(String userN,String message_1,type_1){
        super(userN, type_1);
        this.message = message_1;
    }

    
//    default constructor
    public MessageClackData(){ super();}

    public void getData(){ return message;}

    @Override
    public int hashCode(){ return Objects.hash(message);}

    
// havent implemented the equal function yet
    public boolean equals(){}





    //    Overriding the toString function
    @Override
    public String toString(){
        String file_info = "MESSAGE :" + message + "\nUSERNAME: " + super.userName + "\nGET_TYPE: " + super.getType()+ "\nGET_DATE: " + super.getDate();
        return file_info; }
}

