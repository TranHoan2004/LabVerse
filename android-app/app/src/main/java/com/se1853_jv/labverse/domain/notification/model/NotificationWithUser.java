package com.se1853_jv.labverse.domain.notification.model;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.se1853_jv.labverse.domain.ref.UserWithNotificationRef;
import com.se1853_jv.labverse.domain.user.model.Users;

import java.util.List;

public class NotificationWithUser {
    @Embedded
    Notification notification;

    @Relation(
            parentColumn = "notificationId",
            entityColumn = "userId",
            associateBy = @Junction(UserWithNotificationRef.class)
    )
    List<Users> usersList;
}
