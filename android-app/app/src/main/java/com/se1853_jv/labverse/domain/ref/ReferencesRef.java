package com.se1853_jv.labverse.domain.ref;

import androidx.room.Entity;

@Entity(primaryKeys = {"paperId", "referenceId"})
public class ReferencesRef {
    int paperId;
    int referenceId;
}
