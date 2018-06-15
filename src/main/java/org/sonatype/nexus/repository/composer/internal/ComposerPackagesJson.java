/*
 * Sonatype Nexus (TM) Open Source Version
 * Copyright (c) 2018-present Sonatype, Inc.
 * All rights reserved. Includes the third-party code listed at http://links.sonatype.com/products/nexus/oss/attributions.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License Version 1.0,
 * which accompanies this distribution and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Sonatype Nexus (TM) Professional Version is available from Sonatype, Inc. "Sonatype" and "Sonatype Nexus" are trademarks
 * of Sonatype, Inc. Apache Maven is a trademark of the Apache Software Foundation. M2eclipse is a trademark of the
 * Eclipse Foundation. All other trademarks are the property of their respective owners.
 */
package org.sonatype.nexus.repository.composer.internal;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data carrier representing Composer packages.json.
 */
@JsonInclude(Include.NON_NULL)
public class ComposerPackagesJson
{
  @JsonProperty("providers-url")
  private String providersUrl;

  @JsonProperty("providers")
  private Map<String, ComposerDigestEntry> providers;

  @JsonProperty("provider-includes")
  private Map<String, ComposerDigestEntry> providerIncludes;

  public String getProvidersUrl() {
    return providersUrl;
  }

  public void setProvidersUrl(final String providersUrl) {
    this.providersUrl = providersUrl;
  }

  public Map<String, ComposerDigestEntry> getProviders() {
    return providers;
  }

  public void setProviders(final Map<String, ComposerDigestEntry> providers) {
    this.providers = providers;
  }

  public Map<String, ComposerDigestEntry> getProviderIncludes() {
    return providerIncludes;
  }

  public void setProviderIncludes(final Map<String, ComposerDigestEntry> providerIncludes) {
    this.providerIncludes = providerIncludes;
  }
}