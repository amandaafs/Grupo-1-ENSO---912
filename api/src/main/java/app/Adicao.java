package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

@Path ("/adicao/{adicao}/{adicao2}")
public class Adicao{
    @GET
    public double adcCalcula (@PathParam("adicao") String adicaoStr, @PathParam ("adicao2") String adicao2Str){
        try {
            double adicao = Double.parseDouble(adicaoStr);
            double adicao2 = Double.parseDouble(adicao2Str);
            return (adicao+adicao2);
        }catch (NumberFormatException nfe){
            throw new BadRequestException("Operação inválida!");
        }
    }
}