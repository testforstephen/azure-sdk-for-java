/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.cdn.v2020_09_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cdn.v2020_09_01.SecurityPolicies;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.cdn.v2020_09_01.SecurityPolicy;

class SecurityPoliciesImpl extends WrapperImpl<SecurityPoliciesInner> implements SecurityPolicies {
    private final CdnManager manager;

    SecurityPoliciesImpl(CdnManager manager) {
        super(manager.inner().securityPolicies());
        this.manager = manager;
    }

    public CdnManager manager() {
        return this.manager;
    }

    @Override
    public SecurityPolicyImpl define(String name) {
        return wrapModel(name);
    }

    private SecurityPolicyImpl wrapModel(SecurityPolicyInner inner) {
        return  new SecurityPolicyImpl(inner, manager());
    }

    private SecurityPolicyImpl wrapModel(String name) {
        return new SecurityPolicyImpl(name, this.manager());
    }

    @Override
    public Observable<SecurityPolicy> listByProfileAsync(final String resourceGroupName, final String profileName) {
        SecurityPoliciesInner client = this.inner();
        return client.listByProfileAsync(resourceGroupName, profileName)
        .flatMapIterable(new Func1<Page<SecurityPolicyInner>, Iterable<SecurityPolicyInner>>() {
            @Override
            public Iterable<SecurityPolicyInner> call(Page<SecurityPolicyInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SecurityPolicyInner, SecurityPolicy>() {
            @Override
            public SecurityPolicy call(SecurityPolicyInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<SecurityPolicy> getAsync(String resourceGroupName, String profileName, String securityPolicyName) {
        SecurityPoliciesInner client = this.inner();
        return client.getAsync(resourceGroupName, profileName, securityPolicyName)
        .flatMap(new Func1<SecurityPolicyInner, Observable<SecurityPolicy>>() {
            @Override
            public Observable<SecurityPolicy> call(SecurityPolicyInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((SecurityPolicy)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String profileName, String securityPolicyName) {
        SecurityPoliciesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, profileName, securityPolicyName).toCompletable();
    }

}