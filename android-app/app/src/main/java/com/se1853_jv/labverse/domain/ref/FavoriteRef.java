package com.se1853_jv.labverse.domain.ref;

import androidx.room.Entity;

@Entity(primaryKeys = {"userId", "paperId"})
public class FavoriteRef {
    int userId;
    int paperId;
}
