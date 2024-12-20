import java.util.*;

public class BankingApp{
    public static void main(String[] args) {
        HashMap<String,BankingSystem> hm = new HashMap<>();
        boolean run = true;

        while(run){
        System.out.println("welcome to happy bank");
        Scanner in = new Scanner(System.in);
        System.out.println("1.create new account");
        System.out.println("2.Banking");
        System.out.println("3.Card");
        System.out.println("Enter the option number");
        int option = in.nextInt();
        in.nextLine();

        if(option==1){
        System.out.println("Enter the name");
        String name = in.nextLine();
        System.out.println("Enter the mobile number");
        String mbno = in.nextLine();
        // System.out.println("Enter the mode of ur account");
        // String mode = in.nextLine();

        BankingSystem bs = new BankingSystem(name,mbno);
        hm.put(mbno, bs);
        }

        else if(option==2){
            System.out.println("Enter the mobile number");
            String mbno = in.nextLine();
            System.out.println("1.Balance check");
            System.out.println("2.Money Deposit");
            System.out.println("3.Money Withdraw");
            int soption = in.nextInt();
            if(soption==1){
            // BankingSystem bs = new BankingSystem(mbno);
            BankingSystem bs = hm.get(mbno);
            System.out.println(bs.getBalance());
            }
            else if(soption==2){
              // BankingSystem bs = new BankingSystem(mbno);
              BankingSystem bs = hm.get(mbno);
              System.out.println("enter the amount to be deposited");
              double deposit = in.nextDouble();
              bs.deposit(deposit);
              System.out.println(bs.getBalance());
              }
            else if(soption==3){
                // BankingSystem bs = new BankingSystem(mbno);
                BankingSystem bs = hm.get(mbno);
                System.out.println("enter the amount to be withrawled");
                double withdrawl = in.nextDouble();
                bs.withdraw(withdrawl);
                System.out.println(bs.getBalance());
                // System.out.println(bs.getWithdrawl());
                }
            else{
              System.out.println("the option to access is invalid");}
    else if(option==3){
       System.out.println("Enter the mobile number");
       String mbno = in.nextLine();
       System.out.println("1.Debit Card");
        System.out.println("2.Credit Card");
        int coption = in.nextInt();
              if(coption==1){
              BankingSystem bs = hm.get(mbno);
              System.out.println(bs.getBalance());
              }
              else if(coption==2){
                // BankingSystem bs = new BankingSystem(mbno);
                BankingSystem bs = hm.get(mbno);
                System.out.println("enter the amount to be deposited");
                // double deposit = in.nextDouble();
                // bs.deposit(deposit);
                System.out.println(bs.getBalance());
                }
    }
  }
            
   

}
