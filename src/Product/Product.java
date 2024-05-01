
package Product;

//finalezr is clean memoire
public class Product {
    private String name;
    private String description;
    private float price;
    private int quantity;
    private float discount;//Sold1 -15%
    private String color;
    

    public Product() {
         this.name ="No name";
        this.description = " No description";
        this.price = 0.0f;
        this.quantity = 0;
        this.discount = 0;
    }

    public Product(String name, String description, float price, int quantity, float discount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }
     public Product(String name, String description, float price, int quantity, float discount,String c) {
       this(name, description, price, quantity, discount);//constructor Chaining 
        this.color=c;
    }
      public Product(Product obj) {
        this.name = obj.name;
        this.description = obj.description;
        this.price = obj.price;
        this.quantity = obj.quantity;
        this.discount =obj.discount;
        this.color=obj.color;
     
        
    }
    
    public void display(){
        System.out.println("Name = "+name);
        System.out.println("Description = "+description);
        System.out.println("Price  = "+price);
        System.out.println("Quantity = "+quantity);
        System.out.println("Dicount = "+discount);
        
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    

    
}
