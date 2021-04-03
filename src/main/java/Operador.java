
import com.calculadora.implementacion.Calculadora;
import java.util.Scanner;
public class Operador { 
    public static void main(String[] args) {
        
        double numero1=0;
        double numero2=0;
        String operador="";
       double resultado=0;
        
        Scanner scanner = new Scanner(System.in);
        
        //Numero 1 que le solicitamos al usuario
        System.out.println("Ingresa un numero: ");
        
        numero1= scanner.nextDouble();
        
        //numero 2 que le solicitamos al usuario
        
        System.out.println("Ingresa el segundo numero: ");
        numero2= scanner.nextDouble();
        
         System.out.println("Ingresa el operador: ");
        operador= scanner.next();
        
       Calculadora calcu= new Calculadora();
       switch(operador){
           case "+":
               resultado= calcu.sumar(numero1, numero2);
               break;
               
           case "-":
              resultado= calcu.restar(numero1, numero2);
              break;
              
            case "/":
              resultado= calcu.dividir(numero1, numero2);
              break; 
              
            case "*":
              resultado= calcu.multiplicar(numero1, numero2);
              break;  
              
           default:
              System.out.println("El operador no existe!");
              return ;
       }
       
         calcu.sumar(numero1, numero2);
        System.out.println("El total es: "+ resultado);
        
       
        
    } 
}
