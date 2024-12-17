
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;


public class Main {
    public static void main(String[] args) throws IOException {
        final ServerSocket server = new ServerSocket(8080); // used to recieve connections in the server application
        System.out.println("Listening on port 8080 ...");

        while (true) {
            // final Socket client = server.accept();
            //InputStreamReader isr
            //        = new InputStreamReader(client.getInputStream());
            //BufferedReader reader = new BufferedReader(isr);
            //String line = reader.readLine();
            //while (!line.isEmpty()) {
            //    System.out.println(line);
            //    line = reader.readLine();
            //}
            try (Socket socket = server.accept()) { // socket send and receive from clients
                Date today = new Date();
                String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today;
                socket.getOutputStream().write(httpResponse.getBytes("UTF-8"));
            }
        }
    }
}