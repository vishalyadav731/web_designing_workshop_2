import java.util.Scanner;

class bankAccount{
    private double balance=0;
    void deposite(double amt){
        balance+=amt;
    }
    void withdraw(double amt){
        if(amt<=balance){
            balance-=amt;
        }
        else{
            System.out.println("Insufficiate balance");
        }
    }
    void show(){
        System.out.println("Balance="+balance);
    }
}
public class Bank {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        bankAccount b=new bankAccount();
        int ch;
        do{
            System.out.println("Press 1:Deposite,Press 2:Withdraw,Press 3:Show,Press 4:Exit");
            ch=scn.nextInt();
            switch(ch){
                case 1: b.deposite(scn.nextDouble());
                        break;
                case 2: b.withdraw(scn.nextDouble());
                        break;
                case 3: b.show();
                        break;
            }
        }while(ch!=4);
    }
}