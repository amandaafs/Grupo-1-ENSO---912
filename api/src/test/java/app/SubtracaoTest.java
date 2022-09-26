package app;

import org.junit.jupiter.api.Test;

import io.jooby.exception.BadRequestException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;

public class SubtracaoTest {

    Subtracao subtracao;

    @BeforeEach
    public void before(){
        subtracao = new Subtracao();
    }
    
    @Test
    public void verificaCasoBase(){
        double resultado = subtracao.subCalcula("4","3");
        assertEquals(1.0, resultado);
    }

    @Test
    public void verificaNumeroDecimal(){
        double resultado = subtracao.subCalcula("4.369","3.5");
        assertEquals(0.86, resultado, 0.01);
    }

    @Test
    public void verificaNumeroNegativo(){
        double resultado = subtracao.subCalcula("-4","-3");
        assertEquals(-1.0, resultado);
    }

    @Test
    public void verificaOperadorInvalido(){
        assertThrows(BadRequestException.class, ()->{
           subtracao.subCalcula("a", "3");
        });
    }
    
}
