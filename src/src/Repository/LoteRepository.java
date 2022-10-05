package Repository;

import Model.Lote;


import java.util.HashMap;

public class LoteRepository {
    private HashMap<Integer, Lote> loteHashMap;

    public LoteRepository(){
        this.loteHashMap = new HashMap<>();
    }

    public void adicionarLote(Lote lote){
        this.loteHashMap.put(lote.hashCode(), lote);
    }

    public HashMap<Integer, Lote> findAll() {
        return this.loteHashMap;
    }
}
