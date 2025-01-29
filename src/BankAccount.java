public class BankAccount{
    public static void main(String[] args){
        double balance = 2175.37;
        balance -= 302.50;
        balance += 50.03;
        balance = balance/2 + 20;
        balance--;
        balance *= 2;
        balance++;
        System.out.printf("$%.2f", balance);
    }
}