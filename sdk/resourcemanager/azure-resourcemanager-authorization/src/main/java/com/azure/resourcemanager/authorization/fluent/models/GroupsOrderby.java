// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for GroupsOrderby. */
public final class GroupsOrderby extends ExpandableStringEnum<GroupsOrderby> {
    /** Static value id for GroupsOrderby. */
    public static final GroupsOrderby ID = fromString("id");

    /** Static value id desc for GroupsOrderby. */
    public static final GroupsOrderby ID_DESC = fromString("id desc");

    /** Static value deletedDateTime for GroupsOrderby. */
    public static final GroupsOrderby DELETED_DATE_TIME = fromString("deletedDateTime");

    /** Static value deletedDateTime desc for GroupsOrderby. */
    public static final GroupsOrderby DELETED_DATE_TIME_DESC = fromString("deletedDateTime desc");

    /** Static value appRoleId for GroupsOrderby. */
    public static final GroupsOrderby APP_ROLE_ID = fromString("appRoleId");

    /** Static value appRoleId desc for GroupsOrderby. */
    public static final GroupsOrderby APP_ROLE_ID_DESC = fromString("appRoleId desc");

    /** Static value createdDateTime for GroupsOrderby. */
    public static final GroupsOrderby CREATED_DATE_TIME = fromString("createdDateTime");

    /** Static value createdDateTime desc for GroupsOrderby. */
    public static final GroupsOrderby CREATED_DATE_TIME_DESC = fromString("createdDateTime desc");

    /** Static value principalDisplayName for GroupsOrderby. */
    public static final GroupsOrderby PRINCIPAL_DISPLAY_NAME = fromString("principalDisplayName");

    /** Static value principalDisplayName desc for GroupsOrderby. */
    public static final GroupsOrderby PRINCIPAL_DISPLAY_NAME_DESC = fromString("principalDisplayName desc");

    /** Static value principalId for GroupsOrderby. */
    public static final GroupsOrderby PRINCIPAL_ID = fromString("principalId");

    /** Static value principalId desc for GroupsOrderby. */
    public static final GroupsOrderby PRINCIPAL_ID_DESC = fromString("principalId desc");

    /** Static value principalType for GroupsOrderby. */
    public static final GroupsOrderby PRINCIPAL_TYPE = fromString("principalType");

    /** Static value principalType desc for GroupsOrderby. */
    public static final GroupsOrderby PRINCIPAL_TYPE_DESC = fromString("principalType desc");

    /** Static value resourceDisplayName for GroupsOrderby. */
    public static final GroupsOrderby RESOURCE_DISPLAY_NAME = fromString("resourceDisplayName");

    /** Static value resourceDisplayName desc for GroupsOrderby. */
    public static final GroupsOrderby RESOURCE_DISPLAY_NAME_DESC = fromString("resourceDisplayName desc");

    /** Static value resourceId for GroupsOrderby. */
    public static final GroupsOrderby RESOURCE_ID = fromString("resourceId");

    /** Static value resourceId desc for GroupsOrderby. */
    public static final GroupsOrderby RESOURCE_ID_DESC = fromString("resourceId desc");

    /**
     * Creates or finds a GroupsOrderby from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding GroupsOrderby.
     */
    @JsonCreator
    public static GroupsOrderby fromString(String name) {
        return fromString(name, GroupsOrderby.class);
    }

    /** @return known GroupsOrderby values. */
    public static Collection<GroupsOrderby> values() {
        return values(GroupsOrderby.class);
    }
}