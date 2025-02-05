/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.cloudsearch.v1.model;

/**
 * The rewritten queries returned by Apps Search Query Understanding service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RewrittenQueries extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RewrittenQuery> rewrittenQueries;

  /**
   * The index of the selected query in `rewritten_queries` that is used by QAPI to call CSSR to get
   * search results. If none of the queries were used (i.e. they all give empty search results),
   * `selected_query_index` would default to -1.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer selectedQueryIndex;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<RewrittenQuery> getRewrittenQueries() {
    return rewrittenQueries;
  }

  /**
   * @param rewrittenQueries rewrittenQueries or {@code null} for none
   */
  public RewrittenQueries setRewrittenQueries(java.util.List<RewrittenQuery> rewrittenQueries) {
    this.rewrittenQueries = rewrittenQueries;
    return this;
  }

  /**
   * The index of the selected query in `rewritten_queries` that is used by QAPI to call CSSR to get
   * search results. If none of the queries were used (i.e. they all give empty search results),
   * `selected_query_index` would default to -1.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSelectedQueryIndex() {
    return selectedQueryIndex;
  }

  /**
   * The index of the selected query in `rewritten_queries` that is used by QAPI to call CSSR to get
   * search results. If none of the queries were used (i.e. they all give empty search results),
   * `selected_query_index` would default to -1.
   * @param selectedQueryIndex selectedQueryIndex or {@code null} for none
   */
  public RewrittenQueries setSelectedQueryIndex(java.lang.Integer selectedQueryIndex) {
    this.selectedQueryIndex = selectedQueryIndex;
    return this;
  }

  @Override
  public RewrittenQueries set(String fieldName, Object value) {
    return (RewrittenQueries) super.set(fieldName, value);
  }

  @Override
  public RewrittenQueries clone() {
    return (RewrittenQueries) super.clone();
  }

}
