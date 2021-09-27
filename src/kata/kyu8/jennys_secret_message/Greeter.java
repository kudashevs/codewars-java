package kyu8.jennys_secret_message;

public class Greeter {
  public static String greet(String name) {
    return String.format("Hello, %s!", name.equals("Johnny") ? "my love" : name);
  }
}