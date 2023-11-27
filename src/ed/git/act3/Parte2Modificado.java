package ed.git.act3;
import java.util.Scanner;
public class Parte2Modificado {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Introduce el primer n�mero entero: ");
	        int num1 = scanner.nextInt();
	        
	        System.out.print("Introduce el segundo n�mero entero (distinto al primero): ");
	        int num2 = scanner.nextInt();
	        
	        // Validar que los n�meros sean distintos
	        while (num1 == num2) {
	            System.out.println("Los n�meros deben ser distintos. Introduce el segundo n�mero de nuevo: ");
	            num2 = scanner.nextInt();
	        }
	        
	        // Determinar cu�l es el menor de los n�meros introducidos
	        int menor = Math.min(num1, num2);
	        int mayor = Math.max(num1, num2);
	        
	        System.out.print("Introduce un tercer n�mero: ");
	        int num3 = scanner.nextInt();
	        
	        System.out.println("Los n�meros enteros entre " + menor + " y " + mayor + ", incrementando de 7 en 7 son:");
	        
	        // Imprimir los n�meros entre el menor y el mayor, incrementando de 7 en 7
	        for (int i = menor; i <= mayor; i += 7) {
	            // Si el tercer n�mero est� entre el primero y el segundo, imprimirlo
	            if (i < num3 && num3 < mayor) {
	                System.out.println(num3);
	            }
	            System.out.println(i);
	        }
	        
	        scanner.close();
	    }
	}


