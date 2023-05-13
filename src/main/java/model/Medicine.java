package model;

import java.io.Serializable;

public class Medicine implements Serializable {
    private static final long serialVersionUID = 1L;


    private int id;
    private String name;
    private long price;
    private String use;
    private String type;
    public Medicine() {
    }
    public Medicine(String name, long price, String use, String type) {
        this.name = name;
        this.price = price;
        this.use = use;
        this.type = type;
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

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", use='" + use + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
    
    public Object[] toRows() {
        return new Object[]{
            getId(), getName(), getPrice(), getType(), getUse()
        };
    }
}
