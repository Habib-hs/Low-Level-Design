package StructuralDesignPattern.Adapter;

import java.io.IOException;

// Bangladesh Bank system
public class BangladeshBankSystem {
    public void processDailyReport(BankDataAdapter adapter) throws IOException {
        String transactionsJson = adapter.getTransactionsJson();
        // Display or do something with the JSON-like structured data.
        System.out.println("output format in BangladeshBank: " + transactionsJson);
    }
}
