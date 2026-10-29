class RaceSynchronized extends Thread{
    public static int count = 0;
    @Override
    public void run(){
        for(int i=0;i<100000;i++){
            synchronized(RaceSynchronized.class){
                count++;
            }
        }
    }
}
public class s2{
    public static void main(String[] args){
        RaceSynchronized t1 = new RaceSynchronized();
        RaceSynchronized t2 = new RaceSynchronized();

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } 
        catch (InterruptedException e){
            System.out.println("Thread execution interrupted:"+ e.getMessage());
        }
        System.out.println("--- Part B: With Synchronization ---");
        System.out.println("Expected count value: 200,000");
        System.out.println("Actual count value: " + String.format("%,d",RaceSynchronized.count));
    }
}