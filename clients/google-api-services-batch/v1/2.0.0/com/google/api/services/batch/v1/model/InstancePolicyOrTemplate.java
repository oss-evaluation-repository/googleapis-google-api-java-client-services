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

package com.google.api.services.batch.v1.model;

/**
 * InstancePolicyOrTemplate lets you define the type of resources to use for this job either with an
 * InstancePolicy or an instance template. If undefined, Batch picks the type of VM to use and
 * doesn't include optional VM resources such as GPUs and extra disks.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Batch API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InstancePolicyOrTemplate extends com.google.api.client.json.GenericJson {

  /**
   * Set this field true if you want Batch to help fetch drivers from a third party location and
   * install them for GPUs specified in `policy.accelerators` or `instance_template` on your behalf.
   * Default is false. For Container-Optimized Image cases, Batch will install the accelerator
   * driver following milestones of https://cloud.google.com/container-optimized-os/docs/release-
   * notes. For non Container-Optimized Image cases, following
   * https://github.com/GoogleCloudPlatform/compute-gpu-
   * installation/blob/main/linux/install_gpu_driver.py.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean installGpuDrivers;

  /**
   * Name of an instance template used to create VMs. Named the field as 'instance_template' instead
   * of 'template' to avoid c++ keyword conflict.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instanceTemplate;

  /**
   * InstancePolicy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InstancePolicy policy;

  /**
   * Set this field true if you want Batch to help fetch drivers from a third party location and
   * install them for GPUs specified in `policy.accelerators` or `instance_template` on your behalf.
   * Default is false. For Container-Optimized Image cases, Batch will install the accelerator
   * driver following milestones of https://cloud.google.com/container-optimized-os/docs/release-
   * notes. For non Container-Optimized Image cases, following
   * https://github.com/GoogleCloudPlatform/compute-gpu-
   * installation/blob/main/linux/install_gpu_driver.py.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getInstallGpuDrivers() {
    return installGpuDrivers;
  }

  /**
   * Set this field true if you want Batch to help fetch drivers from a third party location and
   * install them for GPUs specified in `policy.accelerators` or `instance_template` on your behalf.
   * Default is false. For Container-Optimized Image cases, Batch will install the accelerator
   * driver following milestones of https://cloud.google.com/container-optimized-os/docs/release-
   * notes. For non Container-Optimized Image cases, following
   * https://github.com/GoogleCloudPlatform/compute-gpu-
   * installation/blob/main/linux/install_gpu_driver.py.
   * @param installGpuDrivers installGpuDrivers or {@code null} for none
   */
  public InstancePolicyOrTemplate setInstallGpuDrivers(java.lang.Boolean installGpuDrivers) {
    this.installGpuDrivers = installGpuDrivers;
    return this;
  }

  /**
   * Name of an instance template used to create VMs. Named the field as 'instance_template' instead
   * of 'template' to avoid c++ keyword conflict.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstanceTemplate() {
    return instanceTemplate;
  }

  /**
   * Name of an instance template used to create VMs. Named the field as 'instance_template' instead
   * of 'template' to avoid c++ keyword conflict.
   * @param instanceTemplate instanceTemplate or {@code null} for none
   */
  public InstancePolicyOrTemplate setInstanceTemplate(java.lang.String instanceTemplate) {
    this.instanceTemplate = instanceTemplate;
    return this;
  }

  /**
   * InstancePolicy.
   * @return value or {@code null} for none
   */
  public InstancePolicy getPolicy() {
    return policy;
  }

  /**
   * InstancePolicy.
   * @param policy policy or {@code null} for none
   */
  public InstancePolicyOrTemplate setPolicy(InstancePolicy policy) {
    this.policy = policy;
    return this;
  }

  @Override
  public InstancePolicyOrTemplate set(String fieldName, Object value) {
    return (InstancePolicyOrTemplate) super.set(fieldName, value);
  }

  @Override
  public InstancePolicyOrTemplate clone() {
    return (InstancePolicyOrTemplate) super.clone();
  }

}
