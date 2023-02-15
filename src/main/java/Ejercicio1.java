import java.util.Scanner;
public class Ejercicio1 {
    //Escriba un algoritmo que muestre "riesgo de hielo", si la temperatura introducida es inferior a 2°C.
    public static void main(String[] args) {
        System.out.println("Introduzca la temperatura:");
        Scanner sc = new Scanner(System.in);
        int temperatura = sc.nextInt();
        if (temperatura < 2) {
            System.out.println("Riesgo de hielo");
        }
    }
}
