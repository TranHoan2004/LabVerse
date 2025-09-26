package com.se1853_jv.labverse.domain.user.model.relationship;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.se1853_jv.labverse.domain.notification.model.Notification;
import com.se1853_jv.labverse.domain.ref.UserWithNotificationRef;
import com.se1853_jv.labverse.domain.user.model.Users;

import java.util.List;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserWithNotification {
    @Embedded
    Users user;

    @Relation(
            parentColumn = "userId",
            entityColumn = "notificationId",
            associateBy = @Junction(UserWithNotificationRef.class)
    )
    List<Notification> notificationList;
}
