package com.example.calendar.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Event {

    public enum Status { CONFIRMED, TENTATIVE }
    public enum Priority { LOW, MEDIUM, HIGH }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Enumerated(EnumType.STRING)
    private Priority priority;

    private String owner; // "user1" or "user2"

    // getter / setter
}
