package Repository;

import Model.Produto;

import java.util.HashMap;

public class ProdutoRepository {

    private HashMap<String,Produto> produtoHashMap;

    public ProdutoRepository(){
        this.produtoHashMap = new HashMap<>();
    }

    public void adicionarProduto(Produto produto){
        this.produtoHashMap.put(produto.getNome(), produto);
    }

    public HashMap<String, Produto> findAll() {
        return this.produtoHashMap;
    }
}
