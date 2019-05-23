package ru.geekbrains.pattern.dz.dz3;

public abstract class CurrencyOperationFactory implements OperationFactory {


    @Override
    public Deposit createDeposit(double sum, String wallet, long to_id) {
        Deposit deposit = new Deposit(Operation.getNext_id(), sum, wallet, to_id);
        Operation.increment_id();
        deposit.setCurrency(getCurrency());
        return deposit;
    }

    @Override
    public Withdraw createWithdraw(double sum, String wallet, long from_id) {
        Withdraw withdraw = new Withdraw(Operation.getNext_id(), sum, wallet, from_id);
        Operation.increment_id();
        withdraw.setCurrency(getCurrency());
        return withdraw;
    }

    @Override
    public Transfer createTransfer(double sum, long from_id, long to_id) {
        Transfer transfer = new Transfer(Operation.getNext_id(), sum, from_id, to_id);
        Operation.increment_id();
        transfer.setCurrency(getCurrency());
        return transfer;
    }

    public abstract String getCurrency();

}
