import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Practice12_CopyOnWriteArrayList {

    static Logger logger = Logger.getLogger(Practice10_Log4j.class);

    private final CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<String>();

    public static void main(String[] args) {

        PropertyConfigurator.configure("/Users/jtao/Documents/Code/java/practice/src/main/resource/log4j.properties");

        Practice12_CopyOnWriteArrayList test = new Practice12_CopyOnWriteArrayList();
        test.copyOnWriteArrayList.add("A");

        new Thread(test.new modifyThread()).start();
        new Thread(test.new modifyThread()).start();
        new Thread(test.new modifyThread()).start();

    }

    class modifyThread implements Runnable{

        @Override
        public void run() {
            Iterator iterator = copyOnWriteArrayList.iterator();
            String s = (String) iterator.next();
            copyOnWriteArrayList.removeAll(copyOnWriteArrayList);
            copyOnWriteArrayList.add(s + "B");
            iterator = copyOnWriteArrayList.iterator();
            logger.debug(iterator.next());

        }
    }
}
