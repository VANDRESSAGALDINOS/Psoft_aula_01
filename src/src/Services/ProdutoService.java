package Services;

import Model.Lote;
import Model.Produto;
import Repository.LoteRepository;
import Repository.ProdutoRepository;

import java.util.HashMap;

public class ProdutoService {

    private ProdutoRepository produtoRepository;
    private LoteRepository loteRepository;
    public ProdutoService() {
        ProdutoRepository produtoRepository = new ProdutoRepository();
        LoteRepository loteRepository = new LoteRepository();
    }

    public Produto criarProduto(String nome, String fabricante, Double preco){
        Produto produto = new Produto(nome,fabricante,preco);
        this.produtoRepository.adicionarProduto(produto);
        return produto;
    }

    public String listarProduto(){
        HashMap<String, Produto> produtoHashMap = this.produtoRepository.findAll();
        String retorno = "";
        for (Produto produto: produtoHashMap.values()) {
           retorno += produto.toString() + " ";
        }
        return retorno.trim();
    }

    public void criarLote(Produto produto){
        Lote lote = new Lote(40,"10")
    }

    public String listarLote(){
        HashMap<Integer, Lote> loteHashMap = this.loteRepository.findAll();
        String retorno = "";
        for (Lote lote: loteHashMap.values()) {
            retorno += lote.toString() + " ";
        }
        return retorno.trim();
    }
}
