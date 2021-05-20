package kycoin.implementation.base;

import java.time.Clock;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Block {
    private final List<Transaction> transactions = new ArrayList<>();
    private final long index;
    private final Instant date;
    private int prev;

    public Block(long index) {
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

    public void addTransaction(Transaction tr) {
        this.transactions.add(tr);
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
