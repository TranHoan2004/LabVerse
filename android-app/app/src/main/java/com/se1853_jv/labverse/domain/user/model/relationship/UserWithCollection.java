package com.se1853_jv.labverse.domain.user.model.relationship;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.se1853_jv.labverse.domain.collection.model.Collection;
import com.se1853_jv.labverse.domain.ref.AuthorCollectionRef;
import com.se1853_jv.labverse.domain.user.model.Users;

import java.util.List;

public class UserWithCollection {
    @Embedded
    Users user;

    @Relation(
            parentColumn = "authorId",
            entityColumn = "collectionId",
            associateBy = @Junction(AuthorCollectionRef.class)
    )
    List<Collection> collections;
}
