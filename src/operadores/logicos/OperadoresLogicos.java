package operadores.logicos;

public class OperadoresLogicos {
    public static void main(String[] args){
        // && (and -> e), || (or -> ou), ! (not -> negacao)
        // true && false = false
        // false && false = false
        // true && true = true
        // true || false = true
        // true || true = true
        // false || false = false
        // ! -> inverte o bollean, !true = false, !false + true
        boolean resultado = true || false;
        System.out.println(resultado);
    }
}
