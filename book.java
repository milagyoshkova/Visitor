package visitor;

public class Book implements Product {

	private int price;
	private String isbnNumber;
	
	public Book(String isbnNumber, int price) {
		this.isbnNumber = isbnNumber;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

}
