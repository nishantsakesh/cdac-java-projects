package onlineFoodOrderSystem09;
import java.util.*;


public class ordermanager implements orderoperations  {

	HashMap<Integer, foodItem> menu = new HashMap<>();
    ArrayList<order> orders = new ArrayList<>();
    Queue<order> orderQueue = new LinkedList<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void addFoodItem() {
    	sc.nextLine();
        System.out.print("Enter Item Name: ");
        String name = sc.next();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        foodItem newItem = new foodItem(name, price);
        menu.put(newItem.getid(), newItem);
        System.out.println("Item added successfully with ID: " + newItem.getid());
    }

    @Override
    public void viewMenu() {
        System.out.println("\nID | Name | Price");
        for (foodItem item : menu.values()) {
            System.out.println(item);
        }
    }

	@Override
	public void placeOrder() {
		sc.nextLine();
		System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        List<foodItem> selectedItems = new ArrayList<>();
        
        while (true) {
            viewMenu();
            System.out.print("Enter Item ID to add (0 to finish): ");
            if (!sc.hasNextInt()) { 
                System.out.println("Please enter a valid numeric ID.");
                sc.next(); 
                continue;
            }
            
            int id = sc.nextInt();
            if (id == 0) break;
            
            if (menu.containsKey(id)) {
                selectedItems.add(menu.get(id));
                System.out.println("Added: " + menu.get(id).getitemname());
            } else {
                System.out.println("Invalid ID!");
            }
        }

        if (!selectedItems.isEmpty()) {
            double bill = calculateDiscountedBill(selectedItems);
            order newOrder = new order(name, selectedItems, bill);
            orders.add(newOrder);
            orderQueue.add(newOrder);
            System.out.println("Order Placed! ID: " + newOrder.getOrderId() + " | Final Bill: ₹" + bill);
        }
    }
	
	
	private double calculateDiscountedBill(List<foodItem> items) {
        double total = 0;
        for (foodItem item : items) total += item.getprice();

        double discount1 = (items.size() > 3) ? total * 0.10 : 0;
        double discount2 = (total > 1000) ? total * 0.15 : 0;    

        return total - Math.max(discount1, discount2);
    }
		
	

	@Override
	public void viewOrders() {
		System.out.println("\nOrder ID | Customer | Total Amount");
        for (order o : orders) {
            System.out.println(o.getOrderId() + " | " + o.getCustomerName() + " | ₹" + o.getTotalAmount());
            }
		
	}
        

	@Override
	public void processNextOrder() {
		order next = orderQueue.poll();
        if (next != null) {
            System.out.println("Processing Order #" + next.getOrderId() + " for " + next.getCustomerName());
        } else {
            System.out.println("No pending orders in queue.");
        }
		
	}
	
	@Override public void calculateBill() {  
		
	}

}
