
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Fornecedor;


public class FornecedorDAO {
    private static final List<Fornecedor> fornecedores = new ArrayList<>(); 
    
    public static void Salvar(Fornecedor fornecedor){
        fornecedores.add(fornecedor);
}
    
    public static List<Fornecedor> listar(){
    return fornecedores;
    
    }
    
    public static Fornecedor buscarID(Integer id){
        for(Fornecedor fornecedor : fornecedores){
            if(fornecedor.getId() == id){
                return fornecedor;
            }
        }
      return null;  
    }
    
    public static Fornecedor bucarRazao(String buscarRazao){
        for(Fornecedor fornecedor : fornecedores){
            if(fornecedor.getRazaoSocial().toLowerCase().contains(buscarRazao.toLowerCase())){
                return fornecedor;
            }
        }
      return null;  
    }
    
     public static Fornecedor bucasrNome(String buscarNome){
        for(Fornecedor fornecedor : fornecedores){
            if(fornecedor.getRazaoSocial().toLowerCase().contains(buscarNome.toLowerCase())){
                return fornecedor;
            }
        }
      return null;  
    }
    
}
