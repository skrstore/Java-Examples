// Controlling the main Thread.
class MainThreadDemo {
    public static void main(String args[]) {
        Thread t = Thread.currentThread();

        t.setPriority(1);

        System.out.println(t.getPriority());
        System.out.println("Current thread: " + t);
        // change the name of the thread
        t.setName("My Thread");
        System.out.println("After name change: " + t);
        try {
            for (int n = 3; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
                System.out.println(t.isAlive()); 
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}