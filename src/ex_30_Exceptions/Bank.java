package ex_30_Exceptions;

public class Bank {

    private String currency;
    private Integer amount;

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Bank bankName) {

        if (bankName.currency.equalsIgnoreCase("INR")) {
            return bankName.amount + this.amount;
        } else {
            try {
                throw new CurrencyMismatchException("Currency Mismatch");
            } catch (CurrencyMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
        return 0;
    }
class CurrencyMismatchException extends Exception{
    CurrencyMismatchException(String msg){
        super(msg);
    }
    }
}