package com.example.jeju.member.dto;

import com.example.jeju.member.entity.Member;
import com.example.jeju.member.entity.MemberRole;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberResponse {
    private Long id;
    private String username;
    private String name;
    private MemberRole role;

    public static MemberResponse fromEntity(Member member) {
        return MemberResponse.builder()
                .id(member.getId())
                .username(member.getUsername())
                .name(member.getName())
                .role(member.getRole())
                .build();
    }
}
