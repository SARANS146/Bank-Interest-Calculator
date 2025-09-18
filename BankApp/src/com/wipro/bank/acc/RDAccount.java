package com.wipro.bank.acc;

public class RDAccount extends Account {

    public RDAccount(int tenure, float principal) {
        this.tenure = tenure;
        this.principal = principal;
    }

    @Override
    public float calculateinterest() {
        int n = tenure * 4; 
        float interest = principal * n * (n + 1) / 2 * (rateofinterest / 400);
        return interest;
    }

    @Override
    public float calculateamountdeposited() {
        return principal * tenure * 12;
    }
}
