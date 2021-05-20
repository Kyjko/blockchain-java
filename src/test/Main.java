package test;

import kycoin.implementation.base.Block;
import kycoin.implementation.base.Blockchain;
import kycoin.implementation.base.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Block b1 = new Block(0);
        Block b2 = new Block(1);

        b1.addTransaction(new Transaction("Kyjko0777", "Badapple", 100.4));
        b1.addTransaction(new Transaction("Madarr021azzo0301", "Kyjko0777", 534534));
        b1.addTransaction(new Transaction("Uwu", "Badapple", 86.7));

        b2.addTransaction(new Transaction("Kyjko0777", "Uwu", 10002.241));
        b2.addTransaction(new Transaction("Kyjko0777", "Nekem", 10020.0));
        b2.addTransaction(new Transaction("Kyjko0777", "adsad", 10040.0));
        b2.addTransaction(new Transaction("Big man", "Kyjko0777", 10050.0));

        Blockchain bc = new Blockchain();

        bc.addBlock(b1);
        bc.addBlock(b2);

        System.out.println(bc);
    }
}
