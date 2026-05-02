
package com.taskmanager.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String status;
    public void setStatus(String status) {
        this.status = status;
    }

    @ManyToOne
    private User assignedTo;

    @ManyToOne
    private Project project;
}
