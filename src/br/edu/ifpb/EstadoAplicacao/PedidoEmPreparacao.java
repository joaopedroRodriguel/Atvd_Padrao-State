package br.edu.ifpb.EstadoAplicacao;

import br.edu.ifpb.Pedido;
import br.edu.ifpb.PedidoState;

public class PedidoEmPreparacao implements PedidoState {
    private Pedido pedido;
    public PedidoEmPreparacao(Pedido pedido) {
        this.pedido = pedido;
    }
    @Override
    public void enviarPedido() {
        System.out.println("Pedido sendo enviado para a tranportadora");
        pedido.setState(new PedidoEmTransito(this.pedido));
    }
    @Override
    public void Status() {
        System.out.println("Status do pedido: Pedido sendo preparado");
    }
}
