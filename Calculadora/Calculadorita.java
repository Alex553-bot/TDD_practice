public class Calculadorita
{
    public int sumar(int a, int b) {
        return a+b; 
    }

    //public int restar(int a, int b) {
    //  return a-b; 

    //}
    public int restar(int a, int b){
        int result =(a - b);
        if(result<límiteMin){
            throw new RuntimeException("parece que el negativo excede la capacidad");
        }
        return result;
    }
    private int límiteMáx;
    private int límiteMin;

    //un constructor que admita límites
    public Calculadorita(int Min, int Max){
        this.límiteMin=Min;
        this.límiteMáx=Max;
    }

    public int getMínimo(){
        return this.límiteMin;
    }

    public int getMáximo(){
        return this.límiteMáx;
    }

    public boolean validarParámetros(int a, int b){
        if(a<this.límiteMin){
            throw new RuntimeException("muy chico");
        }
        if(b>this.límiteMáx){
            throw new RuntimeException("muy grande");
        }
        if(a>this.límiteMáx){
            throw new RuntimeException("muy grande, wtf");
        }
        if(b<this.límiteMin){
            throw new RuntimeException("muy chico, wtf");
        }
        return true;
    }
}