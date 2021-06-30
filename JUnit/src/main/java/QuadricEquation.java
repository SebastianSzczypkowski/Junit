import java.util.Scanner;

public class QuadricEquation {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj współczynnik a= ");
        double a = scanner.nextDouble();
        System.out.println("Podaj współczynnik b= ");
        double b = scanner.nextDouble();
        System.out.println("Podaj współczynnik c= ");
        double c = scanner.nextDouble();
        scanner.close();
        Solver solver=new Solver(a,b,c);
        double[] result =solver.solve();
        if(result == null)
        {
            System.out.println("Brak rozwiązań");
        }
        else {
            for(double d : result)
            {
                System.out.println("Rozwiązenie dla x=" + d);
            }
        }
    }
}
