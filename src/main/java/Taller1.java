public class Taller1 {
    public static void main(String[] args){
        double[][] notas = new double[50][5];
        agregarNotas(notas);
        mostrarEstadoEstudiantes(notas);
        mostrarDatosEstudaintes(notas);


    }
    public static void agregarNotas(double[][] notas){
        for (int i = 0; i < notas.length ; i++) {
            if (notas[i][0] == 0.0){
                int contador = 0;
                while (contador <=4){
                    notas[i][contador] = notaAleatoria();
                } break;
            }
        }
    }
    public static double notaAleatoria(){
        double nota = (Math.random()*10 - 3);
        return nota;
    }
    public static double sacarPromedio(double[][] notas, double nota1, double nota2,, double nota3, double nota4, double nota5){
        double promedio = ((nota1*25 + nota2*25 + nota3*25 + nota4*15 + nota5*10)/100);
        return promedio;
    }
    public static int calcularEstudiantesAprobados(double[][] notas){
        int aprovados= 0;
        for (int i = 0; i < notaAleatoria() ; i++) {
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
        for (int i = 0; i < notaAleatoria() ; i++) {
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
        for (int i = 0; i < notaAleatoria() ; i++) {
            if (notas[i][0] != 0.0){
                double promedio = sacarPromedio(notas, notas[i][0], notas[i][1], notas[i][2], notas[i][3], notas[i][4]);
                if (promedio >= 3.6 & promedio <4.0){
                    examen++;
                }
            }
        } return examen;
    }
    public static void mostrarEstadoEstudiantes(double [][] notas){
        System.out.println("Hay " + calcularEstudiantesAprobados(notas) + " estudiantes que Aprovaron");
        System.out.println("Hay " + calcularEstudiantesReprovados(notas) + " estudiantes que Reprovaron");
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
