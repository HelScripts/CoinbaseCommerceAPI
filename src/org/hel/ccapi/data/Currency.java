package org.hel.ccapi.data;

import com.google.gson.annotations.SerializedName;

public enum Currency {

    USD("local"),
    @SerializedName("BTC")
    BITCOIN("bitcoin"),
    @SerializedName("ETH")
    ETHEREUM("ethereum");

    private final String name;
    Currency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
