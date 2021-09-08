import java.util.ArrayList;
import java.util.Scanner;
public class DelSignoreClass {
    public static void main(String[] args){
        var studentNames = new ArrayList<String>();
        var reader = new Scanner(System.in);
        var userResponse = "";
        while (!userResponse.equals("done")){
            System.out.print("Type in the next student name or 'done' to exist:");
            userResponse = reader.nextLine();
            if (userResponse.equals("done")){
                break;
            }
            studentNames.add(userResponse);
        }
    }
}
