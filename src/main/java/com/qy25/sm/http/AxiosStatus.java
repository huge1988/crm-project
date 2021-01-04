package com.qy25.sm.http;

/**
 * @Author: jiuzhe
 * @Date: 2021/1/3 - 16:47
 */
public enum AxiosStatus {

    OK(2000, "success"),
    ERROR(4000, "error");
    private int status;
    private String message;

    AxiosStatus(int status, String message) {
        this.status = status;
        this.message = message;
    }

    AxiosStatus() {
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
