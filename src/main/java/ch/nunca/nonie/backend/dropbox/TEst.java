package ch.nunca.nonie.backend.dropbox;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public class TEst {
        // implemented after https://docs.oracle.com/javase/7/docs/api/java/util/Random.html
        private AtomicLong seed;

    private static final long multiplier = 0x5DEECE66DL;
    private static final long addend = 0xBL;
    private static final long mask = (1L << 48) - 1;

    protected int next(int bits) {
        long oldseed, nextseed;
        AtomicLong seed = this.seed;
        do {
            oldseed = seed.get();
            nextseed = (oldseed * multiplier + addend) & mask;
        } while (!seed.compareAndSet(oldseed, nextseed));
        return (int)(nextseed >>> (48 - bits));
    }

    public static void main(String[] args) {
        boolean x = true;
        boolean y =  false;
        Random random = new Random();
        random.setSeed(115818640780420l);
        while (x) {
            int test = random.nextInt();
            if( test == -1792635349) {
                y = true;
            }
            if(y) {
                System.out.println(test);
            }
        }

    }
}
