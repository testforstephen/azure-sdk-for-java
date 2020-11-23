/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.attestation.v2020_10_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Definition object with the name and properties of an operation.
 */
public class OperationsDefinition {
    /**
     * Name of the operation.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Display object with properties of the operation.
     */
    @JsonProperty(value = "display")
    private OperationsDisplayDefinition display;

    /**
     * Get name of the operation.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the operation.
     *
     * @param name the name value to set
     * @return the OperationsDefinition object itself.
     */
    public OperationsDefinition withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get display object with properties of the operation.
     *
     * @return the display value
     */
    public OperationsDisplayDefinition display() {
        return this.display;
    }

    /**
     * Set display object with properties of the operation.
     *
     * @param display the display value to set
     * @return the OperationsDefinition object itself.
     */
    public OperationsDefinition withDisplay(OperationsDisplayDefinition display) {
        this.display = display;
        return this;
    }

}