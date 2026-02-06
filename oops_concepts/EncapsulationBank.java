package oops_concepts;

public class EncapsulationBank {
    protected int balance;
    public void setBalance(int amount){
        balance = amount;
    }
    public int getBalance(){
        return balance;
    }
    public static void main(String[] args) {
        EncapsulationBank obj = new EncapsulationBank();
        obj.setBalance(1000);
        System.out.println(obj.getBalance());
    }
}
