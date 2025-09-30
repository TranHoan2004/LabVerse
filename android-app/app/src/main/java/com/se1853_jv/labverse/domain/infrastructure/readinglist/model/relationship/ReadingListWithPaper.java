package com.se1853_jv.labverse.domain.infrastructure.readinglist.model.relationship;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.se1853_jv.labverse.domain.infrastructure.paper.model.PaperResearch;
import com.se1853_jv.labverse.domain.infrastructure.readinglist.model.ReadingList;
import com.se1853_jv.labverse.domain.infrastructure.ref.ReadingListPaperCrossRef;

import java.util.List;

public class ReadingListWithPaper {
    @Embedded
    public ReadingList readingList;

    @Relation(
            parentColumn = "id",
            entityColumn = "id",
            associateBy = @Junction(
                    value = ReadingListPaperCrossRef.class,
                    parentColumn = "readingListId",
                    entityColumn = "paperId"
            )
    )
    public List<PaperResearch> papers;
}
