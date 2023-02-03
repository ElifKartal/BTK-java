package Methods;

public class Methods {
    public static void main(String[] args) {
        printHello();
        print("merhaba");
        int x= sayiToplayici(2, 5);
        printNumbersTo(10);
    }

     public static void printHello() {
        System.out.println("Hello");
     }

     public static void print(String yazilacak){
        System.out.println(yazilacak);
     }
     public static int sayiToplayici(int sayi1, int sayi2) {
        return sayi1 +sayi2;
     }

     public static void printNumbersTo(int sayi){
        String sonuc;
        for (int i = 0; i < sayi; i++) {
             sonuc += i + ", ";
        }
        sonuc = sonuc.substring(0, sonuc.length() - 2);
        System.out.println(sonuc);
     }
}
