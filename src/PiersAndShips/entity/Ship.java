package PiersAndShips.entity;

import java.math.MathContext;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.objects.NativeMath;

public class Ship implements Runnable {

    private Store store;
    private volatile boolean running = true;
    private String name;
    private static final int VOLUME = 100;
    private Thread thread;
    private Port port = Port.getPort();
    private int capacity ;

    public Ship(String name ) {
        store = new Store(capacity);
        this.name = name;
        thread = new Thread(this);
        thread.start();

    }

    @Override
    public void run() {
        while (running) {
            if (port.tryLoad()) {
                System.out.println("припарковался " + name);
                try {
                    if (getSize() !=0) {

                        unLoading();
                        System.out.println("The ship " + name + " unloading in the port ->"
                                + port.getNamePort());
                        System.out.println(port.getContaynerSize());
                        stop();

                    } else {
                        System.out.println("пустой приперся" + name);
                        sailAway();
                    }

                } finally {
                    System.out.println("уплыл " + name);
                    port.freePort();
//                   stop();
                    sailAway();
                }

            } else {
                sailAway();
            }

        }

    }

    public void unLoading() {

        for (int i = 0; i < store.getSize(); i++) {
            Conteyner c = store.get(i);
            System.out.println("The ship " + name + " unloading in the port "
                    + port.getNamePort() + c.toString());
            port.load(c);
        }

    }

    public void sailAway() {
        try {

            System.out.println(name + " sail away around Port");
            TimeUnit.MILLISECONDS.sleep(new Random().nextInt(10000));

        } catch (InterruptedException ex) {

        }
    }

    public int getSize() {
        
        return store.getSize();
    }

    public void stop() {
        running = false;

    }

}
