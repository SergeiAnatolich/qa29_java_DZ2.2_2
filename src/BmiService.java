public class BmiService {
    public int calculate(int weight, int height) {
        int index = weight / ((height * height / 10000));
        return index;
    }
}