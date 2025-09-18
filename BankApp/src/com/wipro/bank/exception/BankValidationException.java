package com.wipro.bank.exception;

public class BankValidationException extends Exception {

    public BankValidationException() {
    }

    public BankValidationException(String msg) {
    }

    @Override
    public String getMessage() {
        return "Invalid Data";
    }
}
