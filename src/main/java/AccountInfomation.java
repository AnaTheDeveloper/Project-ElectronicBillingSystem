public class AccountInfomation {

  //Instance variables

  private String name = "";
  private double energyUsed = 0;
  private char energySymbol = 'W';
  private double energyRate = 1.25;

  //Getters and setters

  public String getName() {
    return name;
  }


  public double getEnergyUsed() {
    return energyUsed;
  }

  public void setEnergyUsed(double energyUsed) {
    this.energyUsed = energyUsed;
  }

  public char getEnergySymbol() {
    return energySymbol;
  }

  public void setEnergySymbol(char energySymbol) {
    this.energySymbol = energySymbol;
  }

  public double getEnergyRate() {
    return energyRate;
  }

  public void setEnergyRate(double energyRate) {
    this.energyRate = energyRate;
  }

  //Constructor Method

  public AccountInfomation(String name, double energyUsed, double energyRate)
  {
    this.name = name;
    this.energyUsed = energyUsed;

    this.energyRate = energyRate;
  }

  //Method Number 1

  public void energyCalculation(){

    double energyForumula = energyUsed * energyRate;
    System.out.println(name + ", you have used " + energyUsed + energySymbol + " of energy this month. You now owe: £ " + energyForumula );
  }


  //toString


  @Override
  public String toString() {
    return "AccountInfomation{" +
        "name='" + name + '\'' +
        ", energyUsed=" + energyUsed +
        ", energySymbol=" + energySymbol +
        ", energyRate=" + energyRate +
        '}';
  }
}
