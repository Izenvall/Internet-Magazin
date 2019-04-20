package Model;

public class Weapons {

   private Long id;
   private String name_weapon;
   private String manufacturer;
   private Double price;
   private WeaponType type;

public Weapons (Long id, String name_weapon, String manufacturer, Double price, WeaponType type) {
    this.id = id;
    this.name_weapon = name_weapon;
    this.manufacturer = manufacturer;
    this.price = price;
    this.type = type;
}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName_weapon() {
        return name_weapon;
    }

    public void setName_weapon(String name_weapon) {
        this.name_weapon = name_weapon;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public WeaponType getType() {
        return type;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }


}