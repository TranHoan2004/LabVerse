package com.se1853_jv.labverse.domain.collection.model;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.se1853_jv.labverse.domain.ref.AuthorCollectionRef;
import com.se1853_jv.labverse.domain.user.model.Users;

import java.util.List;

public class CollectionWithUser {
    @Embedded
    Collection collection;
    @Relation(
            parentColumn = "collectionId",
            entityColumn = "authorId",
            associateBy = @Junction(AuthorCollectionRef.class)
    )
    List<Users> users;
}
