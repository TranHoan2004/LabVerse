package com.se1853_jv.labverse.domain.infrastructure.annotation.model.relationship;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.se1853_jv.labverse.domain.infrastructure.annotation.model.Highlight;
import com.se1853_jv.labverse.domain.infrastructure.ref.UsersHighlightCrossRef;
import com.se1853_jv.labverse.domain.infrastructure.user.model.Users;

import java.util.List;

public class HighlightWithUser {
    @Embedded
    public Highlight highlight;

    @Relation(
            parentColumn = "id",
            entityColumn = "id",
            associateBy = @Junction(
                    value = UsersHighlightCrossRef.class,
                    parentColumn = "highlightId",
                    entityColumn = "ownerId"
            )
    )
    public List<Users> users;
}
