package models;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Hour {
	NINE(0), NINE_30(1), TEN(2), TEN_30(3),
	ELEVEN(4), ELEVEN_30(5), TWELVE(6), TWELVE_30(7);
	
	private int numVal;

	Hour(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }
    
    private static final List<Hour> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    public static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

	public static Hour randomDay()  {
		return VALUES.get(RANDOM.nextInt(SIZE));
	}
}
