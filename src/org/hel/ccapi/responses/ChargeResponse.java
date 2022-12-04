package org.hel.ccapi.responses;

import com.google.gson.annotations.SerializedName;
import org.hel.ccapi.data.PricingObject;
import org.hel.ccapi.data.PricingType;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class ChargeResponse extends AbstractResponse {

    public String id;
    public String resource;
    String code;
    String description;
    @SerializedName("logo_url")
    String logoUrl;
    @SerializedName("hosted_url")
    String hostedUrl;
    @SerializedName("created_at")
    public String createdAt;
    @SerializedName("expires_at")
    public String expiresAt;
    Map<String, String> metadata;
    @SerializedName("pricing_type")
    PricingType pricingType;
    Map<String, PricingObject> pricing;

}
