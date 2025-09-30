package com.se1853_jv.labverse.domain.infrastructure.paper.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.se1853_jv.labverse.domain.infrastructure.Metadata;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PaperResearch extends Metadata {
    @PrimaryKey
    String id;

    @NonNull
    String dataUrl;
}
