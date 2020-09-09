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
 * ParcelProtectionPolicyResponseShipmentDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-10T01:37:26.222+05:30[Asia/Calcutta]")
public class ParcelProtectionPolicyResponseShipmentDetails {
  public static final String SERIALIZED_NAME_SHIPMENT_DATE = "shipmentDate";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_DATE)
  private String shipmentDate;

  public static final String SERIALIZED_NAME_SHIPMENT_TRANSACTION_ID = "shipmentTransactionId";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_TRANSACTION_ID)
  private String shipmentTransactionId;

  public static final String SERIALIZED_NAME_SHIPMENT_ID = "shipmentId";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_ID)
  private String shipmentId;

  public static final String SERIALIZED_NAME_PARCEL_TRACKING_NUMBER = "parcelTrackingNumber";
  @SerializedName(SERIALIZED_NAME_PARCEL_TRACKING_NUMBER)
  private String parcelTrackingNumber;

  public static final String SERIALIZED_NAME_CARRIER = "carrier";
  @SerializedName(SERIALIZED_NAME_CARRIER)
  private String carrier;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_PACKAGE_LENGTH = "packageLength";
  @SerializedName(SERIALIZED_NAME_PACKAGE_LENGTH)
  private String packageLength;

  public static final String SERIALIZED_NAME_PACKAGE_WIDTH = "packageWidth";
  @SerializedName(SERIALIZED_NAME_PACKAGE_WIDTH)
  private String packageWidth;

  public static final String SERIALIZED_NAME_PACKAGE_HEIGHT = "packageHeight";
  @SerializedName(SERIALIZED_NAME_PACKAGE_HEIGHT)
  private String packageHeight;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private String weight;

  public static final String SERIALIZED_NAME_ZONE = "zone";
  @SerializedName(SERIALIZED_NAME_ZONE)
  private String zone;


  public ParcelProtectionPolicyResponseShipmentDetails shipmentDate(String shipmentDate) {
    
    this.shipmentDate = shipmentDate;
    return this;
  }

   /**
   * Get shipmentDate
   * @return shipmentDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getShipmentDate() {
    return shipmentDate;
  }


  public void setShipmentDate(String shipmentDate) {
    this.shipmentDate = shipmentDate;
  }


  public ParcelProtectionPolicyResponseShipmentDetails shipmentTransactionId(String shipmentTransactionId) {
    
    this.shipmentTransactionId = shipmentTransactionId;
    return this;
  }

   /**
   * Get shipmentTransactionId
   * @return shipmentTransactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getShipmentTransactionId() {
    return shipmentTransactionId;
  }


  public void setShipmentTransactionId(String shipmentTransactionId) {
    this.shipmentTransactionId = shipmentTransactionId;
  }


  public ParcelProtectionPolicyResponseShipmentDetails shipmentId(String shipmentId) {
    
    this.shipmentId = shipmentId;
    return this;
  }

   /**
   * Get shipmentId
   * @return shipmentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getShipmentId() {
    return shipmentId;
  }


  public void setShipmentId(String shipmentId) {
    this.shipmentId = shipmentId;
  }


  public ParcelProtectionPolicyResponseShipmentDetails parcelTrackingNumber(String parcelTrackingNumber) {
    
    this.parcelTrackingNumber = parcelTrackingNumber;
    return this;
  }

   /**
   * Get parcelTrackingNumber
   * @return parcelTrackingNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getParcelTrackingNumber() {
    return parcelTrackingNumber;
  }


  public void setParcelTrackingNumber(String parcelTrackingNumber) {
    this.parcelTrackingNumber = parcelTrackingNumber;
  }


  public ParcelProtectionPolicyResponseShipmentDetails carrier(String carrier) {
    
    this.carrier = carrier;
    return this;
  }

   /**
   * Get carrier
   * @return carrier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCarrier() {
    return carrier;
  }


  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }


  public ParcelProtectionPolicyResponseShipmentDetails amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public ParcelProtectionPolicyResponseShipmentDetails packageLength(String packageLength) {
    
    this.packageLength = packageLength;
    return this;
  }

   /**
   * Get packageLength
   * @return packageLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPackageLength() {
    return packageLength;
  }


  public void setPackageLength(String packageLength) {
    this.packageLength = packageLength;
  }


  public ParcelProtectionPolicyResponseShipmentDetails packageWidth(String packageWidth) {
    
    this.packageWidth = packageWidth;
    return this;
  }

   /**
   * Get packageWidth
   * @return packageWidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPackageWidth() {
    return packageWidth;
  }


  public void setPackageWidth(String packageWidth) {
    this.packageWidth = packageWidth;
  }


  public ParcelProtectionPolicyResponseShipmentDetails packageHeight(String packageHeight) {
    
    this.packageHeight = packageHeight;
    return this;
  }

   /**
   * Get packageHeight
   * @return packageHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPackageHeight() {
    return packageHeight;
  }


  public void setPackageHeight(String packageHeight) {
    this.packageHeight = packageHeight;
  }


  public ParcelProtectionPolicyResponseShipmentDetails weight(String weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWeight() {
    return weight;
  }


  public void setWeight(String weight) {
    this.weight = weight;
  }


  public ParcelProtectionPolicyResponseShipmentDetails zone(String zone) {
    
    this.zone = zone;
    return this;
  }

   /**
   * Get zone
   * @return zone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getZone() {
    return zone;
  }


  public void setZone(String zone) {
    this.zone = zone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParcelProtectionPolicyResponseShipmentDetails parcelProtectionPolicyResponseShipmentDetails = (ParcelProtectionPolicyResponseShipmentDetails) o;
    return Objects.equals(this.shipmentDate, parcelProtectionPolicyResponseShipmentDetails.shipmentDate) &&
        Objects.equals(this.shipmentTransactionId, parcelProtectionPolicyResponseShipmentDetails.shipmentTransactionId) &&
        Objects.equals(this.shipmentId, parcelProtectionPolicyResponseShipmentDetails.shipmentId) &&
        Objects.equals(this.parcelTrackingNumber, parcelProtectionPolicyResponseShipmentDetails.parcelTrackingNumber) &&
        Objects.equals(this.carrier, parcelProtectionPolicyResponseShipmentDetails.carrier) &&
        Objects.equals(this.amount, parcelProtectionPolicyResponseShipmentDetails.amount) &&
        Objects.equals(this.packageLength, parcelProtectionPolicyResponseShipmentDetails.packageLength) &&
        Objects.equals(this.packageWidth, parcelProtectionPolicyResponseShipmentDetails.packageWidth) &&
        Objects.equals(this.packageHeight, parcelProtectionPolicyResponseShipmentDetails.packageHeight) &&
        Objects.equals(this.weight, parcelProtectionPolicyResponseShipmentDetails.weight) &&
        Objects.equals(this.zone, parcelProtectionPolicyResponseShipmentDetails.zone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipmentDate, shipmentTransactionId, shipmentId, parcelTrackingNumber, carrier, amount, packageLength, packageWidth, packageHeight, weight, zone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParcelProtectionPolicyResponseShipmentDetails {\n");
    sb.append("    shipmentDate: ").append(toIndentedString(shipmentDate)).append("\n");
    sb.append("    shipmentTransactionId: ").append(toIndentedString(shipmentTransactionId)).append("\n");
    sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
    sb.append("    parcelTrackingNumber: ").append(toIndentedString(parcelTrackingNumber)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    packageLength: ").append(toIndentedString(packageLength)).append("\n");
    sb.append("    packageWidth: ").append(toIndentedString(packageWidth)).append("\n");
    sb.append("    packageHeight: ").append(toIndentedString(packageHeight)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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

