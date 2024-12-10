package StructuralDesignPattern.Adapter.GetDataFromOtherBank;

// Data retriever for City Bank that provides the file path to Excel data
public class CityBankDataRetriever {
    public String retrieveTransactionsData() {
        // Simulated Excel data (as a comma-separated string for simplicity)
        return "TX2001,1000,USD\nTX2002,1200,USD";
    }
}