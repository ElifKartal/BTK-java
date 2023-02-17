import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
//import java.io.FileWriter;
//import java.io.IOException;

public class DosyaOkuma {
    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\Users\\Elif\\Desktop\\movie.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              System.out.println(data);
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
          

    }


}
