import java.util.Random;
import java.util.Scanner;
public class Indovina {
    public static void VerificaNumero(int numero) {
        if (numero > 100 || numero < 0) {
            throw new IllegalArgumentException("Il numero deve essere da 1 e 100.");
        }
    }
        public static void main(String[] args) {
            Random random = new Random();
            int CasualNumber = random.nextInt(100);
            int Number = CasualNumber + 1;
            Scanner input = new Scanner(System.in);
            boolean vero = false;
            while (vero == false) {
                System.out.print("Inserisci un numero da 1 a 100: ");
                int numero = Integer.parseInt(input.nextLine());
                try {VerificaNumero(numero);}
                catch (IllegalArgumentException e) {

                    System.err.println("Errore: " + e.getMessage());
                    continue;
                }
                if (numero == Number) {
                    System.out.println("Hai indovinato il numero é: " + Number);
                    vero = true;
                    input.close();
                } else if (numero > Number) {
                    System.out.println("Troppo Alto!!!");
                } else if (numero < Number) {
                    System.out.println("Troppo Basso!!!");
                }
            }


        }
    }

