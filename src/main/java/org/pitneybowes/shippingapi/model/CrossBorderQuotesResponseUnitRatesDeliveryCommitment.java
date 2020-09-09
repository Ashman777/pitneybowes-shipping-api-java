/*
 * Shipping API
 * Shipping API Sample.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@pb.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.pitneybowes.shippingapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CrossBorderQuotesResponseUnitRatesDeliveryCommitment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-10T01:37:26.222+05:30[Asia/Calcutta]")
public class CrossBorderQuotesResponseUnitRatesDeliveryCommitment {
  public static final String SERIALIZED_NAME_MIN_ESTIMATED_NUMBER_OF_DAYS = "minEstimatedNumberOfDays";
  @SerializedName(SERIALIZED_NAME_MIN_ESTIMATED_NUMBER_OF_DAYS)
  private Integer minEstimatedNumberOfDays;

  public static final String SERIALIZED_NAME_MAX_ESTIMATED_NUMBER_OF_DAYS = "maxEstimatedNumberOfDays";
  @SerializedName(SERIALIZED_NAME_MAX_ESTIMATED_NUMBER_OF_DAYS)
  private Integer maxEstimatedNumberOfDays;


  public CrossBorderQuotesResponseUnitRatesDeliveryCommitment minEstimatedNumberOfDays(Integer minEstimatedNumberOfDays) {
    
    this.minEstimatedNumberOfDays = minEstimatedNumberOfDays;
    return this;
  }

   /**
   * Get minEstimatedNumberOfDays
   * @return minEstimatedNumberOfDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMinEstimatedNumberOfDays() {
    return minEstimatedNumberOfDays;
  }


  public void setMinEstimatedNumberOfDays(Integer minEstimatedNumberOfDays) {
    this.minEstimatedNumberOfDays = minEstimatedNumberOfDays;
  }


  public CrossBorderQuotesResponseUnitRatesDeliveryCommitment maxEstimatedNumberOfDays(Integer maxEstimatedNumberOfDays) {
    
    this.maxEstimatedNumberOfDays = maxEstimatedNumberOfDays;
    return this;
  }

   /**
   * Get maxEstimatedNumberOfDays
   * @return maxEstimatedNumberOfDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxEstimatedNumberOfDays() {
    return maxEstimatedNumberOfDays;
  }


  public void setMaxEstimatedNumberOfDays(Integer maxEstimatedNumberOfDays) {
    this.maxEstimatedNumberOfDays = maxEstimatedNumberOfDays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrossBorderQuotesResponseUnitRatesDeliveryCommitment crossBorderQuotesResponseUnitRatesDeliveryCommitment = (CrossBorderQuotesResponseUnitRatesDeliveryCommitment) o;
    return Objects.equals(this.minEstimatedNumberOfDays, crossBorderQuotesResponseUnitRatesDeliveryCommitment.minEstimatedNumberOfDays) &&
        Objects.equals(this.maxEstimatedNumberOfDays, crossBorderQuotesResponseUnitRatesDeliveryCommitment.maxEstimatedNumberOfDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minEstimatedNumberOfDays, maxEstimatedNumberOfDays);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrossBorderQuotesResponseUnitRatesDeliveryCommitment {\n");
    sb.append("    minEstimatedNumberOfDays: ").append(toIndentedString(minEstimatedNumberOfDays)).append("\n");
    sb.append("    maxEstimatedNumberOfDays: ").append(toIndentedString(maxEstimatedNumberOfDays)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

