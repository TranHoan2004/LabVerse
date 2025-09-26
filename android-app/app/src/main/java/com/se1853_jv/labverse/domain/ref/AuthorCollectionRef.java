package com.se1853_jv.labverse.domain.ref;

import androidx.room.Entity;

@Entity(primaryKeys = {"authorId", "collectionId"})
public class AuthorCollectionRef {
    int authorId;
    int collectionId;
}
