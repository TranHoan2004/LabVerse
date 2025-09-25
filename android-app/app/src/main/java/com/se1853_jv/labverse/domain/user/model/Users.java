package com.se1853_jv.labverse.domain.user.model;

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
public class Users {
    @PrimaryKey
    String id;

    @NonNull
    String email;

    @NonNull
    String password;

    @NonNull
    String name;

    @NonNull
    String roleId;
}
