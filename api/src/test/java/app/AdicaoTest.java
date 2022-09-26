package app;

import org.junit.jupiter.api.Test;

import io.jooby.exception.BadRequestException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;

public class AdicaoTest {

    Adicao adicao;

    @BeforeEach
    public void before(){
        adicao = new Adicao();
    } 

    @Test
    public void verificaCasoBase(){
            double resultado = adicao.adcCalcula("10", "10");
            assertEquals(20, resultado);
    }

    @Test
    public void verificaCasoDecimal(){
            double resultado = adicao.adcCalcula("6.47595", "3.2345");
            assertEquals(9.71, resultado, 0.01);
    }
    
    @Test
    public void verificaCasoNegativo(){
            double resultado = adicao.adcCalcula("-10", "5");
            assertEquals(-5, resultado);
    }

    @Test
    public void verificaOperadorInvalido(){
        assertThrows(BadRequestException.class, ()->{
            adicao.adcCalcula("c", "4");
        });
    }
}
