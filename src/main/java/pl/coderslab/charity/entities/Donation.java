package pl.coderslab.charity.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantity;
    @OneToMany (mappedBy = "donation")
    private List<Category> categories = new ArrayList<>();
    @OneToOne
    private Institution institution ;
    private String street;
    private String city;
    private String zipCode;
    private LocalDateTime pickUpDate;
    private LocalDateTime pickUpTime;
    private String pickUpComment;
}
