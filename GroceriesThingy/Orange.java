public class Orange extends Sphere {

  private int numberOrdered;
  private double totalOrangeCost;

  public double getTotalCost () {
    return this.totalOrangeCost = Information.orangeCost * this.numberOrdered;

  }

  public Orange (int userEntered, double diameter) {
    super( userEntered, diameter);
    this.numberOrdered = userEntered;
  }

  public String toString() {
    return super.toString() + "\n";
  }
}
