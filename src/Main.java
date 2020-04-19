
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        /*
        
        Kullanıcıdan aldığınız boy ve kilo degerlerine göre kullanıcının beden kitle indeksinin bulunuşu.
        Beden Kitle İndeksi: (Kilo / (boy * boy))
        
        */
        Scanner sca = new Scanner(System.in);
        
        System.out.println("Boyunuz:(Örneğin:1,78) ");
        double boy = sca.nextDouble();
        
        System.out.println("Kilonuz:(Örneğin:65) ");
        int kilo = sca.nextInt();
        
        System.out.println("Boy Kilo Endeksiniz: " + (kilo / (boy * boy)));
    }
}
