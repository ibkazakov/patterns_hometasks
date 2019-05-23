package ru.geekbrains.pattern.dz.dz3;

public class Transfer extends Operation {
    private double sum;

    private long from_id;
    private long to_id;

    public Transfer(long id, double sum, long from_id, long to_id) {
        super(id);
        this.sum = sum;
        this.setFrom_id(from_id);
        this.setTo_id(to_id);
    }

    double getSum() {
        return sum;
    }

    void setSum(double sum) {
        this.sum = sum;
    }

    public long getFrom_id() {
        return from_id;
    }

    public void setFrom_id(long from_id) {
        this.from_id = from_id;
    }

    public long getTo_id() {
        return to_id;
    }

    public void setTo_id(long to_id) {
        this.to_id = to_id;
    }
}
