package com.se1853_jv.labverse.domain.infrastructure.readinglist.model.relationship;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.se1853_jv.labverse.domain.infrastructure.readinglist.model.ReadingList;
import com.se1853_jv.labverse.domain.infrastructure.ref.UsersReadingListCrossRef;
import com.se1853_jv.labverse.domain.infrastructure.user.model.Users;

import java.util.List;

public class ReadingListWithUser {
    @Embedded
    public ReadingList readingList;

    @Relation(
            parentColumn = "id",
            entityColumn = "id",
            associateBy = @Junction(
                    value = UsersReadingListCrossRef.class,
                    parentColumn = "readingListId",
                    entityColumn = "userId"
            )
    )
    public List<Users> users;
}
