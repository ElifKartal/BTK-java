import java.util.Scanner;

import java.util.Scanner;
public class ParaSaymaMakinesi {
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        System.out.println("Bir sayı gir: ");
        int number= keyboard.nextInt();
        int birkurus, bes, on , yirmibes, elli;
        elli =number / 50;
        number =number % 50;

        yirmibes =number / 25;
        number =number % 25;
        
        on =number / 10;
        number =number % 10;
        
        bes =number / 5;
        number =number % 5;
        
        birkurus =number / 1;
        
        number =number % 1;
        
        System.out.println("Elli sayisi:" + elli);
        
        System.out.println("Yirmibes sayisi:" + yirmibes);
        
        System.out.println("on sayisi:" + on);
        
        System.out.println("bes sayisi:" + bes);
        
        System.out.println("bir sayisi:" + birkurus);
        keyboard.close();

    }
}
