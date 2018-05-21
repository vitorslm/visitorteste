package br.com.vmukai;

public class FreteChina implements Visitor {

    public double visit(Produto produto){
        return produto.getFreteChina();
    }
}
