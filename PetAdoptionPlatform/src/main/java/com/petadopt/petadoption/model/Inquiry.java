package com.petadopt.petadoption.model; // Package declaration

/*import jakarta.persistence.*;*/
import lombok.AllArgsConstructor; // Import required class
import lombok.Data; // Import required class
import lombok.NoArgsConstructor; // Import required class

@Data // Annotation
@NoArgsConstructor // Annotation
@AllArgsConstructor // Annotation
/*@Entity*/
public class Inquiry { // Class declaration

/*    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)*/ // Annotation
    private Long id;

/*    @ManyToOne
    @JoinColumn(name = "user_id")*/ // Annotation
    private User user;

/*    @ManyToOne
    @JoinColumn(name = "pet_id")*/ // Annotation
    private Pet pet;

/*    @Column(length = 1000)*/
    private String message;

    private String status; // Pending, Responded
}