package com.pandatronik.ppmtool.payload;

public class JWTLoginSuccessResponse {

    private boolean success;
    private String token;

    public JWTLoginSuccessResponse(boolean success, String token) {
        this.success = success;
        this.token = token;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("JWTLoginSuccessResponse{");
        sb.append("success=").append(success);
        sb.append(", token='").append(token).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
