// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Ftp read settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("FtpReadSettings")
@Fluent
public final class FtpReadSettings extends StoreReadSettings {
    /*
     * If true, files under the folder path will be read recursively. Default
     * is true. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "recursive")
    private Object recursive;

    /*
     * Ftp wildcardFolderPath. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "wildcardFolderPath")
    private Object wildcardFolderPath;

    /*
     * Ftp wildcardFileName. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "wildcardFileName")
    private Object wildcardFileName;

    /*
     * Specify whether to use binary transfer mode for FTP stores.
     */
    @JsonProperty(value = "useBinaryTransfer")
    private Boolean useBinaryTransfer;

    /**
     * Get the recursive property: If true, files under the folder path will be read recursively. Default is true. Type:
     * boolean (or Expression with resultType boolean).
     *
     * @return the recursive value.
     */
    public Object getRecursive() {
        return this.recursive;
    }

    /**
     * Set the recursive property: If true, files under the folder path will be read recursively. Default is true. Type:
     * boolean (or Expression with resultType boolean).
     *
     * @param recursive the recursive value to set.
     * @return the FtpReadSettings object itself.
     */
    public FtpReadSettings setRecursive(Object recursive) {
        this.recursive = recursive;
        return this;
    }

    /**
     * Get the wildcardFolderPath property: Ftp wildcardFolderPath. Type: string (or Expression with resultType string).
     *
     * @return the wildcardFolderPath value.
     */
    public Object getWildcardFolderPath() {
        return this.wildcardFolderPath;
    }

    /**
     * Set the wildcardFolderPath property: Ftp wildcardFolderPath. Type: string (or Expression with resultType string).
     *
     * @param wildcardFolderPath the wildcardFolderPath value to set.
     * @return the FtpReadSettings object itself.
     */
    public FtpReadSettings setWildcardFolderPath(Object wildcardFolderPath) {
        this.wildcardFolderPath = wildcardFolderPath;
        return this;
    }

    /**
     * Get the wildcardFileName property: Ftp wildcardFileName. Type: string (or Expression with resultType string).
     *
     * @return the wildcardFileName value.
     */
    public Object getWildcardFileName() {
        return this.wildcardFileName;
    }

    /**
     * Set the wildcardFileName property: Ftp wildcardFileName. Type: string (or Expression with resultType string).
     *
     * @param wildcardFileName the wildcardFileName value to set.
     * @return the FtpReadSettings object itself.
     */
    public FtpReadSettings setWildcardFileName(Object wildcardFileName) {
        this.wildcardFileName = wildcardFileName;
        return this;
    }

    /**
     * Get the useBinaryTransfer property: Specify whether to use binary transfer mode for FTP stores.
     *
     * @return the useBinaryTransfer value.
     */
    public Boolean isUseBinaryTransfer() {
        return this.useBinaryTransfer;
    }

    /**
     * Set the useBinaryTransfer property: Specify whether to use binary transfer mode for FTP stores.
     *
     * @param useBinaryTransfer the useBinaryTransfer value to set.
     * @return the FtpReadSettings object itself.
     */
    public FtpReadSettings setUseBinaryTransfer(Boolean useBinaryTransfer) {
        this.useBinaryTransfer = useBinaryTransfer;
        return this;
    }
}