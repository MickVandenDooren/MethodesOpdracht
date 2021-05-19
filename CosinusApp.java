package be.intecbrussel;

public class CosinusApp {
    public static void main(String[] args) {

        for(double d = 0; d < Math.PI*2; d+=0.1){
            System.out.println("Hoek: " + String.format("%.2f",d) + "°" + " Cos: " + String.format("%.5f",Math.cos(d)));
        }

    }
}
