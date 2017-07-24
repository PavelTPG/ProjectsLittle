package PiersAndShips.entity;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Port {

    private String namePort;
    private Store store;
    private Lock lock;
    private static final Port port = new Port("Izotop", 10_000);

    public String getNamePort() {
        return namePort;
    }

    public void setNamePort(String namePort) {
        this.namePort = namePort;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    private Port() {
    }

    private Port(String namePort, int capacity) {
        this.namePort = namePort;
        store = new Store(capacity);
        lock = new ReentrantLock();
    }

    public static Port getPort() {
        return port;
    }

    public boolean load(Conteyner c) {
        return store.add(c);

    }
    public int getContaynerSize() {
        return store.getSize();
    }

    public boolean tryLoad() {
     
        return lock.tryLock();

    }

    public boolean freePort() {

        lock.unlock();
        return false;
    }
}
