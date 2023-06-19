package Phone_DB;

public class Phone {
    private int id;
    private String name;
    private String trademark;
    private double price;
    private String painted;


    public Phone(int id, String name, String trademark, double price, String painted) {
        this.name = name;
        this.trademark = trademark;
        this.price = price;
        this.painted = painted;
    }

    public Phone(int id, String name, String trademark, String painted, double price) {
        this.id = id;
        this.name = name;
        this.trademark = trademark;
        this.price = price;
        this.painted = painted;
    }

    public Phone(String name, String trademark, String painted, double price) {
        this.name = name;
        this.trademark = trademark;
        this.price = price;
        this.painted = painted;
    }

    public Phone(String name, String trademark, double price, String painted) {
        this.name = name;
        this.trademark = trademark;
        this.price = price;
        this.painted = painted;
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

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPainted() {
        return painted;
    }

    public void setPainted(String painted) {
        this.painted = painted;
    }
}
