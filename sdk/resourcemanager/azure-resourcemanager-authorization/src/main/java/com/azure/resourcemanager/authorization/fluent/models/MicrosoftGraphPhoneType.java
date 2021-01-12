// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MicrosoftGraphPhoneType. */
public final class MicrosoftGraphPhoneType extends ExpandableStringEnum<MicrosoftGraphPhoneType> {
    /** Static value home for MicrosoftGraphPhoneType. */
    public static final MicrosoftGraphPhoneType HOME = fromString("home");

    /** Static value business for MicrosoftGraphPhoneType. */
    public static final MicrosoftGraphPhoneType BUSINESS = fromString("business");

    /** Static value mobile for MicrosoftGraphPhoneType. */
    public static final MicrosoftGraphPhoneType MOBILE = fromString("mobile");

    /** Static value other for MicrosoftGraphPhoneType. */
    public static final MicrosoftGraphPhoneType OTHER = fromString("other");

    /** Static value assistant for MicrosoftGraphPhoneType. */
    public static final MicrosoftGraphPhoneType ASSISTANT = fromString("assistant");

    /** Static value homeFax for MicrosoftGraphPhoneType. */
    public static final MicrosoftGraphPhoneType HOME_FAX = fromString("homeFax");

    /** Static value businessFax for MicrosoftGraphPhoneType. */
    public static final MicrosoftGraphPhoneType BUSINESS_FAX = fromString("businessFax");

    /** Static value otherFax for MicrosoftGraphPhoneType. */
    public static final MicrosoftGraphPhoneType OTHER_FAX = fromString("otherFax");

    /** Static value pager for MicrosoftGraphPhoneType. */
    public static final MicrosoftGraphPhoneType PAGER = fromString("pager");

    /** Static value radio for MicrosoftGraphPhoneType. */
    public static final MicrosoftGraphPhoneType RADIO = fromString("radio");

    /**
     * Creates or finds a MicrosoftGraphPhoneType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphPhoneType.
     */
    @JsonCreator
    public static MicrosoftGraphPhoneType fromString(String name) {
        return fromString(name, MicrosoftGraphPhoneType.class);
    }

    /** @return known MicrosoftGraphPhoneType values. */
    public static Collection<MicrosoftGraphPhoneType> values() {
        return values(MicrosoftGraphPhoneType.class);
    }
}