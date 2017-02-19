public class CarLoan {
    public static void main(String[] args) {
        double principal = Double.parseDouble(args[0]);
        double years = Double.parseDouble(args[1]);
        double rate = Double.parseDouble(args[2]);

        double r = rate / 12 / 100;
        double n = 12 * years;

        double payment = 0.0;
        double interest = 0.0;

        if (r == 0){
            payment = principal/12;
            interest = 0.0;
        }    
            
        else{
            payment  = (principal * r) / (1 - Math.pow(1+r, -n));
            interest = payment * n - principal;
        }

        System.out.println("Monthly payments = " + payment);
        System.out.println("Total interest   = " + interest);
                                                                                        }

}
