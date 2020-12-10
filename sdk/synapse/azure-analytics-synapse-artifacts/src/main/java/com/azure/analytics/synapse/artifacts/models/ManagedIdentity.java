// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** The workspace managed identity. */
@Fluent
public final class ManagedIdentity {
    /*
     * The principal ID of the workspace managed identity
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /*
     * The tenant ID of the workspace managed identity
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID tenantId;

    /*
     * The type of managed identity for the workspace
     */
    @JsonProperty(value = "type")
    private ResourceIdentityType type;

    /**
     * Get the principalId property: The principal ID of the workspace managed identity.
     *
     * @return the principalId value.
     */
    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * Get the tenantId property: The tenant ID of the workspace managed identity.
     *
     * @return the tenantId value.
     */
    public UUID getTenantId() {
        return this.tenantId;
    }

    /**
     * Get the type property: The type of managed identity for the workspace.
     *
     * @return the type value.
     */
    public ResourceIdentityType getType() {
        return this.type;
    }

    /**
     * Set the type property: The type of managed identity for the workspace.
     *
     * @param type the type value to set.
     * @return the ManagedIdentity object itself.
     */
    public ManagedIdentity setType(ResourceIdentityType type) {
        this.type = type;
        return this;
    }
}