import java.util.Scanner;

public class Solver {
    private  double a,b,c;
    public Solver(double a, double b, double c) {
        super();
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double[] solve()
    {

        double[] results = null;
        if(a==0)
        {
            throw new IllegalArgumentException("To nie jest rownanie kwadratowe!!!");
        }
        double delta = delta(a,b,c);
        if(delta>0)
        {
            results = new double[2];
            results[0]=(-b-Math.sqrt(delta))/(2*a);
            results[1]=(-b+Math.sqrt(delta))/(2*a);
        }else if(delta==0){
            results=new  double[1];
            results[0]=-b/(2*a);
        }
        return results;
    }

    private double delta(double a, double b, double c) {
        return b*b-4*a*c;
    }
}
