package com.se1853_jv.labverse.domain.paper.model.relationship.tag;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.se1853_jv.labverse.domain.paper.model.PaperResearch;
import com.se1853_jv.labverse.domain.ref.TagRef;
import com.se1853_jv.labverse.domain.tag.model.Tag;

import java.util.List;

public class PaperResearchWithTag {
    @Embedded
    PaperResearch paper;

    @Relation(
            parentColumn = "paperId",
            entityColumn = "tagId",
            associateBy = @Junction(TagRef.class)
    )
    List<Tag> tags;
}
