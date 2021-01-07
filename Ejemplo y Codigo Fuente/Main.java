import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
	
		MetodosAuxiliares metodos = new MetodosAuxiliares();
		
		//Bug 1, bucle infinito
		boolean variable1 = true;
		int contador1 = 0;
		
		while(variable1) {
			contador1++;
		}
		
    	//Bug 2, booleano asignado como null
    	boolean nulo = (Boolean) null;
    	
    	//Bug 3, tipos no relacionados
    	boolean equals = metodos.equals("hola");
    	
    	//Bug 4, asignar variable en expresion booleana
    	boolean falso = false;
    	if(falso = true) {
    		System.out.println("Soy inutil");
    	}
	}
}
