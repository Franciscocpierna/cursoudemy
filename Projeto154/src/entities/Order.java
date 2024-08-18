package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	private List<OrderItem> itens = new ArrayList<>();
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
		
	}
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public void addItem(OrderItem item) {
		itens.add(item);
	}

	public void removeItem(OrderItem item) {
		itens.remove(item);
	}
	public Double total() {
		double soma=0;
		for (OrderItem c : itens) {
		}
		return soma;
}       
}