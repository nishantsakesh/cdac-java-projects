package Billing_System;

public class Restaurant {
	int restaurantId;
	String restaurantName;
	String location;
	
	Restaurant(int restaurantId, String restaurantName,String location){
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.location = location;
	}
	
	public void displayRestaurantInfo() {
		System.out.println("Restaurant Id: "+ restaurantId );
		System.out.println("Restaurant Name: " + restaurantName);
		System.out.println("Location: " + location);
	}

}

class FastFoodRestaurant extends Restaurant{
	
	double deliveryChargePerKm;
	
	FastFoodRestaurant(int restaurantId, String restaurantName, String location) {
		super(restaurantId, restaurantName, location);
		
	}
	
	public void calculateDeliveryCharge(int distance) {
		double total = deliveryChargePerKm *distance;
		
		System.out.println("Delivery Charge per Km: " + deliveryChargePerKm);
	    System.out.println("Distance: " + distance + " km");
	    System.out.println("Total Delivery Charge: " + total);
	}

	
}

class FineDiningRestaurant extends Restaurant{
	double serviceChargePercentage;
	
	FineDiningRestaurant(int restaurantId, String restaurantName, String location) {
		super(restaurantId, restaurantName, location);		
	}

	public void calculateBill(double foodAmount) {
		double serviceCharge = (foodAmount * serviceChargePercentage)/100;
		double finalBill= foodAmount + serviceCharge;
		
		System.out.println("Food Amount: " + foodAmount);
	    System.out.println("Service Charge: " + serviceChargePercentage + "%");
	    System.out.println("Final Bill Amount: " + finalBill);
	}
	
}
