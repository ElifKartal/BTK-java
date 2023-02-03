import java.util.Scanner;

public class Hesapmakinesi {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("İşlem yapacağınız sayıları girin: ");
        double number1, number2;
        number1= scan.nextInt();
        number2 = scan.nextInt();
        double islem;
        System.out.println("İşelmi girin(1.Toplama, 2:çıkarma, 3:ÇArpma, 4: Bölme):");
        islem=scan.nextInt();
        double sonuc= 0;
        // switch (islem) {
        //     case 1:
        //         sonuc =number1 +number2 ;
        //         break;
        //     case 2:
        //     sonuc =number1 -number2 ;
        //         break;
        //     case 3:
        //     sonuc =number1 *number2 ;
        //         break;
        //     case 4:
        //         sonuc =number1 /number2 ;
        //             break;
            
        // }
        if(islem == 1){
            sonuc =number1 +number2;
        }else if(islem ==2 ){
            sonuc =number1 -number2;
        }else if(islem ==3 ){
            sonuc =number1 *number2;
        }else if(islem ==4 ){
            sonuc =number1 /number2;
        }
        System.out.println("Sonuç:" + sonuc);
        
    }
}
