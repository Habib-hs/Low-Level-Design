package StructuralDesignPattern.Adapter.GetDataFromOtherBank;

// Data retriever for Dutch-Bangla Bank that provides the file path to CSV data
public class DutchBanglaDataRetriever {
    public String retrieveTransactionsData() {
        // Simulated CSV data
        return "TX1001,500,USD\nTX1002,750,USD";
    }
}