package estruturascondicional;

public class CondicaoTernaria {
    public static void main(String[] args){
        String palavra = "Perdeu";

        if(palavra.equals("Sucesso!")){
            System.out.println("Parabéns você venceu!");
        } else {
            System.out.println("Sinto muito, mas não foi dessa vez.");
        }

        String palavraretornada = palavra.equals("Sucesso!") ? "Parabéns você venceu!" : "Sinto muito, mas não foi dessa vez.";
        System.out.println(palavraretornada);
    }
}
