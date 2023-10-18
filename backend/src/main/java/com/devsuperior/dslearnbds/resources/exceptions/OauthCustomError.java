package com.devsuperior.dslearnbds.resources.exceptions;

import org.codehaus.jackson.annotate.JsonProperty;

import java.io.Serializable;

public class OauthCustomError implements Serializable {

    private String error;

    @JsonProperty("error_description") //retorna o erro como o nome especificado
    private String errorDescription;

    public OauthCustomError() {}


    public OauthCustomError(String error, String errorDescription) {
        this.error = error;
        this.errorDescription = errorDescription;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }
}
