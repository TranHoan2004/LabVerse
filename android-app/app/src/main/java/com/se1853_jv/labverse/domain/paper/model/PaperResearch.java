package com.se1853_jv.labverse.domain.paper.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Data
@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PaperResearch {
    @PrimaryKey
    String id;

    @NonNull
    String journal;

    @NonNull
    String title;

    @NonNull
    Integer publicationYear;

    @NonNull
    String doi; // mã định danh tài liệu

    @NonNull
    String userOwnerId;

    @Nullable
    String collectionPapersId;
}
