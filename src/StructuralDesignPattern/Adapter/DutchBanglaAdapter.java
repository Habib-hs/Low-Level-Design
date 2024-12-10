package StructuralDesignPattern.Adapter;

import StructuralDesignPattern.Adapter.GetDataFromOtherBank.DutchBanglaDataRetriever;

import java.io.IOException;


// Dutch-Bangla Bank Adapter
public class DutchBanglaAdapter implements BankDataAdapter {
    private DutchBanglaDataRetriever dataRetriever;

    public DutchBanglaAdapter() {
        this.dataRetriever = new DutchBanglaDataRetriever();
    }

    @Override
    public String getTransactionsJson() throws IOException {
        String content = dataRetriever.retrieveTransactionsData();
        System.out.println("Converting CSV to JSON: " + content);
        return "[" + content + "]";
    }
}