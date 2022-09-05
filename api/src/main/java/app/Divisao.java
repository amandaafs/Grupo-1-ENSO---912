package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

@Path("/divisao/{n1}/{n2}")
public class Divisao {

  @GET
  public double divCalcula(@PathParam("n1") String n1Stg, @PathParam("n2") String n2Stg) {
    try{
        double n1 = Double.parseDouble(n1Stg);
        double n2 = Double.parseDouble(n2Stg);
        if(n2==0){
            throw new BadRequestException("Não há resposta para divisao com zero");
        }
        return (n1/n2);

    }catch (NumberFormatException nfe){

        throw new BadRequestException("Operador inválido!");
    }
  }
}