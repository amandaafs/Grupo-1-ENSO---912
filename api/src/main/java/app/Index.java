package app;

import io.jooby.annotations.*;

@Path("/index")
public class Index {

  @GET
  public String sayHi() {
    return "Seja bem-vindo!";
  }
}
