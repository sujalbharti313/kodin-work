class Race extends Thread{
    public static int count = 0;
    private boolean useSynchronization;

    public Race(boolean useSynchronization){
        this.useSynchronization = useSynchronization;
    }
    @Override
    public void run(){
        for (int i=0;i<100000; i++){
            count++;
            }
        }
    }
public class s1{
    public static void main(String[] args){
        Race t1 = new Race(true);
        Race t2 = new Race(false);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch (InterruptedException e){
            System.out.println("Thread execution interrupted: "+ e.getMessage());
        }
        System.out.println("--- Part A: Without Synchronization ---");
        System.out.println("Expected count value: 200,000");
        System.out.println("Actual count value: " + String.format("%d",Race.count));
    }
}