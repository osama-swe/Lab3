public class CoffeeMachine {
    int credit = 0;
    int coffee = 0;
    public void addCredit(int credittoAdd){
        credit += credittoAdd;
    }
    public void makeCoffee(int numberOfCoffee, int sugarSpoons){
        for (int i = 0; i < numberOfCoffee; i++) {
            coffee++;
            System.out.println("1 Cup of Coffee done with " + sugarSpoons + "spoons of Sugar.");
        }

    }
    public void addCreditStub(){
        credit++;
    }
    public void makeCoffeeStub(int numberOfCoffee){
        for (int i = 0; i < numberOfCoffee; i++) {
            addCreditStub();
            credit--;
            coffee++;
        }

    }
}
