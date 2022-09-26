package app;

import org.junit.jupiter.api.Test;

import io.jooby.exception.BadRequestException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;

public class DivisaoTest {

    Divisao divisao;

    @BeforeEach
    public void before(){
        divisao = new Divisao();
    }

    @Test
    public void verificacaoCasoBase(){
        double resultado = divisao.divCalcula("10", "5");
        assertEquals(2.0, resultado);
    }

    @Test
    public void verificaNumeroNegativo(){
        double resultado = divisao.divCalcula("-10", "2");
        assertEquals(-5,resultado);
    }

    @Test
    public void verificaNumeroDecimal(){
        double resultado = divisao.divCalcula("1", "3");
        assertEquals(0.33, resultado,0.01);
    }

    @Test
    public void verificaDivisaoPorZero(){
        assertThrows(BadRequestException.class, ()->{
            divisao.divCalcula("5", "0");
         });
    }

    @Test
    public void verificaOperadorInvalido(){
        assertThrows(BadRequestException.class, ()->{
            divisao.divCalcula("a", "7");
        });
    }
}
