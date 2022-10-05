package Services;

import Model.Lote;
import Model.Produto;
import Repository.LoteRepository;

public class LoteService {
 private LoteRepository loteRepository;

 public LoteService(){
     this.loteRepository = new LoteRepository();
 }

 public void criarLote(Integer quantidade, String data, Produto produto){
     Lote lote = new Lote(quantidade,data, produto);
 }
}
