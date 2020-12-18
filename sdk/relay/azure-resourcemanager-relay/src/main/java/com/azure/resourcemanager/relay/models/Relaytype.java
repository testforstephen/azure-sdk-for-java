// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for Relaytype. */
public enum Relaytype {
    /** Enum value NetTcp. */
    NET_TCP("NetTcp"),

    /** Enum value Http. */
    HTTP("Http");

    /** The actual serialized value for a Relaytype instance. */
    private final String value;

    Relaytype(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a Relaytype instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed Relaytype object, or null if unable to parse.
     */
    @JsonCreator
    public static Relaytype fromString(String value) {
        Relaytype[] items = Relaytype.values();
        for (Relaytype item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}