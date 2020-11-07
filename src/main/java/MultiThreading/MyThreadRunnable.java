package MultiThreading;

public class MyThreadRunnable implements Runnable {

    @Override
    public void run(){
        int i=1;
        while(i<1000){
            System.out.println("Haha"+i);
            i++;
        }
    }

    public static void main(String[] args){
       MyThreadRunnable myt=new MyThreadRunnable();
        Thread t=new Thread(myt);
        t.start();

        int j=1;
        while(j<1000){
            System.out.println("Hello"+j);
            j++;
        }

    }
}
