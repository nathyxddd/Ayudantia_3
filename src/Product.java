public class Product {

    private int id;
    private String name;
    private int price;
    private boolean is_discount;

    public Product(int id, String name, int price, boolean is_discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.is_discount = is_discount;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isIs_discount() {
        return is_discount;
    }

    public void setIs_discount(boolean is_discount) {
        this.is_discount = is_discount;
    }
}
