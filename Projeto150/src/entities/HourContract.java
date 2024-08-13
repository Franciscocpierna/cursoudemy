package entities;

import java.util.Date;

public class HourContract {
	private Date date;
	private Double hours;
	private Double valuePerHour;
	private Integer hour;
	public HourContract() {
		
	}
	public HourContract(Date date, Double hours, Integer hour) {
		this.date = date;
		this.hours = hours;
		this.hour = hour;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Double getHours() {
		return hours;
	}
	public void setHours(Double hours) {
		this.hours = hours;
	}
	public Integer getHour() {
		return hour;
	}
	public void setHour(Integer hour) {
		this.hour = hour;
	}
	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public double totalValue() {
		return valuePerHour * hours;
	}
}
