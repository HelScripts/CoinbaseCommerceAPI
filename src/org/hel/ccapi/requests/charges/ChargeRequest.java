package org.hel.ccapi.requests.charges;

import com.google.gson.annotations.SerializedName;
import org.hel.ccapi.data.Currency;
import org.hel.ccapi.data.PricingObject;
import org.hel.ccapi.data.PricingType;

import java.util.HashMap;
import java.util.Map;

public class ChargeRequest extends AbstractChargeRequest {

    private String name;
    private String description;
    @SerializedName("pricing_type")
    private PricingType pricingType;
    @SerializedName("local_price")
    private PricingObject localPrice;
    @SerializedName("redirect_url")
    private String redirectUrl;
    @SerializedName("cancel_url")
    private String cancelUrl;
    private Map<String, String> metadata = new HashMap<>();


    public ChargeRequest setPrice(double amount, Currency currency) {
        localPrice = new PricingObject(amount, currency);
        return this;
    }

    public ChargeRequest setName(String name) {
        this.name = name;
        return this;
    }

    public ChargeRequest setDescription(String desc) {
        this.description = desc;
        return this;
    }

    public ChargeRequest setPricingType(PricingType pricingType) {
        this.pricingType = pricingType;
        return this;
    }

    public ChargeRequest setRedirectURL(String redirectURL) {
        this.redirectUrl = redirectURL;
        return this;
    }

    public ChargeRequest setCancelURL(String cancelURL) {
        this.cancelUrl = cancelURL;
        return this;
    }

    public ChargeRequest addMetadata(String key, String value) {
        this.metadata.put(key, value);
        return this;
    }

}
