package models;

public enum Day {
	JUNE_1(0), JUNE_2(1), JUNE_3(2), JUNE_4(3), JUNE_5(4),
	JULY_1(5), JULY_2(6), JULY_3(7), JULY_4(8), JULY_5(9);
	
	private int numVal;

	Day(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }
    
    public static int getNbDays() {
    	return JULY_5.getNumVal() + 1;
    }
}
