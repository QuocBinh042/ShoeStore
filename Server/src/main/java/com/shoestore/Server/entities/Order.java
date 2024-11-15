package com.shoestore.Server.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name ="Orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderID")
    private int orderID;
    private LocalDate orderDate;
    private String status;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "voucherID")
    private Voucher voucher;
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderDetail> orderDetails;
    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private Payment payment;
    private String shippingAddress;
    @ManyToOne
    @JoinColumn(name = "userID")
    private User user;
}
