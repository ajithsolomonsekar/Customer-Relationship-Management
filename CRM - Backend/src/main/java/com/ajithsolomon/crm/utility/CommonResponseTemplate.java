package com.ajithsolomon.crm.utility;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import org.springframework.stereotype.Component;

@Component
public class CommonResponseTemplate<T> {

    /** The error message. */
    @JsonInclude(Include.NON_NULL)
    private String responseMsg;

    @JsonInclude(Include.NON_NULL)
    private Object responseObject;

    public CommonResponseTemplate() {
    }

    public CommonResponseTemplate(String responseMsg, T responseObject) {
        this.responseMsg = responseMsg;
        this.responseObject = responseObject;
    }

    public String getResponseMsg() {
        return responseMsg;
    }

    public void setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg;
    }

    public Object getResponseObject() {
        return responseObject;
    }

    public void setResponseObject(T responseObject) {
        this.responseObject = responseObject;
    }

}

