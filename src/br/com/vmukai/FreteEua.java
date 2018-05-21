package br.com.vmukai;

public class FreteEua implements Visitor {

    public double visit(Produto produto){
        return produto.getFreteEua();
    }

}
