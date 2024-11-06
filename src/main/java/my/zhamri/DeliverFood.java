package my.zhamri;

class DeliverFood extends Thread {
    private Thread prepareFoodThread;

    public DeliverFood(Thread prepareFoodThread) {
        this.prepareFoodThread = prepareFoodThread;
    }

    public void run() {
        try {
//            prepareFoodThread.join(); // Wait until food is prepared
            System.out.println("3. Delivering food...");
            Thread.sleep(4000); // Simulate time taken to deliver food
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("3. Food delivered.");
    }
}
