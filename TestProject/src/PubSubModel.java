import java.util.ArrayList;
import java.util.List;

/*Implement a Pub-Sub model - Java Thread
Java examples for Thread:Producer Consumer

HOMEJavaThreadProducer Consumer
Introduction
Implement a Pub-Sub model using following criteria:

There is a queue (i.e list) with a certain capacity (10)
M number of publisher and N number of subscriber sharing the queue.
Publisher has to wait if queue capacity is full
Subscriber will wait if queue is empty
Use thread signaling (wait, notify / notifyAll)
Demo Code*/
public class PubSubModel {
    int nextInitial = 0;
    private int initialCapacity = 10;
    private List<Integer> list = new ArrayList<>(initialCapacity);

    public static void main(String[] args) {
    PubSubModel threadSignaling = new PubSubModel();

    Thread publisher1 = new Thread(() -> threadSignaling.publisher());
    publisher1.start();/*from ww  w .jav a  2s  .  c  o  m*/

    Thread subscriber1 = new Thread(() -> threadSignaling.subscriber());
    subscriber1.start();

}

    public void subscriber() {

        for (int i = 0; i < initialCapacity; i++) {
            synchronized (this) {
                try {
                    while (list.size() == 0) {
                        this.wait();
                    }
                    System.out.println(Thread.currentThread().getName()
                            + " " + nextInitial + ". Message subscribed..."
                            + list.get(0));
                    list.remove(0);
                    this.notifyAll();
                } catch (InterruptedException e) {
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void publisher() {

        for (int i = 0; i < initialCapacity; i++) {
            synchronized (this) {
                try {
                    while (list.size() == 3) {
                        this.wait();
                    }
                    list.add(nextInitial);
                    System.out.println(Thread.currentThread().getName()
                            + " " + nextInitial + ". Message published..."
                            + nextInitial);
                    nextInitial++;
                    this.notifyAll();
                } catch (InterruptedException e) {
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

