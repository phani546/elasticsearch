/*
 * Licensed to ElasticSearch under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. ElasticSearch licenses this
 * file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.elasticsearch.cloud.azure;

import org.elasticsearch.common.settings.ImmutableSettings;
import org.elasticsearch.common.settings.SettingsFilter;

/**
 * Filtering cloud.azure.* settings
 */
public class AzureSettingsFilter implements SettingsFilter.Filter {

    @Override
    public void filter(ImmutableSettings.Builder settings) {
        // Cloud settings
        settings.remove("cloud.certificate");
        settings.remove("cloud.azure.password");
        settings.remove("cloud.azure.subscription_id");
        settings.remove("cloud.azure.service_name");
    }
}
