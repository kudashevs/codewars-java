package kyu8.jennys_secret_message;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GreeterTest {
    @Test
    public void Test() {
        assertEquals("Hello, Jim!", Greeter.greet("Jim"));
        assertEquals("Hello, Jane!", Greeter.greet("Jane"));
        assertEquals("Hello, Simon!", Greeter.greet("Simon"));
        assertEquals("Hello, my love!", Greeter.greet("Johnny"));
    }
}