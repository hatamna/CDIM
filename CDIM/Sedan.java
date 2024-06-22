class Sedan extends Car {
  private int numOfDoors;

  public Sedan() {
    super("None", "None", 0, 0, true, "None", "None", "None");
  }

  public Sedan(String t, String m, int y, double co, boolean bOrS, String cl, String a, String tr, int n) {
    super(t, m, y, co, bOrS, cl, a, tr);
    numOfDoors = n;
  }

  public int getNumOfDoors() {
    return numOfDoors;
  }

  public void setNumOfDoors(int n) {
    numOfDoors = n;
  }

  public String toString() {
    return "Type: " + getType() + "\nMake: " + getMake() + "\nYear: " + getYear() + "\nCost: " + getCost()
        + "\nBought (true) or Sold (false): " + getBoughtOrSold() + "\nColor: " + getColor() + "\nAgent: " + getAgent()
        + "\nTrim: "
        + getTrim() + "\nNumber of Doors: " + numOfDoors;
  }
}