package ru.geekbrains.pattern.dz.dz3;

public class Deposit extends Operation {
    private double sum;
    private String wallet;
    private long to_id;

    public Deposit(long id, double sum, String wallet, long to_id) {
        super(id);
        this.sum = sum;
        this.wallet = wallet;
        this.setTo_id(to_id);
    }

    double getSum() {
        return sum;
    }

    void setSum(double sum) {
        this.sum = sum;
    }

    void setWallet(String wallet) {
        this.wallet = wallet;
    }

    String getWallet() {
        return wallet;
    }


    public long getTo_id() {
        return to_id;
    }

    public void setTo_id(long to_id) {
        this.to_id = to_id;
    }
}

