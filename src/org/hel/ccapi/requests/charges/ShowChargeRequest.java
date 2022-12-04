package org.hel.ccapi.requests.charges;

import org.hel.ccapi.requests.AbstractRequest;

public class ShowChargeRequest extends AbstractChargeRequest {
    private final String id;

    public ShowChargeRequest(String id) {
        this.id = id;
    }

    @Override
    public String getURLEndpoint() {
        return id + "/";
    }


}
