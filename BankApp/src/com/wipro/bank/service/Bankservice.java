package com.wipro.bank.service;

import com.wipro.bank.acc.RDAccount;
import com.wipro.bank.exception.BankValidationException;

public class Bankservice {

    public boolean validatedata(float principal, int tenure, int age, String gender) throws BankValidationException {
        if (principal < 500) {
            throw new BankValidationException();
        }
        if (!(tenure == 5 || tenure == 10)) {
            throw new BankValidationException();
        }
        if (!(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female"))) {
            throw new BankValidationException();
        }
        if (age <= 0 || age >= 100) {
            throw new BankValidationException();
        }
        return true;
    }

    public void calculate(float principal, int tenure, int age, String gender) {
        try {
            if (validatedata(principal, tenure, age, gender)) {
                RDAccount account = new RDAccount(tenure, principal);
                account.setinterest(age, gender);
                float interest = account.calculateinterest();
                float deposited = account.calculateamountdeposited();
                float maturity = account.calculatematurityamount(deposited, interest);               
                System.out.printf("Interest: %.2f\n", interest);
                System.out.printf("Amount Deposited: %.2f\n", deposited);
                System.out.printf("Maturity Amount: %.2f\n", maturity);
            }
        } catch (BankValidationException e) {
            System.out.println("Validation failed: " + e.getMessage());
        }
    }
}
