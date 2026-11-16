import java.util.*;
public class Bank {
    private final Map<Integer,BankAccount> accounts = new HashMap<>();
    private final Set<BankAccount> usedAccounts = new HashSet<>();
    private final Deque<BankOperation> history = new ArrayDeque<>();

    public boolean openAccount(BankAccount account){
        return accounts.putIfAbsent(account.getAccountNumber(),account) == null;
    }
}
import java.util.*;
public class Bank {
    private final Map<Integer,BankAccount> accounts = new HashMap<>();
    private final Set<BankAccount> usedAccounts = new HashSet<>();
    private final Deque<BankOperation> history = new ArrayDeque<>();

    public boolean openAccount(BankAccount account){
        return accounts.putIfAbsent(account.getAccountNumber(),account) == null;
    }
}
