package operation;

public class CalculateAction {
	public static String calculateDiscount(double a, double b) {
        double resultado = a - (a * (b / 100));
        return "R$ " + String.format("%.2f", resultado);
    }
}
