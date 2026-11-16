public class Order implements Comparable<Order>{
    private int id;
    private String product;
    private double price;
    private int priority;
    public Order(int id,String product,double price,int priority){
        this.id = id;
        this.product = product;
        this.price = price;
        this.priority = priority;
    }
    //setter
    public void setId(int id){
        this.id = id;
    }
    public void setProduct(String product){
        this.product = product;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setPriority(int priority){
        this.priority = priority;
    }
    //getter
    public int getId(){
        return id;
    }
    public String getProduct(){
        return product;
    }
    public double getPrice(){
        return price;
    }
    public int getPriority(){
        return priority;
    }
    public String toString(){
        return "id: " + id + " Product: " + product
                + " Price: " + price + " Priority: "+ priority;

    }
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(!(obj instanceof Order)) return false;

        Order other = (Order) obj;
        return this.id == other.id;
    }

    public int hashCode(){
        return Integer.hashCode(id);
    }

    public int compareTo(Order other){
        return Integer.compare(this.id,other.id);
    }
}

