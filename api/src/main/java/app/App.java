package app;

import io.jooby.Jooby;

public class App extends Jooby {

  {
    mvc(new Divisao());
    mvc(new Index());
    mvc(new Subtracao());
    mvc(new Multiplicacao());
    mvc(new Adicao());
  }

  public static void main(final String[] args) {
    runApp(args, App::new);
  }

}
