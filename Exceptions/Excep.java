public class Excep{
    public static void main(String[] args) {
        
        try {
            
            int[] array = new int[5];
            array[6]=2;
            int x = 5/0;
            System.out.println("devam");
        }catch(ArithmeticException e){
            System.out.println("aritmetik hata");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array");
        }
    }

}