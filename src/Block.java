public class Block {
    protected int minerId;
    protected String previousHash;
    protected String currentHash;
    protected String[] transaction;

    public Block(int minerId, String previousHash, String currentHash) {
        this.minerId = minerId;
        this.previousHash = previousHash;
        this.currentHash = currentHash;
    }
}
