public class Sphere extends ShoppingCart {

  private double diameter;
  private int numberOrdered;

  private static final double pi = 22/7;

  private final double radius;
  private double singleSphereVolume;
  private double singleSphereCubeVolume;
  private int spherePerRow;
  private int spheresPerFlat;
  private int spheresPerBox;

  private int numBoxes;
  private int numFlats;
  private int numRows;

  private int sphereNumberCalculated;
  private int sphereLeftover;

  public Sphere (int userEntered, double diameter1) {

    super();

    this.numberOrdered = this.sphereNumberCalculated = userEntered;
    this.diameter = diameter1;
    this.radius = this.diameter / 2;
    this.singleSphereVolume = (4/3) * pi * this.radius * this.radius * this.radius;
    this.singleSphereCubeVolume = this.diameter * this.diameter * this.diameter;
    this.spheresPerRow = (int) Information.box1Width / (int) this.diameter;
    this.spheresPerFlat = (int) Information.box1Length / (int) this.diameter * this.spheresPerRow;
    this.spheresPerBox = (int) Information.box1Height / (int) this.diameter * this.spheresPerFlat;
    this.numBoxes = 0;
    this.numFlats = 0;
    this.numRows = 0;

    while (this.sphereNumberCalculated >= this.spheresPerBox) {
      this.numBoxes += 1;
      this.sphereNumberCalculated -= this.spheresPerBox;
    }
    while (this.sphereNumberCalculated >= this.spheresPerFlat) {
      this.numFlats += 1;
      this.sphereNumberCalculated -= this.spheresPerFlat;
    }
    while (this.sphereNumberCalculated >= this.spheresPerRow) {
      this.numFlats += 1;
      this.sphereNumberCalculated -= this.spheresPerRow;
    }
    this.sphereLeftover = this.sphereNumberCalculated;
  }
  public String toString() {
    return "Boxing Guide: \nNumber Ordered: " + this.numberOrdered + "\n" +
            "Number of Boxes Needed: " + (numBoxes + 1) + "\n" +
            "\tNumber of Full Boxes: " + numBoxes + "\n" +
            "\tGuide for last partial box: " + numFlats + " full flats, " + numRows +
            " full row(s) on the last flat, " + this.sphereLeftover + " apples in last row.";
  }
}
