
package dao;
import java.util.ArrayList;
import java.util.List;
import model.Produto;

public class ProdutoDAO {
    private static final List<Produto> produtos = new ArrayList();
    public static void salvar( Produto produto){
    produtos.add(produto);
    }
}
