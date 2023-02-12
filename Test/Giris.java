import java.util.Scanner;

import javax.lang.model.util.ElementFilter;

public class Giris {
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        System.out.println("Bir yazı yaz:");
        String text;
        text=keyboard.nextLine();
        System.out.println("Girdiğiniz yazı: "+text);
        Scanner keyboard2 =new Scanner(System.in);
        System.out.println("Bir sayı yaz:");
        int number;
        number =keyboard.nextInt();
        if(number< 10){
            System.out.println("sayı 10 dan küçük");
        }
        else{
            System.out.println("sayı 10 dan büyük");
        }
        Scanner keyboard3 =new Scanner(System.in);
        System.out.println("Bir sey yaz:");
        String string1=keyboard.next();
        String string2=keyboard.next();
        System.out.println("Yazı1: "+ string1);
        System.out.println("Yazı1: "+ string2);
       
       
        Scanner keyboard4 =new Scanner(System.in);
        System.out.println("Bir sayı gir:");
        int number2=keyboard.nextInt();
        if(number2 < 10){
            System.out.println("sayı 10 dan küçük");
        }
        else{
            System.out.println("sayı 10 dan büyük");
        }
        if(number2 %2==0){
            System.out.println("sayı çift");
        }
        else{
            System.out.println("sayı tek");
        }
        if(number2 >2 && number2 <=4){
            System.out.println("sayı 2 ve 4 arasında");
        }
        if(number2 <10 || number2 %2==0){
            System.out.println("sayı cift veya 10 dan küçük");
        }
    }
}
