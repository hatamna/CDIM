class Car extends Vehicle {
  private String trim;

  public Car() {
    super("None", "None", 0, 0, true, "None", "None");
  }

  public Car(String t, String m, int y, double co, boolean bOrS, String cl, String a, String tr) {
    super(t, m, y, co, bOrS, cl, a);
    trim = tr;
  }

  public String getTrim() {
    return trim;
  }

  public void setTrim(String tr) {
    trim = tr;
  }

  public String toString() {
    return "Type: " + getType() + "\nMake: " + getMake() + "\nYear: " + getYear() + "\nCost: " + getCost()
        + "\nBought (true) or Sold (false): " + getBoughtOrSold() + "\nColor: " + getColor() + "\nAgent: " + getAgent()
        + "\nTrim: "
        + trim;
  }

}