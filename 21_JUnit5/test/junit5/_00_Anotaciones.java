package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author vened
 *
 * Esta clase seria un ejemplo de auto generada
 * (boton derecho -> new -> other -> JUnit Test Case
 * Aunque se pueden llamar como quieran los metodos, estos serian los 
 * nombres recomendados
 *
 */
class _00_Anotaciones {

	//Tenemos metodos que se ejecutaran en distinto momentos del ciclo de vida de una
	//clase de pruebas
	
	//El ciclo de vida de una clase de pruebas, sera la ejecuci�n de todos los metodos
	//anotados con @Test. Pero tambien tenemos otras anotaciones que se ejecutaran
	
	//Este metodo con la anotacion @BeforeAll se va a ejecutar ANTES de TODOS los 
	//Test (metodos anotados con @Test). Esta anotacion es unica
	//Ejemplo, se ejecutara antes del test1 y solo esa vez
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		//aqui suelen inicializarse valores o objetos que vayan a ser utilizados por todo nuestro programa
		//o tambien en un momento dado conexiones a la BBDD
		
		//Si quereis que algun metodo no haga nada, simplemente lo dejais vacio
	}

	//Este m�todo con la anotacion @AfterAll sera ejecutado DESPUES de TODOS los test
	//Ejemplo, se ejecutara despues del test2 y solo esa vez
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		//Cerrar conexiones con BBDD, cerrar ficheros,...
	}

	//Este m�todo con la anotacion @BeforeEach sera ejecutado ANTES de cada UNO de los TEST
	//Ejemplo, se ejecutara antes de test1 y antes de test2 (2 veces)
	@BeforeEach
	void setUp() throws Exception {
	}

	//Este m�todo con la anotacion @AfterEach sera ejecutado DESPUES de cada UNO de los TEST
	//Ejemplo, se ejecutara despues del test1 y despues del test2
	@AfterEach
	void tearDown() throws Exception {
	}

	//Luego irian todos los test unitarios
	//Estos serian los metodos que ejecutaran las pruebas unitarios, son metodos con la anotacion
	//@Test, y podemos tener todos los metodos que queramos con esta anotacion
	@Test
	void test1() {
		//fail es un metodo que hace que falle la prueba unitaria
		fail("Not yet implemented");
	}

	@Test
	void test2() {
		//Si un test no da fallo, daria como bueno
		//fail("Not yet implemented");
	}
	
	//Ejemplo de ejecucion para esta clase
	//boton derecho sobre la clase -> Run us -> JUnit Test
	
	/*
	 * 1 BeforeAll
	 * 2 BeforeEach
	 * 3 test1
	 * 4 AfterEach
	 * 5 beforeEach
	 * 6 test2
	 * 7 afterEach
	 * 8 afterAll
	 */
	
}
