package Calculator;
import java.util.Scanner;

import javax.net.ssl.KeyManager;

public class Calculator extends Sekil {
    private static int islemSayisi=0;

    public double toplam(double sayi1, double sayi2){
        islemSayisi++;
        return sayi1 + sayi2;

    }

    public double toplam(double sayi1, double sayi2, double sayi3){
        islemSayisi++;
        return sayi1 + sayi2 + sayi3;
    }
    public double cikarma(double sayi1, double sayi2){
        islemSayisi++;
        return sayi1 - sayi2;

    }
    public double cikarma(double sayi1, double sayi2, double sayi3){
        islemSayisi++;
        return sayi1 - sayi2 - sayi3;
    }
    public double carpma(double sayi1,double sayi2){
        islemSayisi++;
        return sayi1 * sayi2;
    }
    public double carpma(double sayi1, double sayi2, double sayi3){
        islemSayisi++;
        return sayi1 * sayi2 * sayi3;
    }
    public double bolme(double sayi1,double sayi2){
        islemSayisi++;
        return sayi1 / sayi2;
    }
    public double bolme(double sayi1, double sayi2, double sayi3){
        islemSayisi++;
        return sayi1 / sayi2 / sayi3;
    }


    public double faktoriyel (double sayi){
        if(sayi== 0){
            return 1;
        }
        return sayi* faktoriyel(sayi-1);
    
    }

    public double SekilAlaniniBul(Sekil sekil){
        
        return sekil.alan;

    
    }
    public double sekilCevresiniBul(Sekil sekil){
        
        return sekil.cevre;

    
    }
    public double cevresiniBul(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("hangi şekil");
        String cevap=scanner.nextLine();
        Sekil sekil;
        if(cevap.equals("kare")){
            System.out.println("Kare kenar uzunluğu:");
            sekil= new Kare(kenar);
            sekil.cevre();
        }


    }
    public static int getIslemSayisi(){
        return islemSayisi;
    }
}
