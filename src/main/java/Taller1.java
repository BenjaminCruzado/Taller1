import java.util.Scanner;

public class Taller1 {
    public static void main(String[] args){
        menu();
    }
    public static void menu(){
        Scanner entrada = new Scanner(System.in);
        double[][] notas = new double[50][5];
        while(true){
            System.out.println("1 Agregar estudiante");
            System.out.println("2 Mostrar cantidad de estudiantes que aprueban la asignatura");
            System.out.println("3 Mostrar cantidad de estudiantes que reprueban la asignatura");
            System.out.println("4 Mostrar la cantidad de estudiantes que van a examen");
            System.out.println("5 Mostrar el estado de todos los estudiantes de la asignatura (notas y promedio)");
            System.out.println("6 Salir");
            System.out.println("Ingrese el numero de la opcion que desea: ");
            int opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    agregarNotas(notas);
                    break;
                case 2:
                    mostrarEstudiantesAprovados(notas);
                    break;
                case 3:
                    mostrarEstudiantesReprovados(notas);
                    break;
                case 4:
                    mostrarEstudiantesExamen(notas);
                    break;
                case 5:
                    mostrarDatosEstudaintes(notas);
                    break;
                case 6:
                    System.exit(0);

            }

        }
    }
    public static void agregarNotas(double[][] notas){
        if (notas[49][0] != 0.0) {
            System.out.println("Ya esta lleno el cupo de estudiantes");
            return;

        }
        for (int i = 0; i < notas.length ; i++) {
            if (notas[i][0] == 0.0){
                int contador = 0;
                while (contador <=4){
                    notas[i][contador] = notaAleatoria();
                    contador++;
                } break;
            }
        }
    }
    public static double notaAleatoria(){
        double nota = (Math.random()*6) + 1;
        return nota;
    }
    public static double sacarPromedio(double[][] notas, double nota1, double nota2, double nota3, double nota4, double nota5){
        double promedio = ((nota1*25 + nota2*25 + nota3*25 + nota4*15 + nota5*10)/100);
        return promedio;
    }
    public static int calcularEstudiantesAprobados(double[][] notas){
        int aprovados= 0;
        for (int i = 0; i < notas.length ; i++) {
            if (notas[i][0] != 0.0){
                double promedio = sacarPromedio(notas, notas[i][0], notas[i][1], notas[i][2], notas[i][3], notas[i][4]);
                if (promedio >= 4.0){
                    aprovados++;
                }
            }
        } return aprovados;
    }
    public static int calcularEstudiantesReprovados(double[][] notas){
        int reprovados= 0;
        for (int i = 0; i < notas.length ; i++) {
            if (notas[i][0] != 0.0){
                double promedio = sacarPromedio(notas, notas[i][0], notas[i][1], notas[i][2], notas[i][3], notas[i][4]);
                if (promedio < 3.6){
                    reprovados++;
                }
            }
        } return reprovados;
    }
    public static int calcularEstudiantesExamen(double[][] notas){
        int examen= 0;
        for (int i = 0; i < notas.length ; i++) {
            if (notas[i][0] != 0.0){
                double promedio = sacarPromedio(notas, notas[i][0], notas[i][1], notas[i][2], notas[i][3], notas[i][4]);
                if (promedio >= 3.6 & promedio <4.0){
                    examen++;
                }
            }
        } return examen;
    }
    public static void mostrarEstudiantesAprovados(double [][] notas){
        System.out.println("Hay " + calcularEstudiantesAprobados(notas) + " estudiantes que Aprovaron");
    }
    public static void mostrarEstudiantesReprovados(double [][] notas){
        System.out.println("Hay " + calcularEstudiantesReprovados(notas) + " estudiantes que Reprovaron");
    }
    public static void mostrarEstudiantesExamen(double [][] notas){
        System.out.println("Hay " + calcularEstudiantesExamen(notas) + " estudiantes que tienen que dar Examen");
    }
    public static void mostrarDatosEstudaintes(double[][] notas){
        for (int i = 0; i < notas.length ; i++) {
            if(notas[i][0] != 0.0) {
                double promedio = sacarPromedio(notas, notas[i][0], notas[i][1], notas[i][2], notas[i][3], notas[i][4]);
                System.out.println("Estudiante " + (i + 1) + ":");
                System.out.println("Nota 1: " + notas[i][0]);
                System.out.println("Nota 2: " + notas[i][1]);
                System.out.println("Nota 3: " + notas[i][2]);
                System.out.println("Nota 4: " + notas[i][3]);
                System.out.println("Nota 5: " + notas[i][4]);
                System.out.println("Promedio: " + promedio);
            }
        }
    }
}
