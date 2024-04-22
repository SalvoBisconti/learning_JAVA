//Implementa il metodo di elaborazione dei dati comune a tutte le implementazioni concrete.
public abstract class AbstractDataProcessor implements DataProcessor {
    protected double totalSales = 0;
    protected int transactionCount = 0;

    protected void calculateTotals(double amount) {
        totalSales += amount;
        transactionCount++;
    }
}
