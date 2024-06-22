class Truck extends Vehicle {
  private String engineType;
  private String drivetrain;

  public Truck() {
    super("None", "None", 0, 0, true, "None", "None");
  }

  public Truck(String t, String m, int y, double co, boolean bOrS, String cl, String a, String e, String d) {
    super(t, m, y, co, bOrS, cl, a);
    engineType = e;
    drivetrain = d;
  }

  public String getEngineType() {
    return engineType;
  }

  public String getDrivetrain() {
    return drivetrain;
  }

  public void setEngineType(String e) {
    engineType = e;
  }

  public void setDrivetrain(String d) {
    drivetrain = d;
  }

  public String toString() {
    return "Type: " + getType() + "\nMake: " + getMake() + "\nYear: " + getYear() + "\nCost: " + getCost()
        + "\nBought (true) or Sold (false): " + getBoughtOrSold() + "\nColor: " + getColor() + "\nAgent: " + getAgent()
        + "\nEngine Type: " + engineType + "\nDrivetrain: " + drivetrain;
  }

}