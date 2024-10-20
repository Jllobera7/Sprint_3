import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaramos el valor de la constante largo que es igual en las dos
        final float piscina_largo = 300.3f;
        // Ahora pediremos que introduzcan los siguientes valores por teclado
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserte el ancho de la piscina 1: ");
        float piscina1_ancho = sc.nextFloat();
        System.out.print("Inserte la profundidad de la piscina 1: ");
        float piscina1_profundidad = sc.nextFloat();
        System.out.print("Inserte el ancho de la piscina 2: ");
        float piscina2_ancho = sc.nextFloat();
        System.out.print("Inserte la profundidad de la piscina 2: ");
        float piscina2_profundidad = sc.nextFloat();

        // Añadiendo trazas
        System.out.println("TR: Profundidad de la piscina 1 inicialmente: " + piscina1_profundidad);
        System.out.println("TR: Profundidad de la piscina 2 inicialmente: " + piscina2_profundidad);

        // Declaramos, calculamos y mostramos las nuevas siguientes variables
        // El área de las piscinas
        int area_piscina1 = (int)(piscina1_ancho * piscina_largo); // Estamos realizando una conversión de tipo
        int area_piscina2 = (int)(piscina2_ancho * piscina_largo); // Estamos realizando una conversión de tipo

        System.out.println("El área de la piscina 1 es: " + area_piscina1);
        System.out.println("El área de la piscina 2 es: " + area_piscina2);

        // El volumen de las piscinas
        int volumen_piscina1 = (int)(area_piscina1 * piscina1_profundidad); // Estamos realizando una conversión de tipo
        int volumen_piscina2 = (int)(area_piscina2 * piscina2_profundidad); // Estamos realizando una conversión de tipo

        System.out.println("El volumen de la piscina 1 es: " + volumen_piscina1);
        System.out.println("El volumen de la piscina 2 es: " + volumen_piscina2);

        // El espacio total cuando están juntas las dos piscinas
        float espacio_ancho_total = piscina1_ancho + piscina2_ancho;
        float espacio_largo_total = piscina_largo;

        System.out.println("El ancho total es: " + espacio_ancho_total);
        System.out.println("El largo total es: " + espacio_largo_total);

        // El área de las dos piscinas juntas
        int area_total = (int)(espacio_ancho_total * espacio_largo_total); // Estamos realizando una conversión de tipo

        System.out.println("El área total de las dos piscinas es: " + (int)area_total);

        // El volumen de las dos piscinas juntas
        int volumen_total = (int)(volumen_piscina1 + volumen_piscina2); // Estamos realizando una conversión de tipo

        System.out.println("El volumen total es: " + volumen_total);

        // Ahora volveremos a calcular float intercambiando la profundidad de las piscinas
        float piscina1Profundidadtemporal = piscina1_profundidad;
        piscina1_profundidad = piscina2_profundidad;
        piscina2_profundidad = piscina1Profundidadtemporal;

        // Añadiendo trazas después del intercambio
        System.out.println("TR: Nueva profundidad de piscina 1 : " + piscina1_profundidad);
        System.out.println("TR: Nueva profundidad de piscina 2 : " + piscina2_profundidad);

        // Calculamos los nuevos volúmenes después del intercambio
        volumen_piscina1 = (int)(area_piscina1 * piscina1_profundidad); // Estamos realizando una conversión de tipo
        volumen_piscina2 = (int)(area_piscina2 * piscina2_profundidad); // Estamos realizando una conversión de tipo

        System.out.println("El nuevo volumen de la piscina 1 es: " + volumen_piscina1);
        System.out.println("El nuevo volumen de la piscina 2 es: " + volumen_piscina2);

        sc.close();
    }
}
