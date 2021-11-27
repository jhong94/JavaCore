package MultiThreading;

public class MultiThreadExample implements Runnable{
   private int threadNum;
    public MultiThreadExample(int threadNum){
       this.threadNum = threadNum;
   }

    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println(i + " from thread " + threadNum);
            //no guarantee which thread will run first, all threads run simultaneously and even if one thread throws an exception, all other
            // threads will continue running as normal

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
