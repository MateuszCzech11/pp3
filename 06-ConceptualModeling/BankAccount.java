public class BankAccount{
    String id;
    int balance=0;
    String name;

    BankAccount(String id, String name){
        this.id = id;
        this.name = name;
    }

    public void withdraw(int amount){
        if (amount>500){
            System.out.println("Cant withdraw more than 500PLN");
            return;
        }
        if (balance-amount<0){
            System.out.println("Insufficient funds");
        } else {
            balance-=amount;
        }

    }

    public void deposit(int amount){
        balance+=amount;
    }


    public int displayBalance(){
        return balance;
    }

    public static void main(String[] args) {
        BankAccount b= new BankAccount("12123","Jan Kowalski");
        b.deposit(500);
        System.out.println(b.displayBalance());
        b.deposit(200);
        System.out.println(b.displayBalance());
        b.withdraw(300);
        System.out.println(b.displayBalance());
    }
}