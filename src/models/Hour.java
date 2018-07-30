package models;

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
    
    public static int getNbHours() {
    	return TWELVE_30.getNumVal() + 1;
    }
}
