public class AccountInfomation {

  //Instance variables

  private String name = "";
  private double energyUsed = 0;
  private char energySymbol = 'W';
  private double energyRate = 1.25;

  //Getters and setters

  //Constructor Method

  public AccountInfomation(String name, double energyUsed, char energySymbol, double energyRate)
  {
    this.name = name;
    this.energyUsed = energyUsed;
    this.energySymbol = energySymbol;
    this.energyRate = energyRate;
  }

  //Method Number 1

  public void energyCalculation(){

    double energyForumula = energyUsed * energyRate;
    System.out.println(name + ", you have used " + energyUsed + energySymbol + " of energy this month. You now owe: £ " + energyForumula);
  }







}
