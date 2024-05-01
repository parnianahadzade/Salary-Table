package com.mftplus.salary.exceptions;

public class AccessDeniedException extends Exception{

    private String message;

    public AccessDeniedException() {
        message = "AccessDenied !!!";
    }

    public AccessDeniedException(String message) {
        super(message);
        this.message = message;
    }
    public int responseStatus(){
        return 403;
    }
}
