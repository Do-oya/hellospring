package tobyspring.hellospring.order;

import java.math.BigDecimal;


public class Order {
    private Long id;

    private String no;

    private BigDecimal total;

    public Order() {

    }

    public Order(String no, BigDecimal total) {
        this.total = total;
        this.no = no;
    }

    public Long getId() {
        return id;
    }

    public String getNo() {
        return no;
    }

    public BigDecimal getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", no='" + no + '\'' +
                ", total=" + total +
                '}';
    }
}
