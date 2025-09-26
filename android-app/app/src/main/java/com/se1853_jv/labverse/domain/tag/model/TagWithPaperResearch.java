package com.se1853_jv.labverse.domain.tag.model;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.se1853_jv.labverse.domain.paper.model.PaperResearch;
import com.se1853_jv.labverse.domain.ref.TagRef;

import java.util.List;

public class TagWithPaperResearch {
    @Embedded
    Tag tag;

    @Relation(
            parentColumn = "tagId",
            entityColumn = "paperId",
            associateBy = @Junction(TagRef.class)
    )
    List<PaperResearch> papers;
}
