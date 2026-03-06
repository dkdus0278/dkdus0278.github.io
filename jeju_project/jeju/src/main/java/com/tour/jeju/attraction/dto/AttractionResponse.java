package com.tour.jeju.attraction.dto;

import com.tour.jeju.attraction.entity.Attraction;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AttractionResponse {
    private Long id;
    private String name;
    private String address;
    private String tel;
    private String description;
    private String imgName;
    private String imgUrl;

    // Entity => dto
    public static AttractionResponse fromEntity(Attraction attraction) {
        return AttractionResponse.builder()
                .id(attraction.getId())
                .name(attraction.getName())
                .address(attraction.getAddress())
                .tel(attraction.getTel())
                .description(attraction.getDescription())
                .imgName(attraction.getImgName())
                .imgUrl(attraction.getImgUrl())
                .build();
    }
}
