/*
 * Copyright 2015, Stratio.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.stratio.cassandra.lucene.schema.mapping.builder;

import com.stratio.cassandra.lucene.schema.mapping.StringMapper;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author Andres de la Pena {@literal <adelapena@stratio.com>}
 */
public class StringMapperBuilder extends MapperBuilder<StringMapper> {

    @JsonProperty("indexed")
    private Boolean indexed;

    @JsonProperty("sorted")
    private Boolean sorted;

    @JsonProperty("case_sensitive")
    private Boolean caseSensitive;

    /**
     * Sets if the field supports searching.
     *
     * @param indexed if the field supports searching.
     * @return This.
     */
    public StringMapperBuilder indexed(Boolean indexed) {
        this.indexed = indexed;
        return this;
    }

    /**
     * Sets if the field supports sorting.
     *
     * @param sorted if the field supports sorting.
     * @return This.
     */
    public StringMapperBuilder sorted(Boolean sorted) {
        this.sorted = sorted;
        return this;
    }

    /**
     * Sets if the {@link StringMapper} to be built must be case sensitive.
     *
     * @param caseSensitive If the {@link StringMapper} to be built must be case sensitive.
     * @return This.
     */
    public StringMapperBuilder caseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
        return this;
    }

    /**
     * Returns the {@link StringMapper} represented by this {@link MapperBuilder}.
     *
     * @param name The name of the {@link StringMapper} to be built.
     * @return The {@link StringMapper} represented by this.
     */
    @Override
    public StringMapper build(String name) {
        return new StringMapper(name, indexed, sorted, caseSensitive);
    }
}
