package model;

public class Produto {
    private int id;
    private String descrição;
    private int estoque;
    private double valorCompra;
    private double valorVenda;
    private boolean ativo;
    
    public Produto(){
        
    }
    
    public Produto(int id,String descriçao,int estoque,double valorCompra,double valorVenda, boolean ativo){
        this.id = id;
        this.descrição = descriçao;
        this.estoque = estoque;
        this.valorCompra = valorCompra;
        this.valorVenda = valorVenda;
        this.ativo = ativo;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    
}
