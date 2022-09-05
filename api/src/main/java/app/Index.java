package app;

import io.jooby.annotations.*;

@Path("/")
public class Index {

  @GET
  public String sayHi() {
    return "Welcome to Jooby!";
  }
}
