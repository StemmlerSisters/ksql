/*
 * Copyright 2018 Confluent Inc.
 *
 * Licensed under the Confluent Community License (the "License"); you may not use
 * this file except in compliance with the License.  You may obtain a copy of the
 * License at
 *
 * http://www.confluent.io/confluent-community-license
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package io.confluent.ksql.util;

import com.google.common.collect.ImmutableMap;
import io.confluent.ksql.GenericRow;
import java.util.Arrays;
import java.util.Map;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;

public class ItemDataProvider extends TestDataProvider {

  private static final String namePrefix =
      "ITEM";

  private static final String ksqlSchemaString =
      "(ID varchar, DESCRIPTION varchar)";

  private static final String key = "ID";

  private static final Schema schema = SchemaBuilder.struct()
      .field("ID", SchemaBuilder.OPTIONAL_STRING_SCHEMA)
      .field("DESCRIPTION", SchemaBuilder.OPTIONAL_STRING_SCHEMA).build();

  private static final Map<String, GenericRow> data = buildData();

  public ItemDataProvider() {
    super(namePrefix, ksqlSchemaString, key, schema, data);
  }

  private static Map<String, GenericRow> buildData() {

    return ImmutableMap.<String, GenericRow>builder()
        .put("ITEM_1", new GenericRow(Arrays.asList("ITEM_1",  "home cinema")))
        .put("ITEM_2", new GenericRow(Arrays.asList("ITEM_2",  "clock radio")))
        .put("ITEM_3", new GenericRow(Arrays.asList("ITEM_3",  "road bike")))
        .put("ITEM_4", new GenericRow(Arrays.asList("ITEM_4",  "mountain bike")))
        .put("ITEM_5", new GenericRow(Arrays.asList("ITEM_5",  "snowboard")))
        .put("ITEM_6", new GenericRow(Arrays.asList("ITEM_6",  "iphone 10")))
        .put("ITEM_7", new GenericRow(Arrays.asList("ITEM_7",  "gopro")))
        .put("ITEM_8", new GenericRow(Arrays.asList("ITEM_8",  "cat")))
        .build();
  }

}
