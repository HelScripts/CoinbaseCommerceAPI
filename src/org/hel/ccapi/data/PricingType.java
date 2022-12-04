package org.hel.ccapi.data;

import com.google.gson.annotations.SerializedName;

public enum PricingType {

    @SerializedName("no_price")
    NO_PRICE(),
    @SerializedName("fixed_price")
    FIXED_PRICE();

}
