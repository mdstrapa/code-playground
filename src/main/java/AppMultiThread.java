public class AppMultiThread {

    public static void main(String[] args) {

        LoggingMessage log1 = new LoggingMessage("Thread ONE", 500L,10);
        Thread t1 = new Thread(log1,"Log 1");
        t1.start();

        LoggingMessage log2 = new LoggingMessage("Thread TWO", 10L,5);
        Thread t2 = new Thread(log2,"Log 2");
        t2.start();

        LoggingMessage log3 = new LoggingMessage("Thread THREE",700L,25);
        Thread t3 = new Thread(log3,"Log 3");
        t3.start();

    }
}


class LoggingMessage implements Runnable{

    String threadName;
    long loggingInterval;
    int loopRepetitions;

    LoggingMessage(String threadName, long loggingInterval, int loopRepetitions){
        this.threadName = threadName;
        this.loggingInterval = loggingInterval;
        this.loopRepetitions = loopRepetitions;
    }

    @Override
    public void run() {
        for(int c = 0;c<loopRepetitions;c++){
            System.out.println("Message written " + c + " times by thread " + threadName);
            try {
                Thread.sleep(loggingInterval);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
