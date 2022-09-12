package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

@Path ("/multiplicacao/{mult1}/{mult2}")
public class Multiplicacao {
    @GET 
    public double  multcalcula (@PathParam("mult1") String multStr, @PathParam("mult2") String mult2Str){
        try{
            double mult1= Double.parseDouble(multStr);
            double mult2= Double.parseDouble(mult2Str);
            return (mult1*mult2);
        }catch (NumberFormatException nfe){
            throw new BadRequestException ("Operador inválido!");
        }
    }
    
}
