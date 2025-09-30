package com.se1853_jv.labverse.domain.infrastructure.citation.model.relationship;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.se1853_jv.labverse.domain.infrastructure.citation.model.Citation;
import com.se1853_jv.labverse.domain.infrastructure.paper.model.PaperResearch;
import com.se1853_jv.labverse.domain.infrastructure.ref.PaperCitationCrossRef;

import java.util.List;

public class CitationWithPaper {
    @Embedded
    public Citation citation;

    @Relation(
            parentColumn = "id",
            entityColumn = "id",
            associateBy = @Junction(
                    value = PaperCitationCrossRef.class,
                    parentColumn = "citationId",
                    entityColumn = "paperResearchId"
            )
    )
    public List<PaperResearch> papers;

}
