/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.digitaltwins.v2020_12_01.implementation;

import com.microsoft.azure.management.digitaltwins.v2020_12_01.PrivateEndpointConnectionsResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class PrivateEndpointConnectionsResponseImpl extends WrapperImpl<PrivateEndpointConnectionsResponseInner> implements PrivateEndpointConnectionsResponse {
    private final DigitalTwinsManager manager;
    PrivateEndpointConnectionsResponseImpl(PrivateEndpointConnectionsResponseInner inner, DigitalTwinsManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DigitalTwinsManager manager() {
        return this.manager;
    }

    @Override
    public List<PrivateEndpointConnectionInner> value() {
        return this.inner().value();
    }

}