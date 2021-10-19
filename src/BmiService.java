public class BmiService {
    public double calculate(int mass, double stature){
        //double statureM = stature/100;
        stature = stature/100;
        double BMI = mass/Math.pow(stature,2);
        return BMI;
    }
}
