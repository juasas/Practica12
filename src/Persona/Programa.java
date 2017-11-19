package Persona;

//Apartado1 de la práctica12

public class Programa {

	public static void main(String[] args) {
		/* TODO Auto-generated method stub
		   Valores nuevos para modificar los 
		   atributos del objeto p2 de la clase persona */
		
		String nuevoNombre = "Pepe Antonio";
		int nuevaEdad = 30;
		
		/* Declaración de los objetos p1 y p2 de la clase Persona
		   se usan los dos constructores creados */
		
		Persona p1 = new Persona();
		Persona p2 = new Persona("Jose", 39);
		
		// Se muestran los atributos de los objetos
		
		System.out.println("Datos persona 1: Nombre:" + p1.getNombre()+
				"; Edad:" + p1.getEdad() + ".");
		
		System.out.println("Datos persona 2: Nombre:" + p2.getNombre()+
				"; Edad:" + p2.getEdad() + ".");
		
		// Se modifican los atributos del objeto p1 de la clase Persona
		
		p1.setNombre(nuevoNombre);
		p1.setEdad(nuevaEdad);
		
		// Se muestran los nuevos atributos del objeto p1
		
		System.out.println("Nuevos datos persona 1: Nombre:" + p1.getNombre()+
				"; Edad:" + p1.getEdad() + ".");
	} // main //
} // class Programa //
