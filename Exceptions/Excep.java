public class Excep{
    public static void main(String[] args) {
        
        try {
            
            int[] array = new int[5];
            int  x = 5/0;
            array[6]=2;
            
            System.out.println("devam");
        }catch(ArithmeticException e){
            System.out.println("aritmetik hata");
            System.out.println(e.toString());
            System.out.println(e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array");
        }finally{
            System.out.println("çikti");
        }
        System.out.println("------------------------");

        try {
            int x = 5;
            int y = 0;
            if(y==0){
                throw new MyException("elif");
            }

            int z =x/y;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }finally{
            System.out.println("Try-catch den çiktim");
        }
    }

}