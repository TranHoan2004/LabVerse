package com.se1853_jv.labverse.domain.infrastructure.paper.model.relationship;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.se1853_jv.labverse.domain.infrastructure.paper.model.PaperResearch;
import com.se1853_jv.labverse.domain.infrastructure.readinglist.model.ReadingList;
import com.se1853_jv.labverse.domain.infrastructure.ref.ReadingListPaperCrossRef;

import java.util.List;

public class PaperWithReadingList {
    @Embedded
    public PaperResearch paper;

    @Relation(
            parentColumn = "id",
            entityColumn = "id",
            associateBy = @Junction(
                    value = ReadingListPaperCrossRef.class,
                    parentColumn = "paperId",
                    entityColumn = "readingListId"
            )
    )
    public List<ReadingList> readingLists;
}
