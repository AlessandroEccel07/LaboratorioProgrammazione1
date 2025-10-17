public class VerificaCodiceProdotto {
    public static void main(String[] args) {

        for (String arg : args) {
            try {
                double numero = Double.parseDouble(arg);
                System.out.println("Numero valido: " + numero);
            } catch (NumberFormatException e) {
                System.out.println("Valore non valido: \"" + arg + "\"");
            }
        }
        System.out.println("Fine del programma.");
    }
}