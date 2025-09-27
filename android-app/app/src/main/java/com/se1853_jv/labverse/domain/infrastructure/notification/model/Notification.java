package com.se1853_jv.labverse.domain.infrastructure.notification.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.time.LocalDateTime;

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
public class Notification {
    @PrimaryKey
    String id;

    String link;

    @NonNull
    String message;

    @NonNull
    String title;

    @NonNull
    Boolean status;

    @NonNull
    LocalDateTime createdDate;
}
