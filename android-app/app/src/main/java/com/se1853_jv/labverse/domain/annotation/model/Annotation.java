package com.se1853_jv.labverse.domain.annotation.model;

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

    String colorCode;

    @NonNull
    String ownerId;

    @NonNull
    String belongTo; // annotation duoc tao trong paper nao
}
