import java.util.Scanner;

public class Ejercicio4 {
    /*Sabiendo que:

Para cocinar 500 gramos de carne de vacuno, se necesita:

10 minutos si quieres una cocción casi cruda

17 minutos si quieres una cocción al punto

25 minutos si quieres una cocción bien hecha

Para cocinar 400 gramos de cordero se necesita:

15 minutos si quieres una cocción casi cruda

25 minutos si quieres una cocción al punto

40 minutos si quieres una cocción bien hecha

El tiempo de cocción es proporcional al peso.

Dependiendo de la información introducida por el usuario (tipo de carne, modo de cocción y peso), mostrar el tiempo de cocción de una carne en segundos.*/
    public static void main(String[] args) {
        System.out.println("Introduzca el tipo de carne (vacuno, cordero):");
        Scanner sc = new Scanner(System.in);
        String carne = sc.nextLine();
        System.out.println("Introduzca el modo de cocción (crudo, punto, bien):");
        String coccion = sc.nextLine();
        System.out.println("Introduzca el peso en gramos:");
        int peso = sc.nextInt();
        int tiempo = 0;
        switch (carne) {
            case "vacuno":
                switch (coccion) {
                    case "crudo":
                        tiempo = 10;
                        break;
                    case "punto":
                        tiempo = 17;
                        break;
                    case "bien":
                        tiempo = 25;
                        break;
                    default:
                        System.out.println("Modo de cocción incorrecto");
                        break;
                }
                break;
            case "cordero":
                switch (coccion) {
                    case "crudo":
                        tiempo = 15;
                        break;
                    case "punto":
                        tiempo = 25;
                        break;
                    case "bien":
                        tiempo = 40;
                        break;
                    default:
                        System.out.println("Modo de cocción incorrecto");
                        break;
                }
                break;
            default:
                System.out.println("Tipo de carne incorrecto");
                break;
        }
        System.out.println("El tiempo de cocción es de " + tiempo * peso + " segundos");
    }
}
