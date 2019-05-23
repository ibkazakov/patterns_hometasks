package ru.geekbrains.pattern.dz.dz3;

public class Withdraw extends Operation {
    private double sum;
    private String wallet;
    private long from_id;

    public Withdraw(long id, double sum, String wallet, long from_id) {
        super(id);
        this.sum = sum;
        this.wallet = wallet;
        this.setFrom_id(from_id);
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


    public long getFrom_id() {
        return from_id;
    }

    public void setFrom_id(long from_id) {
        this.from_id = from_id;
    }
}
