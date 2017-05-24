import java.io.Console;
import java.util.List;

public class App {
  public static void main(String[] args) {
    System.out.println("I'm a ping-pong application!");

    Console myConsole = System.console();
    System.out.println("Enter a number:");
    int intUserNumber = Integer.parseInt(myConsole.readLine());

    PingPong pingPong = new PingPong();
    List<Object> pingPongResult = pingPong.runPingPong(intUserNumber);
    System.out.println(pingPongResult);
  }
}
