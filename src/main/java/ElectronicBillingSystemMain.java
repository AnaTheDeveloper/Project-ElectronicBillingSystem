public class ElectronicBillingSystemMain {


  public static void main(String[] args) {

    AccountInfomation anasConsumption = new AccountInfomation("Ana", 1250, 1.25);
    AccountInfomation lukesConsumption = new AccountInfomation("Luke", 1000, 1.25);
    AccountInfomation bobsConsumption = new AccountInfomation("Bob", 100.50, 1.25);

    lukesConsumption.setEnergySymbol('K');
    lukesConsumption.setEnergyUsed(1500);


    anasConsumption.energyCalculation();
    lukesConsumption.energyCalculation();
    bobsConsumption.energyCalculation();

    System.out.println(anasConsumption.toString());





  }

}
