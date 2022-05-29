//--------> TPersona

class TPersona{
	//ATRIBUTOS
	private String nombre;
	private int edad;
	
	//METODOS
	TPersona(){
		nombre = "";
		edad = 0;
	}
	
	TPersona(String nombre, int edad){
		setNombre(nombre);
		setEdad(edad);
	}
	
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setEdad(int edad){
		this.edad = edad;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	@Override
	public String toString(){
		String cadena;
		
		cadena = "Nombre: " + nombre + "\n" + 
		"Edad: " + Integer.toString(edad) + "\n";
		return cadena;
	}
}//FIN CLASE TPersona
