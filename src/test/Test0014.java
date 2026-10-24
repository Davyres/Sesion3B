package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class Test0014 {
	private Cuenta cta12345;
	private Cuenta cta67890;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		// Inicialización de las cuentas
		cta12345 = new Cuenta(50);
		cta67890 = new Cuenta(0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		//1. Reintegro de 200€ de la cuenta 12345
		cta12345.reintegro(200);
		
		//2. Reintegro de 350€ de la cuenta 67890
		cta67890.reintegro(350);
		
		//3. Ingreso de 100€ en la cuenta 12345
		cta12345.ingreso(100);
		
		//4. Reintegro de 200€ de la cuenta 67890 (No debe restar, imprime error)
		cta67890.reintegro(200);
		
		//5. Reintegro de 150€ de la cuenta 67890
		cta67890.reintegro(150);
		
		//6. Reintegro de 200€ de la cuenta 12345
		cta12345.reintegro(200);
		
		//7. Ingreso de 50€ en la cuenta 67890
		cta67890.ingreso(50);
		
		//8. Reintegro de 100€ de la cuenta 67890 (No debe restar, imprime error)
		cta67890.reintegro(100);
		
		//Resultados esperados
		assertEquals(-250, cta12345.getSaldo());
		assertEquals(-450, cta67890.getSaldo());
	}
}
