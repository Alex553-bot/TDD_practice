
public class Calculadora {
    public char jerarquia(String expresion) {
        char op = ' ';
        for (int i = 0; i<expresion.length(); i++) {
            if (operador(expresion.charAt(i))) {
                if (comparar(op, expresion.charAt(i))) {
                    op = expresion.charAt(i);
                }
            }
        }
        return op;
    }
    
    public boolean operador(char a) {
        return (a >= 42 && a <= 47);        
    }
    
    public boolean comparar(char a, char b) {
        if (b == '*' || b == '/' || a == ' ') {
            return true;
        }
        return false;
    }
}