class Vehicle {
  private String type;
  private String make;
  private int year;
  private double cost;
  private boolean boughtOrSold;
  private String color;
  private String agent;

  public Vehicle() {
    type = "None";
    make = "None";
    year = 0;
    cost = 0;
    boughtOrSold = true;
    color = "None";
    agent = "None";
  }

  public Vehicle(String t, String m, int y, double co, boolean bOrS, String cl, String a) {
    type = t;
    make = m;
    year = y;
    cost = co;
    boughtOrSold = bOrS;
    color = cl;
    agent = a;
  }

  public String getType() {
    return type;
  }

  public String getMake() {
    return make;
  }

  public int getYear() {
    return year;
  }

  public double getCost() {
    return cost;
  }

  public boolean getBoughtOrSold() {
    return boughtOrSold;
  }

  public String getColor() {
    return color;
  }

  public String getAgent() {
    return agent;
  }

  public void setType(String t) {
    type = t;
  }

  public void setMake(String m) {
    make = m;
  }

  public void setYear(int y) {
    year = y;
  }

  public void setCost(double co) {
    cost = co;
  }

  public void setBoughtOrSold(boolean bOrS) {
    boughtOrSold = bOrS;
  }

  public void setColor(String cl) {
    color = cl;
  }

  public void setAgent(String a) {
    agent = a;
  }

  public String toString() {
    return "Type: " + type + "\nMake: " + make + "\nYear: " + year + "\nCost: " + cost
        + "\nBought (true) or Sold (false): "
        + boughtOrSold + "\nColor: " + color + "\nAgent: " + agent;
  }

}