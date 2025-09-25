package com.se1853_jv.labverse.domain.annotation.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import androidx.annotation.NonNull;

import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Data
@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Annotation {
    @PrimaryKey
    String id;

    @NonNull
    Long coordinationX;

    @NonNull
    Long coordinationY;

    @NonNull
    Integer pageNumber;

    @NonNull
    String ownerId;

    @NonNull
    String belongTo; // annotation duoc tao trong paper nao
}
