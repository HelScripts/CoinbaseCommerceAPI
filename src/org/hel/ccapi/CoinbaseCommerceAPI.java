package org.hel.ccapi;

import com.google.gson.*;
import org.hel.ccapi.serialization.Exclude;
import org.hel.ccapi.serialization.ExcludeStrategy;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class CoinbaseCommerceAPI {

    private final String API_KEY;
    private final String VERSION = "2018-03-22"; // todo: Allow multiple versions (?)

    public static Gson gson = new GsonBuilder().setExclusionStrategies(new ExcludeStrategy())
            .registerTypeAdapter(LocalDateTime.class, (JsonDeserializer<LocalDateTime>) (json, type, jsonDeserializationContext) ->
            ZonedDateTime.parse(json.getAsJsonPrimitive().getAsString()).toLocalDateTime())
            .setPrettyPrinting()
            .create();

    public CoinbaseCommerceAPI(String key){
        this.API_KEY = key;
    }

    public String getAPIKey(){
        return API_KEY;
    }

    public String getVersion(){
        return VERSION;
    }
}
