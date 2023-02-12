
public class Sartlar {
    public static void main(String[] args) {
        double x=5.5;
        double y =5.5;
        if(x==y){
            System.out.println("Eşit");
        }
        else if(x<y){
            System.out.println("küçük");
        }
        else{
            System.out.println("büyük");
        }
        //boolean esitlik =(x==y);
        
        //String string1= "yazı";
        //String string2= "yazı";
        //if (string1 == string2){
          //  System.out.println("iki string eşit");

        //}
        int number =3;
        switch (number) {
            case 1:
                System.out.println("ilk yer");
                break;
        
            case 2:
                System.out.println("ikinci yer");
                break;
            default:
                System.out.println("switch");
                break;

        }
        char char1 ='a';
        System.out.println((char)(char1));
        System.out.println((char)(char1+1));
    }
}
