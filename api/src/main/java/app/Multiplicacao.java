package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

@Path ("/multiplicacao/{mult}/{mult2}")
public class Multiplicacao {
    
    @GET 
    public double  multcalcula (@PathParam("mult") String multStr, @PathParam("mult2") String mult2Str){
        try{
            double mult= Double.parseDouble(multStr);
            double mult2= Double.parseDouble(mult2Str);
            return (mult*mult2);
        }catch (NumberFormatException nfe){
            throw new BadRequestException ("Operador inválido!");
        }
    } 
}
