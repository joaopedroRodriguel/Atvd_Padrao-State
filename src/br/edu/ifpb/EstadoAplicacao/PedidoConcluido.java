package br.edu.ifpb.EstadoAplicacao;

import br.edu.ifpb.Pedido;
import br.edu.ifpb.PedidoState;

public class PedidoConcluido implements PedidoState {
    Pedido pedido;
    public PedidoConcluido(Pedido pedido) {
        this.pedido = pedido;
    }
    @Override
    public void enviarPedido() {
        if(this.pedido.Problem()){
            System.out.println("Aconteceu um erro com o seu pedido, vamos fazer um novo envio do pedido");
            this.pedido.setProblem(false);
            pedido.setState(new PedidoEmPreparacao(this.pedido));
        }else{
            System.out.println("Pedido foi Concluído com Sucesso");
        }
    }
    @Override
    public void Status() {
        System.out.println("Status do pedido : Finalizado");
    }
}
