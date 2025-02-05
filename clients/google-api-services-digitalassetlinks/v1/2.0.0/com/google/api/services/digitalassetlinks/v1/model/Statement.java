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

package com.google.api.services.digitalassetlinks.v1.model;

/**
 * Describes a reliable statement that has been made about the relationship between a source asset
 * and a target asset. Statements are always made by the source asset, either directly or by
 * delegating to a statement list that is stored elsewhere. For more detailed definitions of
 * statements and assets, please refer to our [API documentation landing page](/digital-asset-
 * links/v1/getting-started).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Digital Asset Links API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Statement extends com.google.api.client.json.GenericJson {

  /**
   * The relation identifies the use of the statement as intended by the source asset's owner (that
   * is, the person or entity who issued the statement). Every complete statement has a relation. We
   * identify relations with strings of the format `/`, where `` must be one of a set of pre-defined
   * purpose categories, and `` is a free-form lowercase alphanumeric string that describes the
   * specific use case of the statement. Refer to [our API documentation](/digital-asset-
   * links/v1/relation-strings) for the current list of supported relations. Example:
   * `delegate_permission/common.handle_all_urls` REQUIRED
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String relation;

  /**
   * Every statement has a source asset. REQUIRED
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Asset source;

  /**
   * Every statement has a target asset. REQUIRED
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Asset target;

  /**
   * The relation identifies the use of the statement as intended by the source asset's owner (that
   * is, the person or entity who issued the statement). Every complete statement has a relation. We
   * identify relations with strings of the format `/`, where `` must be one of a set of pre-defined
   * purpose categories, and `` is a free-form lowercase alphanumeric string that describes the
   * specific use case of the statement. Refer to [our API documentation](/digital-asset-
   * links/v1/relation-strings) for the current list of supported relations. Example:
   * `delegate_permission/common.handle_all_urls` REQUIRED
   * @return value or {@code null} for none
   */
  public java.lang.String getRelation() {
    return relation;
  }

  /**
   * The relation identifies the use of the statement as intended by the source asset's owner (that
   * is, the person or entity who issued the statement). Every complete statement has a relation. We
   * identify relations with strings of the format `/`, where `` must be one of a set of pre-defined
   * purpose categories, and `` is a free-form lowercase alphanumeric string that describes the
   * specific use case of the statement. Refer to [our API documentation](/digital-asset-
   * links/v1/relation-strings) for the current list of supported relations. Example:
   * `delegate_permission/common.handle_all_urls` REQUIRED
   * @param relation relation or {@code null} for none
   */
  public Statement setRelation(java.lang.String relation) {
    this.relation = relation;
    return this;
  }

  /**
   * Every statement has a source asset. REQUIRED
   * @return value or {@code null} for none
   */
  public Asset getSource() {
    return source;
  }

  /**
   * Every statement has a source asset. REQUIRED
   * @param source source or {@code null} for none
   */
  public Statement setSource(Asset source) {
    this.source = source;
    return this;
  }

  /**
   * Every statement has a target asset. REQUIRED
   * @return value or {@code null} for none
   */
  public Asset getTarget() {
    return target;
  }

  /**
   * Every statement has a target asset. REQUIRED
   * @param target target or {@code null} for none
   */
  public Statement setTarget(Asset target) {
    this.target = target;
    return this;
  }

  @Override
  public Statement set(String fieldName, Object value) {
    return (Statement) super.set(fieldName, value);
  }

  @Override
  public Statement clone() {
    return (Statement) super.clone();
  }

}
