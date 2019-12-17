import java.util.Scanner;

public class Exercici_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una palabra: ");
        String palabra = sc.nextLine();
        System.out.println("Dime una letra: ");
        char letra = sc.nextLine().charAt(0);
        int count = 0;

        for (int i = 0; i < palabra.length(); i++) {
            if (letra == palabra.charAt(i)) {

                count++;
            }
        }

        System.out.println("El numero de " + letra + " dentro de " + palabra + " es " + count);
    }
}
