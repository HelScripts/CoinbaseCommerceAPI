package org.hel.ccapi.requests;

import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import okhttp3.*;
import org.hel.ccapi.CoinbaseCommerceAPI;
import org.hel.ccapi.responses.ChargeResponse;
import org.hel.ccapi.serialization.Exclude;

import java.util.function.Supplier;

public abstract class AbstractRequest<T> {

    @Exclude
    private final Class<T> type;
    public String getURLEndpoint() {
        return "";
    }

    public AbstractRequest(Class<T> type) {
        this.type = type;
    }

    public T submit(CoinbaseCommerceAPI api) {
        OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.create(
                CoinbaseCommerceAPI.gson.toJson(this), MediaType.parse("application/json")
        );

        Request request = new Request.Builder()
                .url("https://api.commerce.coinbase.com/charges/" + getURLEndpoint())
                .post(body)
                .addHeader("accept", "application/json")
                .addHeader("content-type", "application/json")
                .addHeader("X-CC-Version", api.getVersion())
                .addHeader("X-CC-Api-Key", api.getAPIKey())
                .build();

        try(Response response = client.newCall(request).execute()) {
            System.out.println(response.message());
            String responseBody = response.body().string();
           // System.out.println(responseBody);
            JsonObject responseObj = CoinbaseCommerceAPI.gson.fromJson(responseBody, JsonObject.class);
            return CoinbaseCommerceAPI.gson.fromJson(responseObj.getAsJsonObject("data"), type);
        }catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }
}
