package app;

import io.jooby.annotations.*;

@Path("/index")
public class Index {

  @GET
  public String sayHi() {
    return "Bem-vindos a nossa api calculadora!";
  }
}
