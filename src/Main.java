import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int codigo;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("MENU");
            System.out.println("1. Casteo");
            System.out.println("2. Operadores de Asignación");
            System.out.println("3. Operadores de Incremento y Decremento");
            System.out.println("4. Ejercicios Combinados");
            System.out.print("Ingrese su elección: ");
            codigo = scanner.nextInt();

            switch (codigo) {
                case 1:
                    int numeroIngresado;
                    do {
                        System.out.println("Ingrese del 1 al 10 o 0 para salir:");
                        numeroIngresado = scanner.nextInt();
                        switch (numeroIngresado) {
                            case 1:
                                Solve.ejercicio1();
                                break;
                            case 2:
                                Solve.ejercicio2();
                                break;
                            case 3:
                                Solve.ejercicio3();
                                break;
                            case 4:
                                Solve.ejercicio4();
                                break;
                            case 5:
                                Solve.ejercicio5();
                                break;
                            case 6:
                                Solve.ejercicio6();
                                break;
                            case 7:
                                Solve.ejercicio7();
                                break;
                            case 8:
                                Solve.ejercicio8();
                                break;
                            case 9:
                                Solve.ejercicio9();
                                break;
                            case 10:
                                Solve.ejercicio10();
                                break;
                            case 0:
                                System.out.println("Saliendo del submenú de Casteo.");
                                break;
                            default:
                                System.out.println("Opción inválida. Por favor, ingrese un número del 1 al 10 o 0 para salir.");
                                break;
                        }
                    } while (numeroIngresado != 0);
                    break;
                case 2:
                    int numeroIngresado2;
                    do {
                        System.out.println("Ingrese del 1 al 5 o 0 para salir:");
                        numeroIngresado2 = scanner.nextInt();
                        switch (numeroIngresado2) {
                            case 1:
                                Solve.ejercicio11();
                                break;
                            case 2:
                                Solve.ejercicio12();
                                break;
                            case 3:
                                Solve.ejercicio13();
                                break;
                            case 4:
                                Solve.ejercicio14();
                                break;
                            case 5:
                                Solve.ejercicio15();
                                break;
                            case 0:
                                System.out.println("Saliendo del submenú de Operadores de Asignación.");
                                break;
                            default:
                                System.out.println("Opción inválida. Por favor, ingrese un número del 1 al 5 o 0 para salir.");
                                break;
                        }
                    } while (numeroIngresado2 != 0);
                    break;
                case 3:
                    int numeroIngresado3;
                    do {
                        System.out.println("Ingrese del 1 al 5 o 0 para salir:");
                        numeroIngresado3 = scanner.nextInt();
                        switch (numeroIngresado3) {
                            case 1:
                                Solve.ejercicio16();
                                break;
                            case 2:
                                Solve.ejercicio17();
                                break;
                            case 3:
                                Solve.ejercicio18();
                                break;
                            case 4:
                                Solve.ejercicio19();
                                break;
                            case 5:
                                Solve.ejercicio20();
                                break;
                            case 0:
                                System.out.println("Saliendo del submenú de Incremento y Decremento.");
                                break;
                            default:
                                System.out.println("Opción inválida. Por favor, ingrese un número del 1 al 5 o 0 para salir.");
                                break;
                        }
                    } while (numeroIngresado3 != 0);
                    break;
                case 4:
                    int numeroIngresado4;
                    do {
                        System.out.println("Ingrese del 1 al 10 o 0 para salir:");
                        numeroIngresado4 = scanner.nextInt();
                        switch (numeroIngresado4) {
                            case 1:
                                Solve.ejercicio21();
                                break;
                            case 2:
                                Solve.ejercicio22();
                                break;
                            case 3:
                                Solve.ejercicio23();
                                break;
                            case 4:
                                Solve.ejercicio24();
                                break;
                            case 5:
                                Solve.ejercicio25();
                                break;
                            case 6:
                                Solve.ejercicio26();
                                break;
                            case 7:
                                Solve.ejercicio27();
                                break;
                            case 8:
                                Solve.ejercicio28();
                                break;
                            case 9:
                                Solve.ejercicio29();
                                break;
                            case 10:
                                Solve.ejercicio30();
                                break;
                            case 0:
                                System.out.println("Saliendo del submenú de Ejercicios Combinados.");
                                break;
                            default:
                                System.out.println("Opción inválida. Por favor, ingrese un número del 1 al 10 o 0 para salir.");
                                break;
                        }
                    } while (numeroIngresado4 != 0);
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese un número del 1 al 4.");
                    break;
            }

            System.out.println();

        } while (codigo != 4);

        scanner.close();
    }
}
