package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

@Path("/divisao/{x}/{y}")
public class Divisao {

  @GET
  public double divCalcula(@PathParam("x") String n1Stg, @PathParam("y") String n2Stg) {
    try{
      double x = Double.parseDouble(n1Stg);
      double y = Double.parseDouble(n2Stg);
      if(y==0){
        throw new BadRequestException("Não há resposta para divisão com zero");
      }
      return (x/y);
    }catch (NumberFormatException nfe){
      throw new BadRequestException("Operador inválido!");
    }
  }
}