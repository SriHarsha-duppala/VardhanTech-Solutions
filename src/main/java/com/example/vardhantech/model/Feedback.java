
package com.example.vardhantech.model;

import jakarta.persistence.*;

@Entity
@Table(name = "feedback")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int rating;

    @Column(length = 1000)
    private String message;

    // getters & setters
    public Long getId() { return id; }
    public String getName() { return name; }
    public int getRating() { return rating; }
    public String getMessage() { return message; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setRating(int rating) { this.rating = rating; }
    public void setMessage(String message) { this.message = message; }
}
