package com.krakedev.ejemplojunit;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    
    @Test
    public void testSumar() {
    	Calculadora calculadora = new Calculadora();
    	int resultado = calculadora.sumar(5, 10);
    	assertTrue(resultado == 15);
    	resultado = calculadora.restar(10, 5);
    	assertTrue(resultado == 5);
    }

}
