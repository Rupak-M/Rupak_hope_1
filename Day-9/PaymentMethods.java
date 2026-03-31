interface Money{
    public void cash();
} 
interface Digital{
    public void upi();
}
interface Card{
    public void credit();
    public void debit();
}
interface BitCoin{
    public void coin();
}
class MakePayment implements Money,Digital,Card,BitCoin{
    public void cash(){
        System.out.println("Provide Amount as Cash:");
    }
    public void upi(){
        System.out.println("Pay using Google Pay:");
    }
    public void credit(){
        System.out.println("Pay using credit card:");
    }
    public void debit(){
        System.out.println("Pay using debit card:");
    }
    public void coin(){
        System.out.println("Pay using BitCoin:");
    }
}
public class PaymentMethods {
    public static void main(String[] args) {
        MakePayment mp=new MakePayment();
        mp.cash();
        mp.upi();
        mp.credit();
        mp.debit();
        mp.coin();
    }
}
