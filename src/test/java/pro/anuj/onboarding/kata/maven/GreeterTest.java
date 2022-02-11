package pro.anuj.onboarding.kata.maven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreeterTest {

  private final Greeter greeter = name -> "";

  @Test
  public void testGreet() {
    assertEquals(greeter.greet("World"), "Hello World!");
  }
}
