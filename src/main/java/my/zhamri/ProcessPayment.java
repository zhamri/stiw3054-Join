package my.zhamri;

class ProcessPayment extends Thread {
    public void run() {
        System.out.println("1. Processing payment...");
        try {
            Thread.sleep(2000); // Simulate time taken to process payment
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("1. Payment processed.");
    }
}
