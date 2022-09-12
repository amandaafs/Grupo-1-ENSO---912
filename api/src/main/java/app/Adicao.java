package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

@Path ("/adicao/{ad}/{ad2}")
public class Adicao{
    @GET
    public double adcCalcula (@PathParam("ad") String adicaoStr, @PathParam ("ad2") String adicao2Str){
        try {
            double ad = Double.parseDouble(adicaoStr);
            double ad2 = Double.parseDouble(adicao2Str);
            return (ad+ad2);
        }catch (NumberFormatException nfe){
            throw new BadRequestException("Operação inválida!");
        }
    }
}