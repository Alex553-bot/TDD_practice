public class Calculadora
{
    private int límiteMáx;
    private int límiteMin;

    //un constructor que admita límites
    public Calculadora(int min, int max) {
        límiteMin = min;
        límiteMáx = max;
    }

    public int sumar(int a, int b) {
        validarParámetros(a, b);
        int result = (a+b);
        if (result>límiteMáx) {
            throw RuntimeException(
                "el resultado excede al limite superior");
        }
        return result; 
    }

    public int restar(int a, int b) {
        validarParámetros(a, b);
        int result = (a - b);
        if (result<límiteMin) {
            throw new RuntimeException(
                "el resultado excede al limite inferior");
        }
        return result;
    }
    

    public int getMínimo() {
        return límiteMin;
    }

    public int getMáximo() {
        return límiteMáx;
    }

    public void setNuevosLimites(int limiteInferior, int limiteSuperior) {
        límiteMin = limiteInferior;
        límiteMáx = limiteSuperior;
    }
    
    public boolean validarParámetros(int a, int b){
        if (a<this.límiteMin) {
            throw new RuntimeException(
                "el primer termino es muy chico");
        }
        if (b>this.límiteMáx) {
            throw new RuntimeException(
                "el segundo termino es muy grande");
        }
        if (a>this.límiteMáx) {
            throw new RuntimeException(
                "el primer termino es muy grande");
        }
        if (b<this.límiteMin) {
            throw new RuntimeException(
                "el segundo termino es muy chico");
        }
        return true;
    }
}