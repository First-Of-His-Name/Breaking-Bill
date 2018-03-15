package DBSchema;

/**
 * Created by Aman on 30/06/17.
 */

public class TransactionStructure {
    String from;
    Float amount;

    public TransactionStructure() {
    }

    public TransactionStructure(String from, Float amount) {
        this.from = from;
        this.amount = amount;
    }

    public String getFrom() {
        return from;
    }

    public Float getAmount() {
        return amount;
    }
}
