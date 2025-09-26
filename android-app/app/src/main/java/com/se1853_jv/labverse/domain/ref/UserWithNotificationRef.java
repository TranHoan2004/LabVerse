package com.se1853_jv.labverse.domain.ref;

import androidx.room.Entity;

@Entity(primaryKeys = {"userId", "notificationId"})
public class UserWithNotificationRef {
    int userId;
    int notificationId;
}
