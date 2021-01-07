
public class MetodosAuxiliares {

	public int id;
	public String nombre;

	//Bug 5, equals siempre devuelve true
	public boolean equals(Object anObject) {		
		return true;
	}

	//Bug 6 y 7, se asigna una variable a si mismo y se almacena innecesariamente
	public void metodoCutre() {
		int id = 3;
		id = id;
	}

	//Bug 8, se pone tostring en vez de toString
	public String tostring() {
		return nombre;
	}

	//Bug 9, se pone equal en vez de equals
	public boolean equal(Object objeto) {
		return true;
	}
}
