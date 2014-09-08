import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Practice13_Thread {

    static Logger logger = Logger.getLogger(Practice10_Log4j.class);

    public static void main(String[] args) {

        PropertyConfigurator.configure("/Users/jtao/Documents/Code/java/practice/src/main/resource/log4j.properties");

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                logger.info("Thread1 is running");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                logger.info("Thread2 is running");
            }
        });

        thread1.start();
        thread2.start();

    }


}
