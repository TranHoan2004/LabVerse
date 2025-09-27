package com.se1853_jv.labverse.domain.infrastructure.user.model.relationship;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.se1853_jv.labverse.domain.infrastructure.annotation.model.Highlight;
import com.se1853_jv.labverse.domain.infrastructure.ref.UsersHighlightCrossRef;
import com.se1853_jv.labverse.domain.infrastructure.user.model.Users;

import java.util.List;

public class UserWithHighlight {
    @Embedded
    public Users user;

    @Relation(
            parentColumn = "id",
            entityColumn = "id",
            associateBy = @Junction(
                    value = UsersHighlightCrossRef.class,
                    parentColumn = "ownerId",
                    entityColumn = "highlightId"
            )
    )
    public List<Highlight> highlights;
}
