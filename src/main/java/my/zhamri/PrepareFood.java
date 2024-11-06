package my.zhamri;

class PrepareFood extends Thread {
    private Thread paymentThread;

    public PrepareFood(Thread paymentThread) {
        this.paymentThread = paymentThread;
    }

    public void run() {
        try {
//            paymentThread.join(); // Wait until payment is complete
            System.out.println("2. Preparing food...");
            Thread.sleep(3000); // Simulate time taken to prepare food
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("2. Food prepared.");
    }
}
