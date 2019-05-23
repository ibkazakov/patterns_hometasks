package ru.geekbrains.pattern.dz.dz3;

public interface OperationFactory {
    Deposit createDeposit(double sum, String wallet, long to_id);
    Withdraw createWithdraw(double sum, String wallet, long from_id);
    Transfer createTransfer(double sum, long from_id, long to_id);
}
