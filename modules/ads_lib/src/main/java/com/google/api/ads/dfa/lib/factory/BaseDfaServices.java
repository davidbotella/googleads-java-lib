// Copyright 2012 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.dfa.lib.factory;

import com.google.api.ads.common.lib.factory.BaseServices;
import com.google.api.ads.dfa.lib.client.DfaServiceClient;
import com.google.api.ads.dfa.lib.client.DfaServiceDescriptor;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.inject.Injector;

/**
 * Base for a utility class which creates DFA service clients.
 *
 * @author Joseph DiLallo
 */
public abstract class BaseDfaServices extends BaseServices<DfaServiceClient,
                                                           DfaSession,
                                                           DfaServiceDescriptor> {

  /**
   * Constructor.
   *
   * @param injector an injector which binds all the necessary classes
   */
  protected BaseDfaServices(Injector injector) {
    super(new DfaServiceClientFactory(injector));
  }
}
