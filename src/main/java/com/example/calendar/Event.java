package com.example.calendar;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Event {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private LocalDate date;

    public Event() {}

    public Event(String title, LocalDate date) {
        this.title = title;
        this.date = date;
    }

    // getter/setter
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
}
