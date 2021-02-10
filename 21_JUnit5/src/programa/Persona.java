package programa;

//Una vez que creamos una clase deberiamos de probar que TODOS sus metodos funcionan
//adecuadamente (excepto los getters y setters que suelen ser muy sencillos)
public class Persona {
	
	//ATRIBUTOS	
	/**
	 * El nombre de la persona
	 */
	private String nombre;
	private int edad;
	
	/**
	 * Posicion de la persona en el eje de las X dentro de una matriz
	 */
	private int posicion;
	
	//GETTER Y SETTER
	//Estos metodos no hace falta probarlos
	public String getNombre() {
		return nombre;
	}
	
	//Este en cambio si que har�a falta probarlo y documentarolo, ya que lo hemos cambiado
	/**
	 * Este metodo asiganar� el nombre a la propiedad nombre del objeto, pero unicamente cuando
	 * el nombre pasado tenga m�s de 3 caracteres. En caso contrario se le pondra el valor de 
	 * vacio ("")
	 * 
	 * @param nombre representa el nombre a dar de alta
	 */
	public void setNombre(String nombre) {
		if(nombre.length() > 3) {
			this.nombre = nombre;
		}else {
			this.nombre = "";
		}
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
		
	//METODOS
	/**
	 * Metodo que aumenta el atributo posicion actual en un numero entero de metros.
	 * @param metros representa el numero de metros que queremos incremetar
	 */
	public void caminar(int metros) {
		this.posicion += metros;
	}
	
	/**
	 * Metodo que copia una persona atributo por atribuo
	 * @return la persona copiada
	 */
	public Persona copiarPersona() {
		Persona p1 = new Persona();
		p1.setNombre(this.nombre);
		p1.setEdad(this.edad);
		p1.setPosicion(this.posicion);
		
		return p1;
	}
	
	/**
	 * Este metodo devuelve una referencia de que persona es mayor, si es mayor la persona
	 * que esta ejecutando el metodo, o es mayor la persona que se le pasa por parametro
	 * @param p persona pasada por parametro
	 * @return this en caso de que esta persona sea mayor, p en caso de que p sea la mayor
	 * En caso de que sean iguales devuelvo la refrencia p
	 */
	public Persona personaMayor(Persona p) {
		if(this.edad > p.edad) {
			return this;
		}else {
			return p;
		}
	}
	
	/**
	 * Calcula la distancia de un objeto persona respecto a una posicion en metros en valor
	 * absoluto
	 * No se admiten posiciones negativas
	 * @param posicion representa una posicion en el eje de las X
	 * @return la distancia en metros y absoluta de la posicion respecto al objeto. devolvemos 
	 * -1 en caso de que la posicion sea negativa
	 */
	public int calcularDistancia(int posicion) {
		if(posicion < 0) {
			return -1;//error, no se aceptan posiciones negativas
		}
		
		if(posicion < this.posicion) {
			return this.posicion - posicion;
		}else {
			return posicion - this.posicion;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + edad;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + posicion;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (edad != other.edad)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (posicion != other.posicion)
			return false;
		return true;
	}
	
}
