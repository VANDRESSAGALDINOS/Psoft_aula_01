
import Controller.Controller;
import Model.Lote;
import Model.Produto;
import Services.ProdutoService;

import javax.naming.ldap.Control;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        Produto produtoA = criarProduto(controller, "ProdutoX", "Fabricante X", 10.50);
       criarLote(controller, 45, "12-10-2024", produtoA);
    }

    private static Produto criarProduto(Controller controller, String nome, String fabricante, Double preco) {
        return controller.criarProduto("ProdutoX", "Fabricante X", 10.50);
    }

    private static void listarProdutos(Controller controller){
        System.out.printf(controller.listarProduto());
    }

    private static void criarLote(Controller controller, Integer quantidade, String data, Produto produto){
       controller.criarLote(45, "12-10-2024", produto);
    }

}

