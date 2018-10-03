import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
        Bank.totalAccounts++;

    }

    public void setAccountNumber(int setAccountNumber) {
        accountNumber = setAccountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountCategory(final BankAccountType type) {
        accountType = type;
    }

    public BankAccountType getAccountCategory() {
        return accountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double setAccountBalance) {
        accountBalance = setAccountBalance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(final String setOwnerName) {
        ownerName = setOwnerName;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double setInterestRate) {
        interestRate = setInterestRate;
    }

    public double getInterestEarned() {
        return interestEarned;
    }

    public void setInterestEarned(double setInterestEarned) {
        interestEarned = setInterestEarned;
    }
}
