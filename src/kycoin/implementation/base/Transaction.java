package kycoin.implementation.base;

import java.time.Clock;
import java.time.Instant;

public class Transaction {
    private final String sender, receiver;
    private final Instant date;
    private final double amount;

    public Transaction(String sender, String receiver, double amount) {
        this.sender = sender;
        this.receiver = receiver;
        this.date = Clock.systemUTC().instant();
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        String sHash = getSender() + getReceiver() + getAmount() + getDate();
        return sHash.hashCode();
    }

    @Override
    public String toString() {
        return getSender() +
                " " +
                getReceiver() +
                " " +
                getAmount() +
                " " +
                getDate();
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public Instant getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }
}
