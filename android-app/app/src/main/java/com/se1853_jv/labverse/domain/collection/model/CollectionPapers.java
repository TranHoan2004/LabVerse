package com.se1853_jv.labverse.domain.collection.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.annotation.NonNull;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CollectionPapers {
    @PrimaryKey
    String id;

    @NonNull
    Boolean status;

    @NonNull
    Integer progress;

    @NonNull
    @ColumnInfo(name = "priority")
    Integer priorityIndex;

    @NonNull
    String collectionId;

    @NonNull
    String ownerId;

    @NonNull
    String belongTo; // la ban sao cua paper nao

    public void setPriority(Priority priority) {
        this.priorityIndex = Priority.toValue(priority);
    }
}
