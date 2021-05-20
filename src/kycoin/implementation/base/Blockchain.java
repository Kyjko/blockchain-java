package kycoin.implementation.base;

import java.util.List;

public class Blockchain {
    private final List<Block> chain;

    public Blockchain(List<Block> chain) {
        this.chain = chain;
    }

    public Block getLastBlock() {
        var chain = getChain();
        if(chain.size() > 0) {
            return chain.get(chain.size() - 1);
        } else {
            return null;
        }
    }

    public void addBlock(Block b) {
        if(getChain().size() > 0) {
            b.setPrev(getLastBlock().hashCode());
        }
        this.chain.add(b);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        getChain().forEach(b -> {
            sb.append(b.toString());
            sb.append("\n==========\n");
        });

        return sb.toString();
    }

    public List<Block> getChain() {
        return chain;
    }
}
