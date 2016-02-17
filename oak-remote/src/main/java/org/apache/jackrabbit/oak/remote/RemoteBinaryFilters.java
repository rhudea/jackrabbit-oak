/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.jackrabbit.oak.remote;

/**
 * Represents a set of filters that can be applied when a binary object is read
 * from the repository.
 */
public class RemoteBinaryFilters {

    /**
     * Return the starting offset into the binary object. This method returns
     * {@code 0} by default, meaning that the binary object should be read from
     * the beginning.
     */
    public long getStart() {
        return 0;
    }

    /**
     * Return the number of bytes to read. This method returns {@code -1} by
     * default, meaning that the binary object should be read until the end.
     */
    public long getCount() {
        return -1;
    }

}