package StructuralDesignPattern.Adapter;

import java.io.IOException;

public interface BankDataAdapter {
    String getTransactionsJson() throws IOException;
}