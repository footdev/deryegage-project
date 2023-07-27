package com.kkosunnae.deryeogage.domain.simulation;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SimulationDto {
    private Integer id;
    private Long userId;
    private String petType;
    private String petName;
    private String background;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Integer cost;
    private LocalDateTime lastTime;
    private String petRequire;
    private String petEmotion;
    private Float train1;
    private Float train2;
    private Float train3;
    private Float train4;
    private Byte health;
    private String title;
    private Byte quizNum;
    private boolean end;
    private boolean endCheck;
}