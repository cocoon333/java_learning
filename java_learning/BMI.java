public class BMI{
    public static void main(String[] args){
        double h = Double.parseDouble(args[0]);
        double w = Double.parseDouble(args[1]);
        double bmi = w / (h * h);

        if (bmi < 15) System.out.println("You are in Starvation! You are going to die if you don't get some food!");
        else if (bmi < 17.5) System.out.println("You are an Anorexic! Get some food!");
        else if (bmi < 18.5) System.out.println("You are Underweight! Get some food!");
        else if (bmi < 25) System.out.println("You are IDEAL! Good Job!");
        else if (bmi < 30) System.out.println("You are Overweight! Go to the gym!");
        else if (bmi < 40) System.out.println("You are Obese! Go to the gym!");
        else System.out.println("You are Morbidly Obese! You are going to die if you don't go to the gym!");

        System.out.println("Your BMI is " + bmi);
    }
}
