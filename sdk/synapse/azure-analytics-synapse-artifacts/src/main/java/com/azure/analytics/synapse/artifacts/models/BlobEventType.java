// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for BlobEventType. */
public final class BlobEventType extends ExpandableStringEnum<BlobEventType> {
    /** Static value Microsoft.Storage.BlobCreated for BlobEventType. */
    public static final BlobEventType MICROSOFT_STORAGE_BLOB_CREATED = fromString("Microsoft.Storage.BlobCreated");

    /** Static value Microsoft.Storage.BlobDeleted for BlobEventType. */
    public static final BlobEventType MICROSOFT_STORAGE_BLOB_DELETED = fromString("Microsoft.Storage.BlobDeleted");

    /**
     * Creates or finds a BlobEventType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BlobEventType.
     */
    @JsonCreator
    public static BlobEventType fromString(String name) {
        return fromString(name, BlobEventType.class);
    }

    /** @return known BlobEventType values. */
    public static Collection<BlobEventType> values() {
        return values(BlobEventType.class);
    }
}