package com.backend.handt.Responses;

import com.backend.handt.model.LoginModel;

public class LoginResponse {
    private int code = 0;
    private String status = null;
    private String message = null;

    private LoginModel userDetails = null;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LoginModel getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(LoginModel userDetails) {
        this.userDetails = userDetails;
    }
}
