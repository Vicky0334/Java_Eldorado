class MyThread extends Thread {
    public void run() {
        System.out.println("Inside run method");
        System.out.println("Thread priority: " + this.getPriority());

    } 
     

    public static void main(String[] args) {
        MyThread p1 = new MyThread();
        MyThread p2 = new MyThread();
        MyThread p3 = new MyThread();

        p1.setPriority(2); 
        p2.setPriority(5);
        p3.setPriority(8); 
        System.out.println("Thread priority: " + p1.getPriority());
        System.out.println("Thread priority: " + p2.getPriority());
        System.out.println("Thread priority: " + p3.getPriority());
        System.out.println("Thread priority: " + Thread.currentThread().getName());
    }
}
