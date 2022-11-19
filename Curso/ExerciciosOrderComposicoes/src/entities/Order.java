package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entitiesEnum.OrderStatus;


public class Order {
	
	private LocalDateTime moment;
	private OrderStatus status;
	private Client client;
	
	private List<OrderItem> orderItem = new ArrayList<>();
	
	DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Order() {
		
	}

	public Order(LocalDateTime moment, OrderStatus status,Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}

	public void addItem(OrderItem c) {
		orderItem.add(c);
	}
	
	public void removeItem(OrderItem c) {
		orderItem.remove(c);
	}
	
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Double total() {
		Double sum = 0.0;
		
		for(OrderItem c: orderItem) {
			sum += c.subtotal();
		}
		
		return sum;
	}


	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:\n");
		sb.append("Order moment: "+fmt1.format(moment)+"\n");
		sb.append("Client: "+client.getName()+" ("+client.getBirthDate().format(fmt2)+") - " + client.getEmail()+"\n");
		sb.append("Order items:\n");
		for(OrderItem c: orderItem) {
			sb.append(c.getProduct().getName()+", "+c.getProduct().getPrice()
					+ ", Quantity: "+c.getQuantity()+", Subtotal: "+c.subtotal()+"\n");
		}
		sb.append("Total price: "+total());
		
		return sb.toString();
		
	}
	
	
}
