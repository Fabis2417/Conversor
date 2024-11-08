import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public record Converter() {
    public static class ConversorMoedas {

        public static void converter(String moedaBase, String moedaDestino) throws Exception {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o valor em " + moedaBase + ": ");
            double valor = scanner.nextDouble();

            String apiKey = "e03814d2468c9d826e9785ee";
            String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + moedaBase + "/" + moedaDestino + "/" + valor;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            Conversao conversao = gson.fromJson(response.body(), Conversao.class);

            System.out.println(valor + " " + (moedaBase) + " corresponde a " + conversao.conversion_result + " " + (moedaDestino));
            for (int k = 0; k < 40; k++) {
                System.out.print("*");
            }
            System.out.println();

        }

        static class Conversao {
            public double conversion_result;
        }
    }
}
