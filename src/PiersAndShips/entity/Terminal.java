//package PiersAndShips.entity;
//
//import java.io.IOException;
//import java.nio.CharBuffer;
//
//public class Terminal implements Runnable {
//
//    private Conteyner conteyner; 
//    private int counter = 0;
//    private volatile boolean running = true;
//    private String name;
//
//    public Terminal(Conteyner ship, String name) {
//        this.conteyner = conteyner;
//        this.name = name;
//        new Thread((Runnable) this).start();
//    }
//
//    @Override
//    public void run() {
//        while (running) {
//                conteyner.put(++counter);
//        }
//    }
//
//    public void stop() {
//        running = false;
//
//    }
//
//}
