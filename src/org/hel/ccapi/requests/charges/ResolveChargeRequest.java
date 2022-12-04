package org.hel.ccapi.requests.charges;

import org.hel.ccapi.requests.AbstractRequest;

public class ResolveChargeRequest extends AbstractChargeRequest {

    private final String id;

    public ResolveChargeRequest(String id) {
        this.id = id;
    }

    @Override
    public String getURLEndpoint() {
        return id + "/resolve";
    }

}
