public class BankAccount{
    public static void main(String[] args){
        float balance = 2175.37f;
        balance -= 302.50f;
        balance += 50.03f;
        balance = balance/2 + 20f;
        balance -= 1f;
        balance *= 2f;
        balance += 1f;
        System.out.printf("$%.2f", balance);
    }
}