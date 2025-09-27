package com.se1853_jv.labverse.domain.infrastructure.user.model.relationship;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.se1853_jv.labverse.domain.infrastructure.annotation.model.Note;
import com.se1853_jv.labverse.domain.infrastructure.ref.UsersNoteCrossRef;
import com.se1853_jv.labverse.domain.infrastructure.user.model.Users;

import java.util.List;

public class UserWithNote {
    @Embedded
    public Users user;

    @Relation(
            parentColumn = "id",
            entityColumn = "id",
            associateBy = @Junction(
                    value = UsersNoteCrossRef.class,
                    parentColumn = "ownerId",
                    entityColumn = "noteId"
            )
    )
    public List<Note> notes;

}
