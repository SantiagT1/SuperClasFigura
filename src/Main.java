import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una figura para calcular:");
            System.out.println("1. Rectángulo");
            System.out.println("2. Triángulo");
            System.out.println("3. Círculo");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la base del rectángulo: ");
                    double baseRect = scanner.nextDouble();
                    System.out.print("Ingrese la altura del rectángulo: ");
                    double alturaRect = scanner.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(baseRect, alturaRect);
                    System.out.println("Área: " + rectangulo.calcularArea());
                    System.out.println("Perímetro: " + rectangulo.calcularPerimetro());
                    break;
                case 2:
                    System.out.print("Ingrese la base del triángulo: ");
                    double baseTri = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double alturaTri = scanner.nextDouble();
                    System.out.print("Ingrese el lado 1 del triángulo: ");
                    double lado1 = scanner.nextDouble();
                    System.out.print("Ingrese el lado 2 del triángulo: ");
                    double lado2 = scanner.nextDouble();
                    System.out.print("Ingrese el lado 3 del triángulo: ");
                    double lado3 = scanner.nextDouble();
                    Triangulo triangulo = new Triangulo(baseTri, alturaTri, lado1, lado2, lado3);
                    System.out.println("Área: " + triangulo.calcularArea());
                    System.out.println("Perímetro: " + triangulo.calcularPerimetro());
                    break;
                case 3:
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    Circulo circulo = new Circulo(radio);
                    System.out.println("Área: " + circulo.calcularArea());
                    System.out.println("Perímetro: " + circulo.calcularPerimetro());
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}