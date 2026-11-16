
class Order {

    private int id;
    private String customer;
    private Double price;
    private String status;

    public Order(int id, String customer, Double price, String status) {
        this.id = id;
        this.customer = customer;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getCustomer() {
        return customer;
    }

    public Double getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer='" + customer + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                '}';
    }
}