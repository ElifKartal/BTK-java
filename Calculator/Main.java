package Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator =new Calculator();
        System.out.println("toplama sonucu:" +calculator.toplam(2,5,7));
        System.out.println("cikarma sonucu:"+ calculator.cikarma(5, 2.5));
        System.out.println("Faktoriyel sonucu:" + calculator.faktoriyel(5));
        System.out.println("İslem sayisi:"+ Calculator.getIslemSayisi());

        Calculator yeniHesapMakinesi =new Calculator();
        System.out.println(yeniHesapMakinesi.getIslemSayisi());

        Kare kare= new Kare(6);
        System.out.println(kare.alan());
        Dikdortgen dikdortgen= new Dikdortgen(6, 6);
        System.out.println(dikdortgen.cevre());


        Calculator.getIslemSayisi();
    }
}
