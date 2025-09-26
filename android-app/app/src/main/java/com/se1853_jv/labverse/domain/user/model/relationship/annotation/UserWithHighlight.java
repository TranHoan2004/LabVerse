package com.se1853_jv.labverse.domain.user.model.relationship.annotation;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.se1853_jv.labverse.domain.annotation.model.Highlight;
import com.se1853_jv.labverse.domain.user.model.Users;

import java.util.List;

public class UserWithHighlight {
    @Embedded
    Users user;

    @Relation(
        parentColumn = "id",
        entityColumn = "ownerId"
    )
    List<Highlight> highlights;
}
