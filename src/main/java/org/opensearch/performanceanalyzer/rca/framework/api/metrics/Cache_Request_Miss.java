/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.performanceanalyzer.rca.framework.api.metrics;


import org.opensearch.performanceanalyzer.metrics.AllMetrics;
import org.opensearch.performanceanalyzer.rca.framework.api.Metric;

public class Cache_Request_Miss extends Metric {
    public static final String NAME = AllMetrics.ShardStatsValue.CACHE_REQUEST_MISS.toString();

    public Cache_Request_Miss(long evaluationIntervalSeconds) {
        super(NAME, evaluationIntervalSeconds);
    }
}
