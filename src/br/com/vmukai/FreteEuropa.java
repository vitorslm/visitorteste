package br.com.vmukai;

public class FreteEuropa implements Visitor {

    public double visit(Produto produto) {
        return produto.getFreteEuropa();
    }

}
