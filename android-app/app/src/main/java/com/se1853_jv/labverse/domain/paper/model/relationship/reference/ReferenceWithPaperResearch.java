package com.se1853_jv.labverse.domain.paper.model.relationship.reference;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.se1853_jv.labverse.domain.paper.model.PaperResearch;
import com.se1853_jv.labverse.domain.ref.ReferencesRef;

import java.util.List;

public class ReferenceWithPaperResearch {
    @Embedded
    PaperResearch reference;

    @Relation(
            parentColumn = "referenceId",
            entityColumn = "paperId",
            associateBy = @Junction(ReferencesRef.class)
    )
    List<PaperResearch> paper;
}
