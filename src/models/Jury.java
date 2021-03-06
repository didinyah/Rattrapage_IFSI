package models;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Jury {
	ONE(0), TWO(1), THREE(2), FOUR(3),
	FIVE(4), SIX(5), SEVEN(6), EIGHT(7);
	
	private int numVal;

	Jury(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }
    
    private static final List<Jury> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    public static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

	public static Jury randomDay()  {
		return VALUES.get(RANDOM.nextInt(SIZE));
	}
}
