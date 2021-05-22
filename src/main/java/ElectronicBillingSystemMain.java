public class ElectronicBillingSystemMain {


  public static void main(String[] args) {

    AccountInfomation anasConsumption = new AccountInfomation("Ana", 1250, 'W');
    AccountInfomation lukesConsumption = new AccountInfomation("Luke", 1000, 'W');
    AccountInfomation bobsConsumption = new AccountInfomation("Bob", 100.50, 'W');

    anasConsumption.energyCalculation();
    lukesConsumption.energyCalculation();
    bobsConsumption.energyCalculation();

  }

}
