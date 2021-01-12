// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** columnLink. */
@Fluent
public final class MicrosoftGraphColumnLink extends MicrosoftGraphEntity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphColumnLink.class);

    /*
     * The name of the column  in this content type.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * columnLink
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the name property: The name of the column in this content type.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the column in this content type.
     *
     * @param name the name value to set.
     * @return the MicrosoftGraphColumnLink object itself.
     */
    public MicrosoftGraphColumnLink withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the additionalProperties property: columnLink.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: columnLink.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphColumnLink object itself.
     */
    public MicrosoftGraphColumnLink withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphColumnLink withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}