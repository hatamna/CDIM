class SUV extends Car {
  private int numOfSeats;

  public SUV() {
    super("None", "None", 0, 0, true, "None", "None", "None");
  }

  public SUV(String t, String m, int y, double co, boolean bOrS, String cl, String a, String tr, int n) {
    super(t, m, y, co, bOrS, cl, a, tr);
    numOfSeats = n;
  }

  public int getNumOfSeats() {
    return numOfSeats;
  }

  public void setNumOfSeats(int n) {
    numOfSeats = n;
  }

  public String toString() {
    return "Type: " + getType() + "\nMake: " + getMake() + "\nYear: " + getYear() + "\nCost: " + getCost()
        + "\nBought (true) or Sold (false): " + getBoughtOrSold() + "\nColor: " + getColor() + "\nAgent: " + getAgent()
        + "\nTrim: "
        + getTrim() + "\nNumber of Seats: " + numOfSeats;
  }
}