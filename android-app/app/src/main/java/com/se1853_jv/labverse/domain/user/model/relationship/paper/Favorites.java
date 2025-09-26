package com.se1853_jv.labverse.domain.user.model.relationship.paper;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.se1853_jv.labverse.domain.paper.model.PaperResearch;
import com.se1853_jv.labverse.domain.user.model.Users;

import java.util.List;

public class Favorites {
    @Embedded
    Users user;

    @Relation(
            parentColumn = "userId",
            entityColumn = "paperId",
            associateBy = @Junction(UserWithPapers.class)
    )
    List<PaperResearch> papersList;
}
