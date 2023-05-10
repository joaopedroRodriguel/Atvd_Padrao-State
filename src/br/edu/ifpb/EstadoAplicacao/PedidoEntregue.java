package br.edu.ifpb.EstadoAplicacao;

import br.edu.ifpb.Pedido;
import br.edu.ifpb.PedidoState;

public class PedidoEntregue implements PedidoState {
    private Pedido pedido;
    public PedidoEntregue(Pedido pedido) {
        this.pedido = pedido;
    }
    @Override
    public void enviarPedido() {

        pedido.setState(new PedidoConcluido(this.pedido));
    }
    @Override
    public void Status() {
        System.out.println("Status do pedido: Pedido Entregue");
    }
}
