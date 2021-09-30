package moglix.Employeemanagementsystem.dto;

public class Orders {
    private String order_id;

    @Override
    public String toString() {
        return "Orders{" +
                "order_id='" + order_id + '\'' +
                ", user_id='" + user_id + '\'' +
                ", inv_id='" + inv_id + '\'' +
                ", product_id='" + product_id + '\'' +
                ", product_qty='" + product_qty + '\'' +
                ", total_price='" + total_price + '\'' +
                ", grand_total_price='" + grand_total_price + '\'' +
                '}';
    }

    public Orders(String order_id, String user_id, String inv_id, String product_id,
                  String product_qty, String total_price, String grand_total_price) {
        this.order_id = order_id;
        this.user_id = user_id;
        this.inv_id = inv_id;
        this.product_id = product_id;
        this.product_qty = product_qty;
        this.total_price = total_price;
        this.grand_total_price = grand_total_price;
    }
    public Orders(){

    }

    private String user_id;
    private String inv_id;
    private String product_id;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getInv_id() {
        return inv_id;
    }

    public void setInv_id(String inv_id) {
        this.inv_id = inv_id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_qty() {
        return product_qty;
    }

    public void setProduct_qty(String product_qty) {
        this.product_qty = product_qty;
    }

    public String getTotal_price() {
        return total_price;
    }

    public void setTotal_price(String total_price) {
        this.total_price = total_price;
    }

    public String getGrand_total_price() {
        return grand_total_price;
    }

    public void setGrand_total_price(String grand_total_price) {
        this.grand_total_price = grand_total_price;
    }

    private String product_qty;
    private String total_price;
    private String grand_total_price;

}
