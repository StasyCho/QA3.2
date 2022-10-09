public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 70;
        float height = (float) 1.68;
        float bodyMassIndex = service.calculate(weight, height);
        System.out.println(bodyMassIndex);
    }
}