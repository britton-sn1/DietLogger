package com.hotmail.neil.britton.dietlogger.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FoodItem {
	private @Id @GeneratedValue Long id;
	@Column(name="name")
	private String name;

	public FoodItem() {
		
	}
	public FoodItem(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object o) {

		if (this == o)
			return true;
		if (!(o instanceof FoodItem))
			return false;
		FoodItem name = (FoodItem) o;
		return Objects.equals(this.id, name.id) && Objects.equals(this.name, name.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.id, this.name);
	}

	@Override
	public String toString() {
		return "Employee{" + "id=" + this.id + ", name='" + this.name + '}';
	}
}
