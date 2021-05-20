package kycoin.implementation.base;

import java.time.Clock;
import java.time.Instant;
import java.util.List;

public class Block {
    private final List<Transaction> transactions;
    private final long index;
    private final Instant date;
    private int prev;

    public Block(List<Transaction> transactions, long index) {
        this.transactions = transactions;
        this.index = index;
        this.date = Clock.systemUTC().instant();
        this.prev = 0;
    }

    public long getIndex() {
        return index;
    }

    @Override
    public int hashCode() {
        StringBuilder sb = new StringBuilder();
        sb.append(getIndex());
        getTransactions().forEach(t -> sb.append(t.hashCode()));

        return sb.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getIndex());
        sb.append("\n");
        getTransactions().forEach(t -> {
            sb.append(t.toString());
            sb.append("\n----------\n");
        });

        return sb.toString();
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public Instant getDate() {
        return date;
    }

    public int getPrev() {
        return prev;
    }

    public void setPrev(int prev) {
        this.prev = prev;
    }
}
