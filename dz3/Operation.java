package ru.geekbrains.pattern.dz.dz3;

public abstract class Operation {
    private long id;
    private int status = 0;

    private static long next_id = 1;

    private String currency;

   public Operation(long id) {
       this.id = id;
   }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
       return status;
    }

    public static long getNext_id() {
       return next_id;
    }

    public static void increment_id() {
       next_id++;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
       this.currency = currency;
    }

}
