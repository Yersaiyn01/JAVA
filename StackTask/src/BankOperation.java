public interface BankOperation {
    boolean execute();
    void undo();
}
