package models;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum DayEnum {
	JUNE_1(0), JUNE_2(1), JUNE_3(2), JUNE_4(3), JUNE_5(4),
	JULY_1(5), JULY_2(6), JULY_3(7), JULY_4(8), JULY_5(9);
	
	private int numVal;

	DayEnum(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }
    
    private static final List<DayEnum> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    public static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

	public static DayEnum randomDay()  {
		return VALUES.get(RANDOM.nextInt(SIZE));
	}
}
