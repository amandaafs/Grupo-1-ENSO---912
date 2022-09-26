package app;

import org.junit.jupiter.api.Test;

import io.jooby.exception.BadRequestException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;

public class MultiplicacaoTest {

    Multiplicacao multiplicacao;

    @BeforeEach
    public void before(){
        multiplicacao = new Multiplicacao();
    }
    
    @Test
    public void verificaCasoBase(){
        double resultado = multiplicacao.multcalcula("5","5");
        assertEquals(25.0, resultado);
    }

    @Test
    public void verificaResultadoDecimal(){
        double resultado = multiplicacao.multcalcula("8.682","12.5");
        assertEquals(108.52, resultado, 0.01);
    }

    @Test
    public void verificaResultadoNegativo(){
        double resultado = multiplicacao.multcalcula("-6","-8");
        assertEquals(48, resultado);
    }

    @Test
    public void verificaOperadorInvalido(){
        assertThrows(BadRequestException.class, ()->{
            multiplicacao.multcalcula("2", "f");
        });
                    }
    
}
