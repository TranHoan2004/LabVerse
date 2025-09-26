package com.se1853_jv.labverse.domain.role.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.annotation.NonNull;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Entity(tableName = "role")
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Roles {
    @PrimaryKey
    String id;

    @NonNull
    Role role;

    public void setRole(String role) {
        this.role = Role.fromValue(role);
    }
}
