public class Main {

public static  void main(String[] args) {
    Produto produto = new Produto("leite", "Intambé", 4.50);
    Lote lote = new Lote(4, "10-10-2022", produto);
    System.out.println(produto.toString());
    System.out.println(lote.toString());
}
}
