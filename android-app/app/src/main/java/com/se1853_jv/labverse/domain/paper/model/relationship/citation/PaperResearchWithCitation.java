package com.se1853_jv.labverse.domain.paper.model.relationship.citation;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.se1853_jv.labverse.domain.citation.model.Citation;
import com.se1853_jv.labverse.domain.paper.model.PaperResearch;

import java.util.List;

public class PaperResearchWithCitation {
    @Embedded
    PaperResearch paperResearch;

    @Relation(
        parentColumn = "id",
        entityColumn = "paperResearchId"
    )
    List<Citation> citations;
}
