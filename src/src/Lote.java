import java.util.Objects;

public class Lote {
    private Integer quantidade;
    private String dataValidade;
    private Produto produto;

    public Lote(Integer quantidade, String dataValidade, Produto produto) {
        this.quantidade = quantidade;
        this.dataValidade = dataValidade;
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Lote{" +
                "quantidade=" + quantidade +
                ", dataValidade='" + dataValidade + '\'' +
                ", produto=" + produto +
                '}';
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lote lote = (Lote) o;
        return dataValidade.equals(lote.dataValidade) && produto.equals(lote.produto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataValidade, produto);
    }
}
