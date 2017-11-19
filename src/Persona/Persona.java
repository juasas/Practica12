package Persona;

//Apartado1 de la pr�ctica12

public class Persona {
	
	// Definici�n de varibles privadas//
	
	private String nombre;
	private int edad;
	
	/* Persona constructor sin parametros
	Inicializa el objeto de la clase Persona con nombre = "An�nimo" y edad = 18 */
	
	public Persona () {
		this.nombre = "An�nimo";
		this.edad = 18;
	} // Constructor sin par�metros //
	
	/* Persona constructor con dos par�metros
	Inicializa el objeto de la clase Persona con nombre y edad introducidos como par�metros */
	
	public Persona (String parametro1, int parametro2) {
		this.nombre = parametro1;
		this.edad = parametro2;
	} // Constructor con dos par�metros //
	
	/* M�todos getter //
	
	M�todo getNombre para devolver el nombre */
	
	public String getNombre () {
		 return (nombre);
	} // M�todo getNombre //
	
	// M�todo getEdad para devolver la edad //
	
	public int getEdad () {
		return (edad);
	} // M�todo getEdad
	
	// M�todos setter //
	
	// M�todo setNombre para modificar nombre //
	
	public void setNombre (String n) {
		this.nombre = n;
	} // M�todo setNombre //
	
	// M�todo setEdad para modificar edad //
	
	public void setEdad (int e) {
		this.edad = e;
	} // M�todo setEdad //
	
} // class Persona //
 