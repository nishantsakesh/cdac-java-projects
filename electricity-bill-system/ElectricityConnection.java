class ElectricityConnection {

    int consumerId;
    String consumerName;
    int unitsConsumed;

    ElectricityConnection(int consumerId, String consumerName, int unitsConsumed) {
        this.consumerId = consumerId;
        this.consumerName = consumerName;
        this.unitsConsumed = unitsConsumed;
    }

    double calculateBill() {

        double bill = 0;

        if(unitsConsumed <= 100)
            bill = unitsConsumed * 5;

        else if(unitsConsumed <= 200)
            bill = (100 * 5) + (unitsConsumed - 100) * 7;

        else
            bill = (100 * 5) + (100 * 7) + (unitsConsumed - 200) * 10;

        return bill;
    }

    void displayBill() {
        System.out.println("\nConsumer ID: " + consumerId);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Total Bill: INR " + calculateBill());
    }
}