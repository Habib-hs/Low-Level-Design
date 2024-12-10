package StructuralDesignPattern.Adapter;

import StructuralDesignPattern.Adapter.GetDataFromOtherBank.CityBankDataRetriever;

import java.io.IOException;

// City Bank Adapter
public class CityBankAdapter implements BankDataAdapter {
    private CityBankDataRetriever dataRetriever;

    public CityBankAdapter() {
        this.dataRetriever = new CityBankDataRetriever();
    }

    @Override
    public String getTransactionsJson() throws IOException {
        String content = dataRetriever.retrieveTransactionsData();
        System.out.println("Converting Excel to JSON: " + content);
        return "[" + content + "]";
    }
}