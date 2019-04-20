package Model;

public class Order {

   private Long id;
   private Long customerId;
   private Long sellerId;
   private Long[] weapons;

   public Order(Long id, Long customerId, Long sellerId, Long[] weapons) {
       this.id = id;
       this.customerId = customerId;
       this.sellerId = sellerId;
       this.weapons = weapons;
   }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Long[] getWeapons() {
        return weapons;
    }

    public void setWeapons(Long[] weapons) {
        this.weapons = weapons;
    }

}
