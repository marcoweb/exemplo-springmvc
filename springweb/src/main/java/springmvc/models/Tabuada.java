package springmvc.models;

public class Tabuada {
    private int multiplicador = 0;
    private int[] resultados;

    public int getMultiplicador() {
        return multiplicador;
    }

    public int []getResultados() {
        if(!(this.resultados instanceof int[])){
            this.resultados = new int[10];
            for(int num = 1; num <= 10;num++) {
                this.resultados[num-1] = num * this.multiplicador;
            }
        }
        return this.resultados;
    }

    public Tabuada(int multiplicador) {
        this.multiplicador = multiplicador;
    }
}
