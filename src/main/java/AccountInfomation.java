public class AccountInfomation {

  //Instance variables

  private String name = "";
  private double energyUsed = 0;
  private char energySymbol = 'W';

  //Constructor Method

  public AccountInfomation(String name, double energyUsed, char energySymbol)
  {
    this.name = name;
    this.energyUsed = energyUsed;
    this.energySymbol = energySymbol;
  }

  //Method Number 1

  public void energyCalculation(){

    double energyForumula = energyUsed * 1.25;
    System.out.println(name + ", you have used " + energyUsed + energySymbol + " of energy this month.");
  }







}
