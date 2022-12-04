package org.hel.ccapi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.hel.ccapi.data.Currency;
import org.hel.ccapi.data.PricingType;
import org.hel.ccapi.requests.charges.ChargeRequest;

public class Test {

    private static final String apiKey = "287d1f7c-acb4-412b-9f2d-e1747f4e5c40";

    public static void main(String... args) {

        CoinbaseCommerceAPI api = new CoinbaseCommerceAPI(apiKey);


        System.out.println(new ChargeRequest()
                .setPrice(
                        50,
                        Currency.USD
                )
                .setPricingType(PricingType.FIXED_PRICE)
                .setName("Name of Invoice")
                .addMetadata("customer_id", "5005")
                .submit(api)
        );
    }
}
