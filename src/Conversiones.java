import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversiones {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/3aeed8d7a1539d316a5c28c2/latest/";

    public static String convertir(String monedaInicial, String monedaFinal, double valor) {
        try {
            String direccion = API_URL + monedaInicial;

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();
            JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
            double tasaConversion = conversionRates.get(monedaFinal).getAsDouble();

            double valorFinal = valor * tasaConversion;
            return "El valor $" + valor + " " + monedaInicial + " corresponde al valor final de = $" + valorFinal + " " + monedaFinal;
        } catch (Exception e) {
            return "Error al obtener la tasa de conversión. Intente nuevamente.";
        }
    }
}
