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
	private String units; //eg per 100g
	private Double energy;
	private Double protein;
	private Double carbs;
	private Double sugars;
	private Double fats;
	private Double saturates;
	private Double sodium;
	private Double fibre;
	
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	public Double getEnergy() {
		return energy;
	}
	public void setEnergy(Double energy) {
		this.energy = energy;
	}
	public Double getProtein() {
		return protein;
	}
	public void setProtein(Double protein) {
		this.protein = protein;
	}
	public Double getCarbs() {
		return carbs;
	}
	public void setCarbs(Double carbs) {
		this.carbs = carbs;
	}
	public Double getSugars() {
		return sugars;
	}
	public void setSugars(Double sugars) {
		this.sugars = sugars;
	}
	public Double getFats() {
		return fats;
	}
	public void setFats(Double fats) {
		this.fats = fats;
	}
	public Double getSaturates() {
		return saturates;
	}
	public void setSaturates(Double saturates) {
		this.saturates = saturates;
	}
	public Double getSodium() {
		return sodium;
	}
	public void setSodium(Double sodium) {
		this.sodium = sodium;
	}
	public Double getFibre() {
		return fibre;
	}
	public void setFibre(Double fibre) {
		this.fibre = fibre;
	}


	
	public FoodItem() {
		
	}
	public FoodItem(String name, String units, Double energy, Double protein, 
			Double carbs, Double sugars, Double fats, Double saturates, Double sodium, 
			Double fibre) {
		this.name = name;
		this.units = units;
		this.energy = energy;
		this.protein = protein;
		this.carbs = carbs;
		this.sugars = sugars;
		this.fats = fats;
		this.saturates = saturates;
		this.sodium = sodium;
		this.fibre = fibre;
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
