package onlineFoodOrderSystem09;

interface orderOperatons{
	void addFoodItem();
	void viewMenu();
	void placeOrder();
	void viewOrders();
	void processNextOrder();
	void calculateBill();
}




public class foodItem {
	
	private static int countid=201;
	private int itemid;
	private String itemname;
	private double price;
	
	public foodItem(String itemname, double price) {
		this.itemid=countid++;
		this.itemname = itemname;
		this.price = price;
	}
	
	//getter and setter
	public int getid() {return this.itemid;}
	public String getitemname() {return this.itemname;}
	public double getprice() {return this.price;}
	
	//setter
	public void setitemname(String itemname) {this.itemname =itemname;}
	public void setprice(double price) {this.price=price;}

	@Override
	public String toString() {
		return "foodItem [itemid=" + itemid + ", itemname=" + itemname + ", price=" + price + "]";
	}
	

	
	
}

