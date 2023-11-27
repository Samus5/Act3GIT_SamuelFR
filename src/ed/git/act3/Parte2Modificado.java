package ed.git.act3;
import java.util.Scanner;
public class Parte2Modificado {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Introduce el primer número entero: ");
	        int num1 = scanner.nextInt();
	        
	        System.out.print("Introduce el segundo número entero (distinto al primero): ");
	        int num2 = scanner.nextInt();
	        
	        // Validar que los números sean distintos
	        while (num1 == num2) {
	            System.out.println("Los números deben ser distintos. Introduce el segundo número de nuevo: ");
	            num2 = scanner.nextInt();
	        }
	        
	        // Determinar cuál es el menor de los números introducidos
	        int menor = Math.min(num1, num2);
	        int mayor = Math.max(num1, num2);
	        
	        System.out.print("Introduce un tercer número: ");
	        int num3 = scanner.nextInt();
	        
	        System.out.println("Los números enteros entre " + menor + " y " + mayor + ", incrementando de 7 en 7 son:");
	        
	        // Imprimir los números entre el menor y el mayor, incrementando de 7 en 7
	        for (int i = menor; i <= mayor; i += 7) {
	            // Si el tercer número está entre el primero y el segundo, imprimirlo
	            if (i < num3 && num3 < mayor) {
	                System.out.println(num3);
	            }
	            System.out.println(i);
	        }
	        
	        scanner.close();
	    }
	}


