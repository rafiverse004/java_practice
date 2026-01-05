public class CheckingAccount extends Account{
  public static int count=0;
  
  public CheckingAccount(){
    super(0.0);  //parent class constructor will be called
    count++;
  }
  public CheckingAccount(double balance){
    super(balance);
    count++;
  }
  
}
