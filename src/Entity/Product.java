package Entity;

public class Product {


    public String name;
    public float price;
    public int quantity;


    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        if (quantity > 0) {
            this.quantity += quantity;
        }
        else {
            System.out.print("Saldo informado deve ser maior que 0");
        }
    }

    public void removeProducts(int quantity){
        if (this.quantity > quantity) {
            this.quantity -= quantity;
        }
        else {
            System.out.print("Saldo insuficiente em estoque para remover");
        }
    }
}
