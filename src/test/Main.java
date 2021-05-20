package test;

import kycoin.implementation.base.Block;
import kycoin.implementation.base.Blockchain;
import kycoin.implementation.base.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Transaction> trs = new ArrayList<>();
        List<Transaction> trs2 = new ArrayList<>();

        trs.add(new Transaction("Kyjko0777", "Badapple", 100.4));
        trs.add(new Transaction("Madarr021azzo0301", "Kyjko0777", 534534));
        trs.add(new Transaction("Uwu", "Badapple", 86.7));

        trs2.add(new Transaction("Kyjko0777", "Uwu", 10002.241));
        trs2.add(new Transaction("Kyjko0777", "Nekem", 10020.0));
        trs2.add(new Transaction("Kyjko0777", "adsad", 10040.0));
        trs2.add(new Transaction("Big man", "Kyjko0777", 10050.0));

        Blockchain bc = new Blockchain();
        bc.addBlock(new Block(trs, 0));
        bc.addBlock(new Block(trs2, 1));
        System.out.println(bc);
    }
}
