import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
//make sure .txt is in main project folder or it won't work
// curly braces whenever you would indent in python
//*curly braces*
public class DelSignoreClass2 {
    public static  void main(String[] args) throws IOException{
        var filename = "student.txt";
        var studentFile= Paths.get(filename);
        var allStudents = Files.readString(studentFile);
        String [] seperatedNames = allStudents.split("\n");
        //now lets show the user
        System.out.println("Here are the students in your class:");
        for(var studentName: seperatedNames){
            System.out.println(studentName); //note indent and curly braces
        }


    }

}
