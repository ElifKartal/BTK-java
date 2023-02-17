import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Dosya {
    public static void main(String[] args) {
        File dosyaFile = new File("C:/Users/Elif/Desktop/BTKjava/Dosyalar/text.txt");
        System.out.println(dosyaFile.exists());
        System.out.println(dosyaFile.getAbsolutePath());
        System.out.println(dosyaFile.getName());
        System.out.println(dosyaFile.getParentFile());
        System.out.println(dosyaFile.setLastModified(16766503550000l));
        Scanner inputStream = null;
        Scanner javaInputStream = null;
        try {
             inputStream =new Scanner(dosyaFile);
             javaInputStream =new Scanner(new File("Dosyalar.java"));
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");
        }
        System.out.println(inputStream.nextLine());
        System.out.println(javaInputStream.next());
        



    }
    
    
}
