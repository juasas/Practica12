package Persona;

//Apartado1 de la práctica12

public class Persona {
	
	// Definición de varibles privadas//
	
	private String nombre;
	private int edad;
	
	/* Persona constructor sin parametros
	Inicializa el objeto de la clase Persona con nombre = "Anónimo" y edad = 18 */
	
	public Persona () {
		this.nombre = "Anónimo";
		this.edad = 18;
	} // Constructor sin parámetros //
	
	/* Persona constructor con dos parámetros
	Inicializa el objeto de la clase Persona con nombre y edad introducidos como parámetros */
	
	public Persona (String parametro1, int parametro2) {
		this.nombre = parametro1;
		this.edad = parametro2;
	} // Constructor con dos parámetros //
	
	/* Métodos getter //
	
	Método getNombre para devolver el nombre */
	
	public String getNombre () {
		 return (nombre);
	} // Método getNombre //
	
	// Método getEdad para devolver la edad //
	
	public int getEdad () {
		return (edad);
	} // Método getEdad
	
	// Métodos setter //
	
	// Método setNombre para modificar nombre //
	
	public void setNombre (String n) {
		this.nombre = n;
	} // Método setNombre //
	
	// Método setEdad para modificar edad //
	
	public void setEdad (int e) {
		this.edad = e;
	} // Método setEdad //
	
} // class Persona //
 