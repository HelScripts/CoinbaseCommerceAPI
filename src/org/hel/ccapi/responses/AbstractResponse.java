package org.hel.ccapi.responses;

import com.google.gson.GsonBuilder;
import org.hel.ccapi.CoinbaseCommerceAPI;

public abstract class AbstractResponse {

    @Override
    public String toString() {
        return CoinbaseCommerceAPI.gson.toJson(this);
    }

}
