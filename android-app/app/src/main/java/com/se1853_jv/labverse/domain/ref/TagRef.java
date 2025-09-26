package com.se1853_jv.labverse.domain.ref;

import androidx.room.Entity;

@Entity(primaryKeys = {"tagId", "paperId"})
public class TagRef {
    int tagId;
    int paperId;
}
