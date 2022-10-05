package Controller;

import Model.Produto;
import Repository.ProdutoRepository;
import Services.LoteService;
import Services.ProdutoService;

public class Controller {
    private ProdutoService produtoService;
    private LoteService loteService;


    public  Controller(){
        this.produtoService = new ProdutoService();
        this.loteService = new LoteService();

    }

    public Produto criarProduto(String nome, String fabricante, Double preco){
        return this.produtoService.criarProduto(nome, fabricante, preco);

    }

    public String listarProduto(){
        return this.produtoService.listarProduto();
    }

    public void criarLote(Integer quantidade, String data, Produto produto){
        this.loteService.criarLote(quantidade,data, produto);
    }

}

