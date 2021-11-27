package MultiThreading;

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            //using a for loop allows you to create more than one thread without having to hard code it
            //i < 5 means it will create 5 threads to run concurrently
            MultiThreadExample myMulti = new MultiThreadExample(i);
            Thread myThread = new Thread(myMulti);
            myThread.start(); //used when implementing Runnable interface
            //myMulti.start(); runs it concurrently. Used with extend
            /*
            try {
                myThread.join(); -- using this method means it will finish with one thread before starting the next thread
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            */
            //myThread.isAlive(); returns a boolean true or false on whether the thread is still running.
        }

        /*
        MultiThreadExample myMulti2 = new MultiThreadExample();
        myMulti2.start();
        myMulti.run(); runs it one at time not concurrently
        */
    }
}
