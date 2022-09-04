package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

@Path("/subtracao/{op}/{op2}")
public class Subtracao {

    @GET 
    public double subCalcula(@PathParam("op") String opStr, @PathParam("op2") String op2Str){
        try{
            double op = Double.parseDouble(opStr);
            double op2 = Double.parseDouble(op2Str);
            return (op-op2);
        }catch (NumberFormatException nfe){
            throw new BadRequestException("Operador inválido!");

        }
    }
    

    
    
}
