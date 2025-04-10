import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner; /* linea obligatoria en el proyecto*/

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in); /* linea obligatoria en el proyecto*/

        System.out.println("Ingrese nombre del estudiante: ");
        String nombreEstudiante = sc.nextLine();
        System.out.println("ingrese el documento del estudiante: ");
        String documentoEstudiante = sc.nextLine();
        System.out.println("Seleccione el programa: \n1 - Desarrollo de software: \n2 - Diseñografico: \n3 - gastronomía");
        String programa = sc.nextLine();
        switch (programa){
            case"1":
                System.out.println("Programa de desarrollo de software");
                System.out.println("Seleccione la materia: \n1 - Lógica de programación: \n2 - Metodologias agiles: \n3 - Introducción a la programación: ");
                String materia=sc.nextLine();
                switch (materia) {
                    case"1":
                        System.out.println("Nota Lógica de programación");
                        break;
                    case"2":
                        System.out.println("Nota Metodologias agiles");
                        break;
                    case"3":
                        System.out.println("Nota Introducción a la programación");
                        break;
                }
                break;
            case"2":
                System.out.println("Programa de diseño grafico");
                break;
            case"3":
                System.out.println("Programa de gastronomia");
                break;

        }


        }

}