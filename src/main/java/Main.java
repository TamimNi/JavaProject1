
import server.Server;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Server server = new Server();
        try {
            server.start(10001);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("dasdasda");
    }
}