import java.util.Scanner;
public class Sifreleme {
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        System.out.println("bir metin girirn: ");
        String text = keyboard.nextLine();
        String newText ="";

        for (int i = 0; i < text.length(); i++) {
            if('a' < text.charAt(i) && text.charAt(i) <= 'z'){
                if(text.charAt(i)-'a' + 3 > 26){
                    newText += (text.charAt(i) + 3 - 26);

                }
                else{
                    newText += (text.charAt(i) + 3);
                }

            }
        }
    }
}
