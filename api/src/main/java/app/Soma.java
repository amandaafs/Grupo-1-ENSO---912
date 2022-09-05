package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

@Path ("/soma/{ad}/{ad2}")
public class Soma{
    @GET
    public double adcCalcula (@PathParam("ad") String adStr, @PathParam ("ad2") String ad2Str){
        try {
            double ad = Double.parseDouble(adStr);
            double ad2 = Double.parseDouble(ad2Str);
            return (ad+ad2);
        }catch (NumberFormatException nfe){
            throw new BadRequestException("Operação inválida!");
        }
    }
}