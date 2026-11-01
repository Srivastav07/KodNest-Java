public class ObserveAutomaticConstructorExecution {
    ObserveAutomaticConstructorExecution() {
        System.out.println("Object Created");
    }
}

class Main {
    public static void main(String[] args) {
        ObserveAutomaticConstructorExecution obj = new ObserveAutomaticConstructorExecution();
    }
}
