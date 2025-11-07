package Gestion_inventario;

public class Product {

	private int id;
	private String name;
	private double price;
	private int stock;
	private String category;
	private String description;

	public Product() {

	}
	
	public Product(String name, double price, String category, String description) {
	    this.name = name;
	    this.price = price;
	    this.stock = 0;
	    this.category = category;
	    this.description = description;
	}
	
	public Product(String name, double price, int stock, String category, String description) {
	    this.name = name;
	    this.price = price;
	    this.stock = stock;
	    this.category = category;
	    this.description = description;
	}

	public Product(int id, String name, double price, int stock, String category, String description) {
	    this.id = id;
	    this.name = name;
	    this.price = price;
	    this.stock = stock;
	    this.category = category;
	    this.description = description;
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
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Que haces poniendo un hueco vacio bobo");
		}
		this.name = name.trim();
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		if(price < 0) {
			throw new IllegalArgumentException("Tu eres tonto que haces poniendo el precio negativo");
		}
		
		this.price = price;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		if(price < 0) {
			throw new IllegalArgumentException("Alma de cantaro porque pones que no hay stock, si no hay se borra");
		}
		this.stock = stock;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		if(category == null || category.trim().isEmpty()) {
			throw new IllegalArgumentException("Que escribas no seas vago maldito papanatas");
		}
		this.category = category.trim();
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		if(description == null || description.trim().isEmpty()) {
			throw new IllegalArgumentException("Que escribas no seas vago maldito papanatas");
		}
		this.description = description.trim();
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", stock=" + stock + ", category="
				+ category + ", description=" + description + "]";
	}
}
