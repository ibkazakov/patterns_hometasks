package ru.geekbrains.pattern.dz.dz3;

public class BitcoinOperationFactory extends CurrencyOperationFactory {
    @Override
    public String getCurrency() {
        return "Bitcoin";
    }
}
