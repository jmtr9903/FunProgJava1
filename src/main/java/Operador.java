
import java.util.Scanner;
public class Operador { 
    public static void main(String[] args) {
        
        int numero1;
        int numero2;
        int Sumatotal;
        int resta;
        int multiplicacion;
        double division;
        double raiz;
        
        Scanner scanner = new Scanner(System.in);
        
        //Numero 1 que le solicitamos al usuario
        System.out.println("Ingresa un numero: ");
        
        numero1= scanner.nextInt();
        
        //numero 2 que le solicitamos al usuario
        
        System.out.println("Ingresa el segundo numero: ");
        numero2= scanner.nextInt();
        
        //Los dos numeros que ingres el usuario se sumaran
        Sumatotal= numero1 + numero2;
        
        System.out.println("La suma total es: "+ Sumatotal);
        
         //Los dos numeros que ingres el usuario se restaran
        resta= numero1 - numero2;
        
        System.out.println("La resta total es: "+ resta);
         //Los dos numeros que ingres el usuario se multiplicaran
        multiplicacion= numero1 * numero2;
        
        System.out.println("El total de la multiplicacion es: "+ multiplicacion);
       
        //Los dos numeros que ingres el usuario se realizara la division
        division= numero1 / numero2;
        
        System.out.println("El total de la division es: "+ division);
        
        //raiz cuadrada del primer numero
        raiz = Math.sqrt(numero1);
        
        System.out.println("La raiz del primer numero es: "+ raiz);
        
        //raiz cuadrada del segundo numero
        raiz = Math.sqrt(numero2);
        
        System.out.println("La raiz del segundo numero es: "+ raiz);
        
    } 
}
