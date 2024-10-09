package ua.com.kisit_course.groupe372.unit6.homework_lab3;

public class ProductHasOrder {

    private Order order;
    private Product product;
    private int quantity;

    public ProductHasOrder(Order order, Product product, int quantity) {
        this.order = order;
        this.product = product;
        this.quantity = quantity;
    }

    public ProductHasOrder(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ProductHasOrder{" +
                "order=" + order +
                ", product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
