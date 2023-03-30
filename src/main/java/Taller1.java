public class Taller1 {
    public static void main(String[] args){
        double[][] notas = new double[50][5];
        agregarNotas(notas);


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

}
