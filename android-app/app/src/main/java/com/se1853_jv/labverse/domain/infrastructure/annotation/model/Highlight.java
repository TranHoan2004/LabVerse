package com.se1853_jv.labverse.domain.infrastructure.annotation.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Highlight extends Annotation {
    @Getter
    @Setter
    @PrimaryKey
    String id;

    @ColumnInfo(name = "color")
    String colorCode;
}
