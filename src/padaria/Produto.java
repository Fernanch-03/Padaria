package padaria;

public class Produto {
    private String nome;
    private double valor;
    private int quantidade;

        public void setNome(String nome){
            if(nome!=""){
                this.nome = nome;
            }
        }
        public String getNome(){
            return nome;
        }
        
        public void setValor(double valor){
            this.valor = valor;
        }
        
        public double getValor(){
            return valor;
        }
        
        public void setQuantidade(int quantidade){
            this.quantidade = quantidade;
        }
        
        public int getQuantidade(){
            return quantidade;
                  
        }
    
}
