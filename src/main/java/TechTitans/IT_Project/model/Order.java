package TechTitans.IT_Project.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "\"Order\"")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id", nullable = false)
    private Integer id;

    @Column(name = "timestamp", nullable = false)
    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(name = "customer_customer_id", nullable = false)
    private Customer customer;

    @Column(name = "product_quantity", nullable = false)
    private Integer productQuantity;

    @Column(name = "expected_delivery_date")
    private LocalDateTime expectedDeliveryDate;

}
