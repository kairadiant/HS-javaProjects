import java.security.*;
import java.util.Random;

public class BankAccount {
    String name;
    int accnum;
    double balance;
    String username;
    String password;
    String salthold="";
    int hashpass;
    public double hold;
    double newpass;
    boolean isprime;
    Random rand =new Random();
    public byte[] salt = new byte[16];
    public  BankAccount()
    {name= "user";accnum=1;balance=0;username="username";password="password";}
    public BankAccount(String n,int a, double b, String u, String p)
    {name=n;accnum=a;balance=b;username=u;password=p;}

    public void setname(String n){name=n;}
    public void setaccnum(int n){accnum=n;}
    public void setbal(double b){balance=b;}
    public void setuser(String u){username=u;}
    public void setpass(String p){password=p;}


    public String getname(){return name;}
    public int getaccnum(){return accnum;}
    public double getbal(){return balance;}
    public String getuser(){return username;}
    public String getpass(){return password;}
    public void pepperpass(){
        SecureRandom random = new SecureRandom();
        random.nextBytes(salt);
        salthold=password+salt;
        hashpass=salthold.hashCode();
        do {
            hold = rand.nextInt();
            int count = 0;
            for (int i = 0; i < Math.sqrt(hold); i++) {
                if (hold % i == 0) {
                    count++;
                }
            }
            if (count > 1) {
                isprime = false;
            } else {
                isprime = true;
            }
        }while(!isprime);
    }
    public double pepper(){
        newpass=hashpass*hold;
        return newpass;}

}