package com.ubosque.Shop.Delivery.Model;

public class Store {
	private int id;
	private String name;
	private String description;
	private String category;
	private String url;

	public Store(int id, String name, String description, String category, String url) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.category = category;
		this.url = url;
	}

	public Store() {
		super();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Store [id=" + id + ", name=" + name + ", description=" + description + ", category=" + category
				+ ", url=" + url + "]";
	}
	
	
	
}
