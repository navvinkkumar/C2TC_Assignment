package entityclassassignment2;

 class Product {
	public String productName;
    public int productId;
    public double price;

    public Product(String productName, int productId, double price) {
        this.productName = productName;
        this.productId = productId;
        this.price = price;
    }

    public void display() 
    {
        System.out.println("Product ID: " + productId + ", Name: " + productName + ", Price: ₹" +price);
    }
}