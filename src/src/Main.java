
import Controller.Controller;
import Services.ProdutoService;

import javax.naming.ldap.Control;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();


    }

    private static void criarProduto(Controller controller) {
        controller.criarProduto("ProdutoX", "Fabricante X", 10.50);
    }

    private static  void listarProdutos(Controller controller){
        System.out.printf(controller.listarProduto());
    }

    private static void criarLote(Controller controller){
        System.out.printf(controller.criaLote());
    }
}
