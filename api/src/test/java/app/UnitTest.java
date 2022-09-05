package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTest {
  @Test
  public void welcome() {
    Index index = new Index();
    assertEquals("Welcome to Jooby!", index.sayHi());
  }
}
