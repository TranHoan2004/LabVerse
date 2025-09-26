package com.se1853_jv.labverse.domain.paper.model.relationship.user;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.se1853_jv.labverse.domain.paper.model.PaperResearch;
import com.se1853_jv.labverse.domain.ref.FavoriteRef;
import com.se1853_jv.labverse.domain.user.model.Users;

import java.util.List;

public class PaperResearchWithUser {
    @Embedded
    PaperResearch paper;
    @Relation(
            parentColumn = "paperId",
            entityColumn = "userId",
            associateBy = @Junction(FavoriteRef.class)
    )
    List<Users> user;
}
