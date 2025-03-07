public class My66_convertTemperature {
    static double[] convertTemperature(double celsius) {
        double kel = celsius + 273.15;
        double fah = celsius * 1.80 + 32.00;

        return new double[] {kel, fah};
    }

    public static void main(String[] args) {
        double celsius = 37.00;
        double[] result = convertTemperature(celsius);
        System.out.println("Kelvin: " + result[0]);
        System.out.println("Fahrenheit: " + result[1]);
    }
}
