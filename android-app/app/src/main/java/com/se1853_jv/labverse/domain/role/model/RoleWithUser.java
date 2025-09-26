package com.se1853_jv.labverse.domain.role.model;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.se1853_jv.labverse.domain.user.model.Users;

import java.util.List;

public class RoleWithUser {
    @Embedded
    Roles role;

    @Relation(
            parentColumn = "id",
            entityColumn = "roleId"
    )
    List<Users> usersList;
}
