package entidad;

/**
 * Esto seria un comentario java doc, que sirve para documetar, y empiezan por "/**"
 * Podemos documentar principalmente clases, atributos y m�todos
 * 
 * Aqui iria una descripcion de lo que hace clase, con todo el nivel de detalle que se precise
 * 
 * En javadoc podemos poner anotaciones o etiquetas, cuya funci�n es la de separar o 
 * remarcar ciertas partes de la documentaci�n
 * 
 * Esta anotacion representar� el autor que ha hecho esta clase
 * @author Felix de Pablo Lobo
 * 
 * Esta anotacion representaria la version
 * @version 1.0
 *
 *///acaban asi los java doc :)
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//esto es un comentario de una linea y la funci�n es clarificar el codigo para
		//otros programadores
		/*
		 * esto seria un comentario de varias lineas
		 * otra linea
		 * otra mas
		 * 
		 */
		Persona p1 = new Persona();
		
		Matematicas m = new Matematicas();
		String s = new String("h");
		
		m.sumar(2, 5);
		m.restar(5, 6);
	}

}
