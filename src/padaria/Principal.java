package padaria;

public class Principal {

    
    public static void main(String[] args) {
       Frios produto1 = new Frios();
       produto1.setNome("Carne");
       produto1.setQuantidade(3);
       produto1.setValor(1.50);
       
       Paozinho produto2 = new Paozinho();
       produto2.setNome("Mistinho");
       produto2.setQuantidade(5);
       produto2.setValor(4.50);
       
       Doces produto3 = new Doces();
       produto3.setNome("QUEIJADINHA");
       produto3.setQuantidade(299);
       produto3.setValor(0.50);
       
       
       Pedido pedido = new Pedido();
       pedido.setProduto1(produto1);
       pedido.setProduto2(produto2);
       pedido.setProduto3(produto3);
       
       pedido.Pedir();
       
    }
        
    
}
