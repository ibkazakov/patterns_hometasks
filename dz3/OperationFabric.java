package ru.geekbrains.pattern.dz.dz3;

import ru.geekbrains.pattern.lesson3.factory.Fabric;

public class OperationFabric {
    public static final String CURRENCY_ONE = "Bitcoin";
    public static final String CURRENCY_TWO = "Litecoin";


    private static OperationFabric instance = new OperationFabric();

    public OperationFactory createFactory(String name) {
        switch (name) {
            case CURRENCY_ONE:
                return new BitcoinOperationFactory();
            case CURRENCY_TWO:
                return new LitecoinOperationFactory();
        }
        return null;
    }

    public static OperationFabric getInstance() {
        return instance;
    }

    private OperationFabric() {
    }
}
