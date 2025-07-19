/**
 * Represents an inquiry made by a user regarding a pet.
 * Stores details such as user ID, pet ID, and message.
 */
package com.petadopt.petadoption.model;

/*import jakarta.persistence.*;*/
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
/*@Entity*/

//Main class or interface for inquiry operations
/**
 * Class for holding user inquiry information.
 */
/** Method */
    public class Inquiry {

/*    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)*/
    /** Field */
    private Long id;

/*    @ManyToOne
    @JoinColumn(name = "user_id")*/
    /** Field */
    private User user;

/*    @ManyToOne
    @JoinColumn(name = "pet_id")*/
    /** Field */
    private Pet pet;

/*    @Column(length = 1000)*/
    /** Field */
    private String message;

    /** Field */
    private String status; // Pending, Responded
}