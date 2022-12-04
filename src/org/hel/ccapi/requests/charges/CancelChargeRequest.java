package org.hel.ccapi.requests.charges;

import org.hel.ccapi.requests.AbstractRequest;

public class CancelChargeRequest extends AbstractChargeRequest {

    private final String id;

    public CancelChargeRequest(String id) {
        this.id = id;
    }

    @Override
    public String getURLEndpoint() {
        return id + "/cancel";
    }

}
