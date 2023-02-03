import java.util.Scanner;

public class Islemler {  
    private static Scanner keyboard =new Scanner(System.in);
    public static void main(String[] args) {
        
        // double x =Math.pow(4,5);
        // System.out.println(x);

        //Hipotenüs
        
    // double a,b,c;
    // while(true){
    //     System.out.println("ucgenin iki kısa kenarını girin: ");
    //     a=keyboard.nextDouble();
    //     b=keyboard.nextDouble();
    //     keyboard.nextLine();
    //     c=Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    //     System.out.println("hipotenus: " + c);
    //     System.out.println("Birdaha hesaplamak istiyor musunuz?(yes:y no:n)");
    //     String cevap =keyboard.nextLine();
    //     if(cevap .equals("n")){
    //         break;
    //     }
   
   
    //}
    double sonuc= hipotenus();
    System.out.println("son sonuc " +sonuc);
    keyboard.close();

    }
    public static double hipotenus(){
         double a,b,c;
         while(true){
            System.out.println("ucgenin iki kısa kenarını girin: ");
            a=keyboard.nextDouble();
            b=keyboard.nextDouble();
            keyboard.nextLine();
            c=Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            System.out.println("hipotenus: " + c);
            System.out.println("Birdaha hesaplamak istiyor musunuz?(yes:y no:n)");
            String cevap =keyboard.nextLine();
            if(cevap .equals("n")){
            return c;
        
        }

       }
   
    }
    
}
