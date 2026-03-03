package com.example.jeju.attraction.entity;

import com.example.jeju.attraction.dto.AttractionRequest;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Attraction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    private String address;
    private String tel;

    @Lob
    private String description;
    private String imgName;
    private String imgUrl;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "attraction",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<Review> reviews = new ArrayList<>();

    public void updateInfo(String name, String address, String tel,
                           String description, String imgName, String imgUrl) {
        this.name = name;
        this.address = address;
        this.tel = tel;
        this.description = description;
        this.imgName = imgName;
        this.imgUrl = imgUrl;
    }
}
