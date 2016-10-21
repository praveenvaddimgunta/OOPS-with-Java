import java.util.Date;

public class Transaction {
	private String transactionType;
	private double amount;
	private Date date;
	private String description;
	private String merchant;
	private int reward;
	public Transaction()
	{

	}
  public void setType(String type) {
  	this.transactionType=type;
  }
  public String getType() {
  	return transactionType;
  }
  public void setAmount(double amount) {
  	this.amount=amount;
  }
  public double getAmount()
  {
  	return amount;
  }
  public void setDate(Date date) {
  	this.date=date;
  }
  public Date getDate()
  {
  	return date;
  }
  public void setDescription(String desc) {
  	this.description=desc;
  }
  public String getDescription()
  {
  	return description;
  }
  public void setMerchant(String merchant) {
  	this.merchant=merchant;
  }
  public String getMerchant()
  {
  	return merchant;
  }
  public void setReward(int points)
  {
  	this.reward=points;
  }
  public int getRewards()
  {
  	return reward;
  }
  public String toString()
  {
  	String s=" ";
  	s+=transactionType+" ";
  	s+=amount+" ";  	
  	s+=description+" ";  	
  	s+=merchant+ " ";
   	s+=reward+"\n";
  	return s;
  }
}