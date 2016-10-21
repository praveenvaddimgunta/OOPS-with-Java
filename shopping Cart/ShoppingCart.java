import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<Item> cart;
	double temp, tax, total, discount;
	int flag = 0;
		

	public ShoppingCart() {
		cart = new ArrayList<Item>();
	}

	public void addToCart(Item i) {
		cart.add(i);
	}
	public void showCart() {
		for (int i=0; i<cart.size(); i++) {
			System.out.println(cart.get(i).getProductName()+": "+cart.get(i).getQuantity());
		}
	}
	public void removeFromCart(Item i) {
		cart.remove(i);
	}
	public double getTotalAmount() {
		total = 0;
		//discount = 0;
		for(int i=0;i<cart.size();i++) {
			temp=cart.get(i).getQuantity()*cart.get(i).getUnitPrice();
			total=total+temp;
		}
		this.total=total;
		if(flag==1) 
			discount=this.total/10;
		return total;
	}

	public double getPayableAmount() {
		return total+(total-discount)*14/100-discount;
	}	
 
	public void printInvoice() {
		total = 0;
		//discount = 0;
		System.out.println("\nName of product\tQuantity\tUnit Price\ttotal price");
		for(int i=0;i<cart.size();i++)
		{
			temp=cart.get(i).getQuantity()*cart.get(i).getUnitPrice();
			total = total + temp;
			System.out.println();
			System.out.printf("%s\t\t%d\t\t%.2f\t\t%.2f\t\t",cart.get(i).getProductName(),cart.get(i).getQuantity(),cart.get(i).getUnitPrice(),temp);
			//System.out.printf(cart.get(i).getProductName()+"\t\t"+cart.get(i).getQuantity()+"\t\t"+cart.get(i).getUnitPrice()+"\t\t"+temp);
		}
		if(flag==1)
			discount = total/10;
		else 
			discount =0;
		tax=(total-discount)*14/100;
		System.out.printf("\n\t\t\t\t\t\tTotal:%.2f",total);
		if(flag==1) 
		{
			tax=(total-discount)*14/100;
		}else 
			discount=0;
		System.out.printf("\n\t\t\t\t\t\tDiscount:%.2f",discount);
		System.out.printf("\n\t\t\t\t\t\tTax:%.2f",tax);
		System.out.printf("\n\t\t\t\t\t\tGrand total:%.2f",(total+tax-discount));
	}

	public void applyCoupon(String s) {
		if(s.compareTo("IND10")==0)	{
			flag=1;
			discount=total/10;
		} else {
			discount = 0;
			//System.out.println("please enter a valid coupon!");
		}
	}
}