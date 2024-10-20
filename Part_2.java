// Mi Pseudocódigo
//INICIO
        //preguntar numero de expediente al niño
        //crear variable puntos = 0
        //preguntar si tiene al menos un hermano en el centro
        //si tiene +40 puntos
       // preguntar si vive en la misma población
       // si es verdadero +30 puntos
        //sino se pregunta Si el padre o madre trabaja en la misma población
        //si es verdadero +20puntos
        //preguntar  si tiene alguna discapacidad igual o superior al 33% o enfermedad crónica
        //si es verdadero 10 puntos
        //preguntar si forma parte de familia numerosa o monoparental
        //si es verdadero +15puntos
        //preguntar si el padre/madre/tutor o hermano ha sido escolarizado en la misma escuela
       // si es verdadero +5puntos
// FIN


import java.util.Scanner;
public class Main {
    public static int preguntarPuntos(Scanner sc, String pregunta, int puntosSi) {
        System.out.print(pregunta + " (0: no / 1: sí): ");
        int respuesta = sc.nextInt();
        return (respuesta == 1) ? puntosSi : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, inserte el número de expediete del alumno: ");

        int numExpedienteNino = sc.nextInt();
        int puntos =0;


        puntos += preguntarPuntos(sc, "¿Tiene algún hermano en el centro?", 40);
        puntos += preguntarPuntos(sc, "¿Vive en la misma población que la escuela?", 30);
        puntos += preguntarPuntos(sc, "¿El padre, madre, tutor o hermano ha sido escolarizado en la misma escuela?", 5);
        puntos += preguntarPuntos(sc, "¿Forma parte de una familia numerosa o monoparental?", 15);
        puntos += preguntarPuntos(sc, "¿Tiene discapacidad igual o superior al 33% o enfermedad crónica?", 10);
        puntos += preguntarPuntos(sc, "¿El padre o madre trabaja en la misma población que la escuela?", 20);


        System.out.println("El niño con expediente " + numExpedienteNino + " tiene " + puntos + " puntos.");

        sc.close();
    }
}
