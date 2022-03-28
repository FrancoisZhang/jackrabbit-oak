/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.jackrabbit.oak.plugins.index.elastic;

import org.apache.jackrabbit.oak.api.CommitFailedException;
import org.apache.jackrabbit.oak.plugins.index.importer.IndexImporterProvider;
import org.apache.jackrabbit.oak.plugins.index.search.ReindexOperations;
import org.apache.jackrabbit.oak.spi.state.NodeBuilder;
import org.apache.jackrabbit.oak.spi.state.NodeState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

public class ElasticIndexImporter implements IndexImporterProvider {

    private static final Logger LOG = LoggerFactory.getLogger(ElasticIndexCleaner.class);

    public ElasticIndexImporter(){
    }

    @Override
    public void importIndex(NodeState root, NodeBuilder definitionBuilder, File indexDir) throws IOException, CommitFailedException {
        // NOOP for elastic
        LOG.info("No need to import data in case of elastic since this is a remote index. Exiting with NOOP");
    }

    @Override
    public String getType() {
        return ElasticIndexDefinition.TYPE_ELASTICSEARCH;
    }
}
