package factorprimo;
import java.util.Scanner;  
public class factores {

	public static void main(String[] args) {
		 int factor;
		
	        Scanner numeros = new Scanner(System.in);                    //llamamos numeros  a la variable lee el scanner
	        System.out.println("Numero a descomponer: ");        //Imprimimos un mensaje para que la persona ingrese el numero deseado
	        int numero =numeros.nextInt();                                //la variable que entra se anota como un numero entero

	        for (factor=2; factor<=numero; factor++) {                //factor empieza en 2 en cada while mientras se pueda dividir entre dos
	            while (numero%factor==0) {
	                float numero2=(numero/factor);                    // se crea la variable numero2 para llevar a cabo una igualacion en la terminal
	            	System.out.println(numero+"="+numero2+" x " + factor);    //Se imprime cada resultado dentro del ciclo while
	                
	                numero/=factor;  // se comprueba que el numero sea diferente al factor para decidir seguir con el ciclo o salirse de este 
	            }
	             
	        }

	    }

	
	

}
