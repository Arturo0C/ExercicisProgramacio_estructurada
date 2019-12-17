import java.util.Scanner;

public class Exercici_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una palabra en minuscula: ");
        String palabra = sc.nextLine();
        String result = "";

        for (int i = 0; i < palabra.length(); i++) {
           if (i > 'a' && i < 'z') {
               continue;
           } else {
               result += (char) (palabra.charAt(i) + 'A' - 'a');
           }
        }
        System.out.println(palabra + " passat a majúscules és: " + result);

        }
}

/*Escriu un programa que converteixi una paraula a majúscules, sense emprar el
mètode «toUpperCase» de la classe String.*/
