package operation;

public class CalculateAction {
	public static String calculateDiscount(double a, double b) {
        double result = a - (a * (b / 100));
        return "R$ " + String.format("%.2f", result);
    }
	
	public static String incrementValue(double a, double b) {
		double result = a + (a * (b / 100));
        return "R$ " + String.format("%.2f", result);
	}
	
	public static String getXInYPercentage(double a, double b) {
		double result = (a * b) / 100;
		return String.format("%.2f", result);
	}
	
	public static String getXInYValue(double a, double b) {
		double result = (b / a) * 100;
		return String.format("%.2f", result) + "%";
	}
	
	public static String calculateDiscountWithValues(double a, double b) {
		double result = ((a - b) / a) * 100;
		return String.format("%.2f", result) + "%";
	}
	
	public static String calculateDeltaVariation(double a, double b) {
		double result = ((b-a)/a) * 100;
		return String.format("%.2f", result) + "%";
	}
	
	public static String calculateInicialValueWithoutDiscount(double a, double b) {
		double result = (a*100 / (100 - b));
		return String.format("%.2f", result);
	}
	
	public static String calculateRuleOfThree(double a, double b, double r1) {
		double result = (r1 * b) / a;
		return String.format("%.2f", result);
	}

}
