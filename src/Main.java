import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısını giriniz :");
        double n = input.nextInt();
        double sonuc = 0;
        while (n > 0) {
            sonuc += (1 / n);
            n--;
        }

        System.out.println(sonuc);
    }
}