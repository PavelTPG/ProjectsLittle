package PiersAndShips.entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Store implements Iterable<Conteyner> {

    private List<Conteyner> list;
    private final int VOLUME;

    public Store(List<Conteyner> conteyner, int VOLUME) {
        this.list = conteyner;
        this.VOLUME = VOLUME;
    }

    public Store(int VOLUME) {
        this.VOLUME = VOLUME;
        list = new ArrayList<>(VOLUME);
    }

    public boolean add(Conteyner c) {
        return list.add(c);
    }

    public Conteyner get(int index) {
        return list.remove(index);
    }

    public List<Conteyner> getList() {
        return list;
    }
    public int getSize(){
        return list.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Conteyner container : this) {
            sb.append(container).append("\n");
        }
        return sb.toString();
        
    }

    @Override
    public Iterator<Conteyner> iterator() {
        return list.iterator();
    }

}
