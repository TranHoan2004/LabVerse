package com.se1853_jv.labverse.domain.infrastructure.annotation.model;

import androidx.annotation.NonNull;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Annotation {
    @NonNull
    Long coordinationX;

    @NonNull
    Long coordinationY;

    @NonNull
    Integer pageNumber;
}
