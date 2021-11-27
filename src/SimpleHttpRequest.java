import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SimpleHttpRequest {

    public static void main(String[] args) {

        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/todos/1");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type","application/json");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            StringBuffer stringBuffer = readInputStream(connection);
            System.out.println(stringBuffer);
            connection.disconnect();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    public static StringBuffer readInputStream(HttpURLConnection con) {
        try {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();

            return content;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
