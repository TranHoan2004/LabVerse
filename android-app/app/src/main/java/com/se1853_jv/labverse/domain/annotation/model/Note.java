package com.se1853_jv.labverse.domain.annotation.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import androidx.annotation.NonNull;

import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Note extends Annotation {
    @Getter
    @Setter
    String id;

    @ColumnInfo(name = "color")
    @Getter
    @Setter
    String colorCode;

    @NonNull
    String content;
}
