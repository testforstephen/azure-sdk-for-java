// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Connection state details of the private endpoint. */
@Fluent
public final class PrivateLinkServiceConnectionState {
    /*
     * The private link service connection status.
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * The private link service connection description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The actions required for private link service connection.
     */
    @JsonProperty(value = "actionsRequired", access = JsonProperty.Access.WRITE_ONLY)
    private String actionsRequired;

    /**
     * Get the status property: The private link service connection status.
     *
     * @return the status value.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The private link service connection status.
     *
     * @param status the status value to set.
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the description property: The private link service connection description.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The private link service connection description.
     *
     * @param description the description value to set.
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the actionsRequired property: The actions required for private link service connection.
     *
     * @return the actionsRequired value.
     */
    public String getActionsRequired() {
        return this.actionsRequired;
    }
}