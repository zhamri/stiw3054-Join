package my.zhamri;

public class FoodDeliverySystem {
    public static void main(String[] args) {
        Thread paymentThread = new ProcessPayment();
        Thread prepareFoodThread = new PrepareFood(paymentThread);
        Thread deliverFoodThread = new DeliverFood(prepareFoodThread);

        paymentThread.start();
        prepareFoodThread.start();
        deliverFoodThread.start();
    }
}
