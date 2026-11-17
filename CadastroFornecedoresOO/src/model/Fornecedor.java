
package model;

/**
 *
 * @author GUSTAVODELIMADOSSANT
 */
public class Fornecedor {
    private int id;
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;
    private String endereço;
    private String uf;
    private boolean ativo;
    
    public Fornecedor(){
    }
    
    public Fornecedor(int id,String razaoSocial,String nomeFantasia,String cnpj,String endereço,String uf,boolean ativo){
        this.id=id;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.endereço = endereço;
        this.uf = uf;
        this.ativo = ativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    
            
    
    
}
