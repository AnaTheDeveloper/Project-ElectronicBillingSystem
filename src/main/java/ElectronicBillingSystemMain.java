public class ElectronicBillingSystemMain {


  public static void main(String[] args) {

    AccountInfomation anasConsumption = new AccountInfomation("Ana", 1250, 'W', 1.25);
    AccountInfomation lukesConsumption = new AccountInfomation("Luke", 1000, 'W', 1.25);
    AccountInfomation bobsConsumption = new AccountInfomation("Bob", 100.50, 'W', 1.25);

    anasConsumption.energyCalculation();
    lukesConsumption.energyCalculation();
    bobsConsumption.energyCalculation();





  }

}
