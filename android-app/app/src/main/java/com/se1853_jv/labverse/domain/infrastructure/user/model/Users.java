package com.se1853_jv.labverse.domain.infrastructure.user.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import androidx.annotation.NonNull;

import com.se1853_jv.labverse.domain.infrastructure.role.model.Roles;

import java.time.LocalDateTime;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(
        foreignKeys = {
                @ForeignKey(
                        entity = Roles.class,
                        parentColumns = "id",
                        childColumns = "roleId"
                )
        }
)
public class Users {
    @PrimaryKey
    String id;

    @NonNull
    // unique, regex
    String email;

    @NonNull
    // regex
    String password;

    @NonNull
    @ColumnInfo(name = "full_name")
    String name;

    @NonNull
    String username;

    @NonNull
    LocalDateTime createdDate;

    String avatarUrl;

    @NonNull
    String roleId;
}
