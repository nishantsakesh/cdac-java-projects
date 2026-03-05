package Billing_System;

public class FoodDeliveryApp {

	public static void main(String[] args) {
		
		FastFoodRestaurant r1 = new FastFoodRestaurant(101,"Burger Hub","Bangalore");
		
		r1.deliveryChargePerKm =10;
		r1.displayRestaurantInfo();
		r1.calculateDeliveryCharge(5);
		
		System.out.println();
		
		FineDiningRestaurant r2 = new FineDiningRestaurant(202,"Royal Dine","Bangalore");
		
		r2.serviceChargePercentage = 10;
        r2.displayRestaurantInfo();
        r2.calculateBill(2000);

	}

}
