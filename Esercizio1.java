import java.util.Scanner;
public class Esercizio1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        
        String prompt = ("Inserisci un numero: ");
        
        int value;
        double somma=0;
        double media=0;
        int n=0;
        do { 
        	System.out.print(prompt);
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Il valore immesso non è valido!");
                System.out.println(prompt);
            }
            value = scanner.nextInt();
                if (value>0) {
                    somma +=value;
                    n++;
                    media=(somma/n);
                }    
                
        }while(value >=0);
            System.out.println("La somma dei numeri inseriti è: " +somma);
            System.out.println("La media dei numeri inseriti è: " +media);
    }

}