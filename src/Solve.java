public class Solve {

    public static void ejercicio1() {
        int y = (int) 5.89 + (int) 3.45;
        System.out.println("Ejercicio 1: " + y);
    }

    public static void ejercicio2() {
        char myChar = 'A';
        int myInt = (int) myChar;
        System.out.println("Ejercicio 2: " + myInt);
    }

    public static void ejercicio3() {
        double d = 100.04;
        long l = (long)d;
        int i = (int)l;
        System.out.println("Ejercicio 3: " + i);
    }

    public static void ejercicio4() {
        String numeroEnString = "12345";
        int numero = Integer.parseInt(numeroEnString);

        System.out.println("Ejercicio 4: El número convertido es: " + numero);
    }

    public static void ejercicio5() {
        int result = (int) (char) (byte) -1;
        System.out.println("Ejercicio 5: " + result);
    }

    public static void ejercicio6() {
        int myInt = 65;
        char myChar = (char) myInt;

        System.out.println("Ejercicio 6: " + myChar);
    }

    public static void ejercicio7() {
        System.out.println("Ejercicio 7: si intentas asignar un valor de tipo long a una variable de tipo int sin un" +
                " casteo explícito, el código no compilará y producirá un error de tipo.");
    }

    public static void ejercicio8() {
        double numeroFlotante = 3.14159;
        String cadena = Double.toString(numeroFlotante);

        System.out.println("Ejercicio 8: " + cadena);
    }

    public static void ejercicio9() {
        int result = (int) Math.round(3.7);
        System.out.println("Ejercicio 9: " + result);
    }

    public static void ejercicio10() {
        byte b = 50;
        short c = b;
        System.out.println("Ejercicio 10: " + c);
    }

    public static void ejercicio11() {
        int x = 10;
        x += 5;
        System.out.println("Ejercicio 11: " + x);
    }

    public static void ejercicio12() {
        int x = 0;
        int y = 10;
        y *= (x + 5);
        System.out.println("Ejercicio 12: " + y);
    }

    public static void ejercicio13() {
        int a = 15;
        a %= 4;
        System.out.println("Ejercicio 13: " + a);
    }

    public static void ejercicio14() {
        int x = 2;
        int y = 3;
        x += y;
        System.out.println("Ejercicio 14: " + x);
    }

    public static void ejercicio15() {
        int x = 1;
        x ^= 2;
        System.out.println("Ejercicio 15: " + x);
    }

    public static void ejercicio16() {
        int x = 5;
        System.out.println("Ejercicio 16 - El valor de x es: " + x);
        int y = ++x;
        System.out.println("El valor de y es: " + y);
    }

    public static void ejercicio17() {
        int a = 5;
        System.out.println(a++);
        System.out.println("Ejercicio 17: " + a);
    }

    public static void ejercicio18() {
        int count = 10;
        count--;
        System.out.println("Ejercicio 18 - El valor de count después de decrementar es: " + count);
    }

    public static void ejercicio19() {
        int i = 2;
        System.out.println("Ejercicio 19: ");
        System.out.println("Con i++: " + i++);
        System.out.println("Con ++i: " + ++i);

    }

    public static void ejercicio20() {
        int x = 3;
        x = x++;
        System.out.println("Ejercicio 20: " + x);
    }

    public static void ejercicio21() {
        int i = 5;
        i += ++i + i++ + ++i;
        System.out.println("Ejercicio 21: " + i);
    }

    public static void ejercicio22() {
        double myDouble = 6.5;
        int myInt = (int) myDouble;
        System.out.println("Ejercicio 22");
        System.out.println("myInt antes de incrementar: " + myInt);
        System.out.println("myInt despues de incrementar: " + ++myInt);
    }

    public static void ejercicio23() {
        double d = 5.7;
        int i = (int) d;
        i *= 2;
        System.out.println("Ejercicio 23: " + i--);
    }

    public static void ejercicio24() {
        int numeroInt = 9;
        double numeroDouble = (double) numeroInt;
        numeroDouble /= 2.0;

        System.out.println("Ejercicio 24: " + numeroDouble);
    }

    public static void ejercicio25() {
        char c = 'X';
        c += 32;

        System.out.println("Ejercicio 25: " + c);
    }

    public static void ejercicio26() {
        long numeroLong = 1000L;
        short numeroShort = (short) numeroLong;
        numeroShort *= 3;
        System.out.println("Ejercicio 26: " + numeroShort);
    }

    public static void ejercicio27() {
        int x = 10;
        x += (x++) + (++x);
        System.out.println("Ejercicio 27: " + x);
    }

    public static void ejercicio28() {
        float numeroFloat = 12.75F;
        byte numeroByte = (byte) numeroFloat;

        System.out.println("Ejercicio 28: ");
        System.out.println("Resultado antes del pre-decremento: " + numeroByte);

        --numeroByte;

        System.out.println("Resultado después del pre-decremento: " + numeroByte);
    }

    public static void ejercicio29() {
        int i = 257;
        byte b = (byte)i;
        System.out.println("Ejercicio 29: " + b);
    }

    public static void ejercicio30() {
        double numeroDouble = 7.8;
        int numeroInt = (int) numeroDouble;
        System.out.println("Ejercicio 22: ");
        System.out.println("Resultado antes de sumarle 5: " + numeroInt);

        numeroInt += 5;

        System.out.println("Resultado despues de sumarle 5: " + numeroInt);
        System.out.println("Resultado antes de sumarle 1: " + numeroInt);

        numeroInt++;

        System.out.println("Resultado despues de sumarle 1: " + numeroInt);

    }

}
