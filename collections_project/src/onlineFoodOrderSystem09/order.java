package onlineFoodOrderSystem09;
import java.util.*;

public class order{
	private static int countorder = 5001;
    private int orderid;
    private String customername;
    private List<foodItem> items;
    private double totalAmount;
	
	public order(String customername, List<foodItem> items, double totalAmount) {
		this.orderid=countorder++;
		this.customername = customername;
		this.items = items;
		this.totalAmount = totalAmount;
	}
	
		
	
	public int getOrderId() { return orderid; }
    public String getCustomerName() { return customername; }
    public double getTotalAmount() { return totalAmount; }
    public List<foodItem> getItems() { return items; }
	
	
	
}



