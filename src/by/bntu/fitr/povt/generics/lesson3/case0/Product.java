package by.bntu.fitr.povt.generics.lesson3.case0;

public abstract class Product implements Comparable<Product>{

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract int subCompare(Product p);

/*    @Override
    public int compareTo(T o) {
        if (this.price == o.getPrice()) {
            return 0;
        } else if (this.price < o.getPrice()) {
            return -1;
        } else {
            return 1;
        }
    }*/

    @Override
    public int compareTo(Product o) {
        if (this.price > o.getPrice()) {
            return 1;
        } else if (this.price < o.getPrice()) {
            return -1;
        } else {
            subCompare(o);
            return 0;
        }
    }
}
