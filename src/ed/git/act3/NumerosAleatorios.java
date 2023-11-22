package ed.git.act3;
import java.util.Random;
public class NumerosAleatorios {
	
	  public static void main(String[] args) {
	        mostrarNumerosAleatorios();
	    }
	    public static void mostrarNumerosAleatorios() {
	        Random rand = new Random();
	        System.out.println("20 números aleatorios entre 1 y 10:");
	        for (int i = 0; i < 20; i++) {
	            int numeroAleatorio = rand.nextInt(10) + 2; // Genera un numero entre 1 y 10
	            System.out.print(numeroAleatorio + " ");
	        }
	    }
	}