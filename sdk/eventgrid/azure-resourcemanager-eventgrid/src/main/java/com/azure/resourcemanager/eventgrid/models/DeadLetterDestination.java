// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Information about the dead letter destination for an event subscription. To configure a deadletter destination, do
 * not directly instantiate an object of this class. Instead, instantiate an object of a derived class. Currently,
 * StorageBlobDeadLetterDestination is the only class that derives from this class.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "endpointType",
    defaultImpl = DeadLetterDestination.class)
@JsonTypeName("DeadLetterDestination")
@JsonSubTypes({@JsonSubTypes.Type(name = "StorageBlob", value = StorageBlobDeadLetterDestination.class)})
@Immutable
public class DeadLetterDestination {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeadLetterDestination.class);

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}