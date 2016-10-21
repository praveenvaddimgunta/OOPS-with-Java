import java.util.*;

public class DigitalWallet {
  private String name;
  int k=0;
  int j=0;
  int count=0;
  Transaction t=new Transaction();
  ArrayList<Transaction> txArray;
  private static double balance;
  /* Store all the Add Money, Pay and Reward transactions as transaction objects */

  /* implement all the methods given below */

  /* Default constructor */
  public DigitalWallet(String name ) {
    this.name=name;
    txArray=new ArrayList<Transaction>();
      }

  /* Add money to the wallet */
  public boolean addMoney(Transaction tx) { 
   
    if(tx.getAmount()>0&&tx.getAmount()<5000) {
      txArray.add(tx);
      balance+=tx.getAmount();
      return true;
    }
    else
      return false; 
  }

  /* Return the balance in the balance */
  public double getBalance() {
    if(balance>0)
      return balance;
    else
    return 0.0;
  }

  /* Make a payment */
  public boolean pay(Transaction tx) {
    
    if(balance>tx.getAmount())
    {
      txArray.add(tx);
      balance=balance-tx.getAmount();
      int p=(int)tx.getAmount()/100;
      if(p>0) {
        t.setReward(p);
        t.setType("reward");
        t.setAmount(p);
        t.setDescription(tx.getDescription());
        t.setMerchant(tx.getMerchant());
        txArray.add(t);
      }
      balance=balance+(p*10);
      return true;
    } else
   return false; 
  }

  /* print statement */
  public void printStatement() {
    System.out.println(txArray);
  }

  /* Return the list of reward transactions */
  public Transaction[] getRewardTransactions() {
    int count=0;
    //Transaction[] rewardsArray=new Transaction[txArray.size()];
    for(int i=0;i<txArray.size();i++) {
      if(txArray.get(i).getRewards()>0)
        count++;
    }
    Transaction[] rewardsArray=new Transaction[count];
    for(int i=0;i<txArray.size();i++) {
      if(txArray.get(i).getRewards()>0) {
        rewardsArray[k]=txArray.get(i);
        k++;
      }
        
    }
    //System.out.println(rewardsArray);
    return rewardsArray;
  }

  /* Return all the transactions */
  public Transaction[] getAllTransactions() {
    Transaction[] allTrans=new Transaction[txArray.size()];
    for(int i=0;i<txArray.size();i++) {
      allTrans[i]=txArray.get(i);
    }
    //System.out.println(allTrans);
    return allTrans;
  }

  /* Return the transactions that match the merchant name */
  public Transaction[] getTransactions(String merchantName) {
   
    for(int i=0;i<txArray.size();i++) {
      if(txArray.get(i).getMerchant().equals(merchantName)&&(!(txArray.get(i).getType().equals("reward"))))
        count++;
    }
    Transaction[] merch=new Transaction[count];
    for(int i=0;i<txArray.size();i++) {
      if(txArray.get(i).getMerchant().equals(merchantName)&&(!(txArray.get(i).getType().equals("reward"))))
      {
        merch[j]=txArray.get(i);
        j++;
      }
    }
    //System.out.println(merch);
    return merch;
  }

}