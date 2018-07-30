package models;

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
    
    public static int getNbJurys() {
    	return EIGHT.getNumVal() + 1;
    }
}
