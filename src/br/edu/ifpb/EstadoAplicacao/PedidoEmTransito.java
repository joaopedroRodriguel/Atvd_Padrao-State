package br.edu.ifpb.EstadoAplicacao;

import br.edu.ifpb.Pedido;
import br.edu.ifpb.PedidoState;

public class PedidoEmTransito implements PedidoState {
    private Pedido pedido;
    public PedidoEmTransito(Pedido pedido) {
        this.pedido = pedido;
    }
    @Override
    public void enviarPedido() {
        System.out.println("Pedido sendo enviado para o cliente");
        pedido.setState(new PedidoEntregue(this.pedido));
    }
    @Override
    public void Status() {
        System.out.println("Status do pedido: Pedido em trânsito");
    }
}
