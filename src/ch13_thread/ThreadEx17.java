package ch13_thread;

public class ThreadEx17 {
    public static void main(String[] args) {
        Thread17_1 th1 = new Thread17_1("*");
        Thread17_1 th2 = new Thread17_1("**");
        Thread17_1 th3 = new Thread17_1("***");
        th1.start();
        th2.start();
        th3.start();
        
        try {
            Thread.sleep(2000);
            th1.suspend();    // th1쓰레드 잠시중단
            Thread.sleep(2000);
            th2.suspend();
            Thread.sleep(3000);
            th1.resume();    // th1쓰레드 재실행
            Thread.sleep(3000);
            th1.stop();        // th1쓰레드 종료
            th2.stop();        // th2쓰레드 종료
            Thread.sleep(2000);
            th3.stop();        // th3쓰레드 종료
        } catch(InterruptedException e) {}    
    }
}

class Thread17_1 implements Runnable {
    volatile boolean suspended = false;
    volatile boolean stopped = false;
    
    Thread th;
    
    Thread17_1(String name) {
        th = new Thread(this,name);    // Thread(Runnable r, String name)
    }
    
    public void run() {
        while(!stopped) {
            if(!suspended) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch(InterruptedException e) {}
            }
        }
        System.out.println(Thread.currentThread().getName() + " - stopped");
    }
    
    public void start() { th.start(); }
    public void suspend() { suspended = true; }
    public void stop() { stopped = true; }
    public void resume() { suspended = false; }
}
