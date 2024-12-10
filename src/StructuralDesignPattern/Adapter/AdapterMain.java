package StructuralDesignPattern.Adapter;

import java.io.IOException;

public class AdapterMain {
    public static void main(String[] args) {
        try {
            BankDataAdapter dutchBanglaAdapter = new DutchBanglaAdapter();
            BankDataAdapter cityBankAdapter = new CityBankAdapter();
            BangladeshBankSystem bbSystem = new BangladeshBankSystem();

            // Process transactions with the adapters
            bbSystem.processDailyReport(dutchBanglaAdapter);
            bbSystem.processDailyReport(cityBankAdapter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}