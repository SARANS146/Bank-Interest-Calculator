package com.wipro.bank.acc;

public abstract class Account {
    protected int tenure;
    protected float principal;
    public float rateofinterest;
    public void setinterest(int age, String gender) {
        if (gender.equalsIgnoreCase("male")) {
            if (age < 60) {
                rateofinterest = 9.8f;
            } else {
                rateofinterest = 10.5f;
            }
        } else {
            if (age < 58) {
                rateofinterest = 10.2f;
            } else {
                rateofinterest = 10.8f;
            }
        }
    }
    public float calculatematurityamount(float totalprincipledeposited, float maturityinterest) {
        return (totalprincipledeposited + maturityinterest);
    }
    public abstract float calculateinterest();
    public abstract float calculateamountdeposited();
}
