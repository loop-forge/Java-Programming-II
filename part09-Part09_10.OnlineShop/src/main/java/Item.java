import java.util.Objects;

public class Item {
    private String product;
    private int qty;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice){
        this.product=product;
        this.qty=qty;
        this.unitPrice=unitPrice;
    }

    public int price(){
        return this.unitPrice*this.qty;
    }

    public void increaseQuantity(){
        qty++;
    }

    @Override
    public String toString(){
        return  product + ": " + qty;
    }

    public String getProduct() {
        return product;
    }

    public int getQty() {
        return qty;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    @Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Item item = (Item) o;
		return Objects.equals(product, item.product);
	}

	@Override
	public int hashCode() {
		return Objects.hash(product);
	}

}
