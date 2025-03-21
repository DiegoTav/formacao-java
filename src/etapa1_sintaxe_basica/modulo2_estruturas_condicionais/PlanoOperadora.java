package etapa1_sintaxe_basica.modulo2_estruturas_condicionais;

public class PlanoOperadora {
    public static void main(String[] args) {

        String plano = "M";

        switch (plano) {
            case "T": {
                System.out.println("10G de Youtube");
            }
            case "M": {
                System.out.println("Zap e insta ilimitados");
            }

            case "B": {
                System.out.println("100min de Ligação");
            }
        }
    }
}
