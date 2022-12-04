package org.hel.ccapi.requests.charges;

import org.hel.ccapi.requests.AbstractRequest;
import org.hel.ccapi.responses.ChargeResponse;

public class AbstractChargeRequest extends AbstractRequest<ChargeResponse> {

    public AbstractChargeRequest() {
        super(ChargeResponse.class);
    }

}
