import java.util.ArrayList;
import java.util.*;
public class bankrun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<BankAccount> AccountList = new ArrayList<BankAccount>();
        for(int i=0;i<3;i++) {
            BankAccount account = new BankAccount();
            System.out.print("Enter a username for account "+(i+1)+": ");
            account.setuser(input.next());
            System.out.print("Enter a password for account "+(i+1)+": ");
            account.setpass(input.next());
            System.out.print("Enter a name for account "+(i+1)+": ");
            account.setname(input.next());
            account.setaccnum((int)(Math.random()*100 +1));
            System.out.print("Enter a balance for account "+(i+1)+": ");
            account.setbal(input.nextDouble());
            AccountList.add(account);
        }
        for(int i=0;i<3;i++){
            AccountList.get(i).pepperpass();
        }
        String username, password;
        int index=-1;
        do {
            System.out.print("Login\nusername: ");
            username = input.next();
            for (int i = 0; i < 3; i++) {
                if (username == AccountList.get(i).username) {
                    index = i;
                }
            }
            if(index==-1) {
                System.out.println("Incorrect username.");}
            }while(index!=-1);
        boolean hash=false;
        do{
            System.out.print("password: ");
            String hold;
            password=input.next();
            hold=password+AccountList.get(index).salt;
            if(AccountList.get(index).pepper()==(hold.hashCode()*AccountList.get(index).hold)){
                hash=true;
            }
            else{
                System.out.print("Incorrect password.");
            }
        }while(!hash);
    }
}

    //BankAccount account = new BankAccount();AccountList.add(account);