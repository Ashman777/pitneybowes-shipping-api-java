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


package org.openapitools.client.model;

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
import java.math.BigDecimal;
import org.openapitools.client.model.CrossBorderQuotesResponseUnitRatesDeliveryCommitment;

/**
 * CrossBorderQuotesResponseUnitRates
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-27T12:03:32.867+05:30[Asia/Calcutta]")
public class CrossBorderQuotesResponseUnitRates {
  public static final String SERIALIZED_NAME_UNIT_PRICE = "unitPrice";
  @SerializedName(SERIALIZED_NAME_UNIT_PRICE)
  private BigDecimal unitPrice;

  public static final String SERIALIZED_NAME_TOTAL_TAX_AMOUNT = "totalTaxAmount";
  @SerializedName(SERIALIZED_NAME_TOTAL_TAX_AMOUNT)
  private BigDecimal totalTaxAmount;

  public static final String SERIALIZED_NAME_TOTAL_DUTY_AMOUNT = "totalDutyAmount";
  @SerializedName(SERIALIZED_NAME_TOTAL_DUTY_AMOUNT)
  private Integer totalDutyAmount;

  public static final String SERIALIZED_NAME_SERVICE_ID = "serviceId";
  @SerializedName(SERIALIZED_NAME_SERVICE_ID)
  private String serviceId;

  public static final String SERIALIZED_NAME_BASE_CHARGE = "baseCharge";
  @SerializedName(SERIALIZED_NAME_BASE_CHARGE)
  private BigDecimal baseCharge;

  public static final String SERIALIZED_NAME_DELIVERY_COMMITMENT = "deliveryCommitment";
  @SerializedName(SERIALIZED_NAME_DELIVERY_COMMITMENT)
  private CrossBorderQuotesResponseUnitRatesDeliveryCommitment deliveryCommitment;

  public static final String SERIALIZED_NAME_TOTAL_CARRIER_CHARGE = "totalCarrierCharge";
  @SerializedName(SERIALIZED_NAME_TOTAL_CARRIER_CHARGE)
  private BigDecimal totalCarrierCharge;


  public CrossBorderQuotesResponseUnitRates unitPrice(BigDecimal unitPrice) {
    
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Get unitPrice
   * @return unitPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getUnitPrice() {
    return unitPrice;
  }


  public void setUnitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }


  public CrossBorderQuotesResponseUnitRates totalTaxAmount(BigDecimal totalTaxAmount) {
    
    this.totalTaxAmount = totalTaxAmount;
    return this;
  }

   /**
   * Get totalTaxAmount
   * @return totalTaxAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTotalTaxAmount() {
    return totalTaxAmount;
  }


  public void setTotalTaxAmount(BigDecimal totalTaxAmount) {
    this.totalTaxAmount = totalTaxAmount;
  }


  public CrossBorderQuotesResponseUnitRates totalDutyAmount(Integer totalDutyAmount) {
    
    this.totalDutyAmount = totalDutyAmount;
    return this;
  }

   /**
   * Get totalDutyAmount
   * @return totalDutyAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalDutyAmount() {
    return totalDutyAmount;
  }


  public void setTotalDutyAmount(Integer totalDutyAmount) {
    this.totalDutyAmount = totalDutyAmount;
  }


  public CrossBorderQuotesResponseUnitRates serviceId(String serviceId) {
    
    this.serviceId = serviceId;
    return this;
  }

   /**
   * Get serviceId
   * @return serviceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getServiceId() {
    return serviceId;
  }


  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }


  public CrossBorderQuotesResponseUnitRates baseCharge(BigDecimal baseCharge) {
    
    this.baseCharge = baseCharge;
    return this;
  }

   /**
   * Get baseCharge
   * @return baseCharge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getBaseCharge() {
    return baseCharge;
  }


  public void setBaseCharge(BigDecimal baseCharge) {
    this.baseCharge = baseCharge;
  }


  public CrossBorderQuotesResponseUnitRates deliveryCommitment(CrossBorderQuotesResponseUnitRatesDeliveryCommitment deliveryCommitment) {
    
    this.deliveryCommitment = deliveryCommitment;
    return this;
  }

   /**
   * Get deliveryCommitment
   * @return deliveryCommitment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CrossBorderQuotesResponseUnitRatesDeliveryCommitment getDeliveryCommitment() {
    return deliveryCommitment;
  }


  public void setDeliveryCommitment(CrossBorderQuotesResponseUnitRatesDeliveryCommitment deliveryCommitment) {
    this.deliveryCommitment = deliveryCommitment;
  }


  public CrossBorderQuotesResponseUnitRates totalCarrierCharge(BigDecimal totalCarrierCharge) {
    
    this.totalCarrierCharge = totalCarrierCharge;
    return this;
  }

   /**
   * Get totalCarrierCharge
   * @return totalCarrierCharge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTotalCarrierCharge() {
    return totalCarrierCharge;
  }


  public void setTotalCarrierCharge(BigDecimal totalCarrierCharge) {
    this.totalCarrierCharge = totalCarrierCharge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrossBorderQuotesResponseUnitRates crossBorderQuotesResponseUnitRates = (CrossBorderQuotesResponseUnitRates) o;
    return Objects.equals(this.unitPrice, crossBorderQuotesResponseUnitRates.unitPrice) &&
        Objects.equals(this.totalTaxAmount, crossBorderQuotesResponseUnitRates.totalTaxAmount) &&
        Objects.equals(this.totalDutyAmount, crossBorderQuotesResponseUnitRates.totalDutyAmount) &&
        Objects.equals(this.serviceId, crossBorderQuotesResponseUnitRates.serviceId) &&
        Objects.equals(this.baseCharge, crossBorderQuotesResponseUnitRates.baseCharge) &&
        Objects.equals(this.deliveryCommitment, crossBorderQuotesResponseUnitRates.deliveryCommitment) &&
        Objects.equals(this.totalCarrierCharge, crossBorderQuotesResponseUnitRates.totalCarrierCharge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitPrice, totalTaxAmount, totalDutyAmount, serviceId, baseCharge, deliveryCommitment, totalCarrierCharge);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrossBorderQuotesResponseUnitRates {\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    totalTaxAmount: ").append(toIndentedString(totalTaxAmount)).append("\n");
    sb.append("    totalDutyAmount: ").append(toIndentedString(totalDutyAmount)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    baseCharge: ").append(toIndentedString(baseCharge)).append("\n");
    sb.append("    deliveryCommitment: ").append(toIndentedString(deliveryCommitment)).append("\n");
    sb.append("    totalCarrierCharge: ").append(toIndentedString(totalCarrierCharge)).append("\n");
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
