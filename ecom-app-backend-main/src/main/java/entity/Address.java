package entity;

import lombok.Data;

import javax.persistence.*;



@Entity
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String country;

    private String city;

    private String state;

    private String street;

    private String zipCode;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Order order;
}
