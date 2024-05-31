package net.javaguides.ttk.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
//@RequiredArgsConstructor
@Entity
@Table(name="Info")

public class Info {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nameStore")
    private String nameStore;
    @Column(name = "title")
    private String title;
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @Column(name = "email",nullable = false,unique = true)
    private String email;

    public Info(Long id, String namStore, String phoneNumber, String title, String email) {
    }
}
