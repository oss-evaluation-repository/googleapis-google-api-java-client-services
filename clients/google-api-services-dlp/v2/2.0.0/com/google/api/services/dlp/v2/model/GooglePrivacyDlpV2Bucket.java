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

package com.google.api.services.dlp.v2.model;

/**
 * Bucket is represented as a range, along with replacement values.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Sensitive Data Protection (DLP). For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2Bucket extends com.google.api.client.json.GenericJson {

  /**
   * Upper bound of the range, exclusive; type must match min.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2Value max;

  /**
   * Lower bound of the range, inclusive. Type should be the same as max if used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2Value min;

  /**
   * Required. Replacement value for this bucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2Value replacementValue;

  /**
   * Upper bound of the range, exclusive; type must match min.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2Value getMax() {
    return max;
  }

  /**
   * Upper bound of the range, exclusive; type must match min.
   * @param max max or {@code null} for none
   */
  public GooglePrivacyDlpV2Bucket setMax(GooglePrivacyDlpV2Value max) {
    this.max = max;
    return this;
  }

  /**
   * Lower bound of the range, inclusive. Type should be the same as max if used.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2Value getMin() {
    return min;
  }

  /**
   * Lower bound of the range, inclusive. Type should be the same as max if used.
   * @param min min or {@code null} for none
   */
  public GooglePrivacyDlpV2Bucket setMin(GooglePrivacyDlpV2Value min) {
    this.min = min;
    return this;
  }

  /**
   * Required. Replacement value for this bucket.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2Value getReplacementValue() {
    return replacementValue;
  }

  /**
   * Required. Replacement value for this bucket.
   * @param replacementValue replacementValue or {@code null} for none
   */
  public GooglePrivacyDlpV2Bucket setReplacementValue(GooglePrivacyDlpV2Value replacementValue) {
    this.replacementValue = replacementValue;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2Bucket set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2Bucket) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2Bucket clone() {
    return (GooglePrivacyDlpV2Bucket) super.clone();
  }

}
