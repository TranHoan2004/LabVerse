package com.se1853_jv.labverse.domain.paper.model.relationship.reference;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.se1853_jv.labverse.domain.paper.model.PaperResearch;
import com.se1853_jv.labverse.domain.ref.ReferencesRef;

import java.util.List;

public class PaperResearchWithReference {
    @Embedded
    PaperResearch paper;

    @Relation(
            parentColumn = "paperId",
            entityColumn = "referenceId",
            associateBy = @Junction(ReferencesRef.class)
    )
    List<PaperResearch> references;
}
