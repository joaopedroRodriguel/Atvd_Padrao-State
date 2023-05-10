package br.edu.ifpb;

import br.edu.ifpb.EstadoAplicacao.PedidoEmPreparacao;
public class Pedido implements PedidoState {
    private PedidoState pedidoState;
    private boolean Problem = false;
    public boolean Problem() {
        return Problem;
    }
    public void setProblem(boolean problem) {
        Problem = problem;
    }
    public void setState(PedidoState pedidoState) {
        this.pedidoState = pedidoState;
    }
    public Pedido() {this.pedidoState = new PedidoEmPreparacao(this);}
    public void enviarPedido() {
        pedidoState.enviarPedido();
    }
    public void Status() {
        pedidoState.Status();
    }
}
