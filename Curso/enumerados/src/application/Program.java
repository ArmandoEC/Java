package application;


import java.time.LocalDateTime;

import entites.Pedido;
import entites.enume.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido(1008, LocalDateTime.now(), OrderStatus.ENTREGUE); //INSTANCIANDO O OBJETO PEDIDO
		
		System.out.println(pedido);
		
		pedido.setStatus(OrderStatus.PROCESSANDO);//ALTERANDO O STATUS DO PEDIDO ATRAVÉS DO PROPRIO STATUS
		
		System.out.println(pedido);
		
		pedido.setStatus(OrderStatus.valueOf("PENDENTE_PAGAMENTO"));//ALTERANDO DE ACORDO COM O QUE O USUÁRIO DIGITAR CONVERTENDO O STRING EM STATUS
		
		System.out.println(pedido);

	}

}
