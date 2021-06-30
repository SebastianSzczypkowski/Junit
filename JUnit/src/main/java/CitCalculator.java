public class CitCalculator {
    public double calculateTax(double amount)
    {
        double tax;
        tax=Math.round(amount*0.19*100)/100d;
        return tax;
    }
}
