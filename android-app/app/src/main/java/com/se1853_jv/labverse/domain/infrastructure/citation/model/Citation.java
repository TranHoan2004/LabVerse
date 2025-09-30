package com.se1853_jv.labverse.domain.infrastructure.citation.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.se1853_jv.labverse.domain.infrastructure.Metadata;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Citation extends Metadata {
    @PrimaryKey
    String id;
}
