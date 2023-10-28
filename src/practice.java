public class practice extends Thread {
    static practice t1 = new practice();
    public static void main(String[] args) {


        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
    }

    @Override
    public void run()
    {
        System.out.println(t1.getState());

        int a= 10;
        int b=12;
        int result = a+b;
        try {
            Thread.sleep(2000);
            System.out.println(t1.getState());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread started running..");
        System.out.println("Sum of two numbers is: "+ result);
    }
}




