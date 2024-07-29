import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator iterator() {
        return new Iterator();
    }

    class Iterator implements java.util.Iterator<Integer> {

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            int i = max - min + 1;
            return random.nextInt(Math.abs(i) + min);
        }
    }
}