/**
 * 
 */
package com.example.springbootcamp.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * @author kkk88
 *
 */
public class Car {
	
	private Long carId;
	
	private String vendor;
	private String type;
	private List<CarCategoryEnum> categories;
	private LocalDate dateOfConstruction;
	private String color;
	private Integer noOfDoors; 
	private BigDecimal price;
	private Boolean available;
	/**
	 * @return the carId
	 */
	public Long getCarId() {
		return carId;
	}
	/**
	 * @param carId the carId to set
	 */
	public void setCarId(Long carId) {
		this.carId = carId;
	}
	/**
	 * @return the vendor
	 */
	public String getVendor() {
		return vendor;
	}
	/**
	 * @param vendor the vendor to set
	 */
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the categories
	 */
	public List<CarCategoryEnum> getCategories() {
		return categories;
	}
	/**
	 * @param categories the categories to set
	 */
	public void setCategories(List<CarCategoryEnum> categories) {
		this.categories = categories;
	}
	/**
	 * @return the dateOfConstruction
	 */
	public LocalDate getDateOfConstruction() {
		return dateOfConstruction;
	}
	/**
	 * @param dateOfConstruction the dateOfConstruction to set
	 */
	public void setDateOfConstruction(LocalDate dateOfConstruction) {
		this.dateOfConstruction = dateOfConstruction;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the noOfDoors
	 */
	public Integer getNoOfDoors() {
		return noOfDoors;
	}
	/**
	 * @param noOfDoors the noOfDoors to set
	 */
	public void setNoOfDoors(Integer noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	/**
	 * @return the available
	 */
	public Boolean getAvailable() {
		return available;
	}
	/**
	 * @param available the available to set
	 */
	public void setAvailable(Boolean available) {
		this.available = available;
	}

}
