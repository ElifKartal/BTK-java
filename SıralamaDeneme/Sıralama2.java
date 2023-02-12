import java.util.ArrayList;
import java.util.Collections;

public class Sıralama2 {
    public static void main(String[] args) {
        ArrayList<String> movie =new ArrayList<String>();
        movie.add("HUMPTY SHARMA KI DUL");
        Collections.sort(movie);
        for (String i: movie) {
            System.out.println(i);
            
        }
    }
}
