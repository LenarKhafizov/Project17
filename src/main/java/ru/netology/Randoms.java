package ru.netology;
import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable <Integer> {
    protected Random random;
    protected int range, min;

    public Randoms(int min, int max) {
        this.min = min;
        range = max - min +1;
        random = new Random();
    }
    protected int getIndex() {
        return random.nextInt(range) + min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }
            @Override
            public Integer next() {
                return getIndex();
            }
        };
    }
}
