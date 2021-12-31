public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService ();
        int weight = 62; // масса тела в кг
        int height = 176; // рост в см
        int index = service.calculate(weight, height);
        System.out.println (index);
    }
}