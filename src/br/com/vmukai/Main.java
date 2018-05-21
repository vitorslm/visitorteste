package br.com.vmukai;

public class Main {

    public static void main(String[] args) {

        Produto produto1 = new Produto("Notebook", 1600.00, 10.00, 15.00, 20.00);

        FreteChina freteChina = new FreteChina();
        FreteEua freteEua = new FreteEua();
        FreteEuropa freteEuropa = new FreteEuropa();

        System.out.println("Valor do frete do " + produto1.getNome() + " para China é de: " + produto1.accept(freteChina));
        System.out.println("Valor do frete do " + produto1.getNome() + " para EUA é de: " + produto1.accept(freteEua));
        System.out.println("Valor do frete do " + produto1.getNome() + " para Europa é de: " + produto1.accept(freteEuropa));

    }
}
