package entites;


import java.time.LocalDateTime;

import entites.enume.OrderStatus;

public class Pedido {
	private int id;
	private LocalDateTime momento;
	private OrderStatus status; //CRIANDO A CLASSE PEDIDO COM O STATUS DELE
	
	public  Pedido() {
		
	}

	public Pedido(int id, LocalDateTime momento, OrderStatus status) {
		this.id = id;
		this.momento = momento;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getMomento() {
		return momento;
	}

	public void setMomento(LocalDateTime momento) {
		this.momento = momento;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", momento=" + momento + ", status=" + status + "]";
	}
	
	
	
}
