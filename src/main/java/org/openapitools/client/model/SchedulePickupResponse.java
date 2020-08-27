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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Address;
import org.openapitools.client.model.SchedulePickupPickupSummary;

/**
 * SchedulePickupResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-27T12:03:32.867+05:30[Asia/Calcutta]")
public class SchedulePickupResponse {
  public static final String SERIALIZED_NAME_PICKUP_ADDRESS = "pickupAddress";
  @SerializedName(SERIALIZED_NAME_PICKUP_ADDRESS)
  private Address pickupAddress;

  public static final String SERIALIZED_NAME_CARRIER = "carrier";
  @SerializedName(SERIALIZED_NAME_CARRIER)
  private String carrier;

  public static final String SERIALIZED_NAME_PICKUP_SUMMARY = "pickupSummary";
  @SerializedName(SERIALIZED_NAME_PICKUP_SUMMARY)
  private List<SchedulePickupPickupSummary> pickupSummary = null;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_PACKAGE_LOCATION = "packageLocation";
  @SerializedName(SERIALIZED_NAME_PACKAGE_LOCATION)
  private String packageLocation;

  public static final String SERIALIZED_NAME_SPECIAL_INSTRUCTIONS = "specialInstructions";
  @SerializedName(SERIALIZED_NAME_SPECIAL_INSTRUCTIONS)
  private String specialInstructions;

  public static final String SERIALIZED_NAME_PICKUP_DATE_TIME = "pickupDateTime";
  @SerializedName(SERIALIZED_NAME_PICKUP_DATE_TIME)
  private String pickupDateTime;

  public static final String SERIALIZED_NAME_PICKUP_CONFIRMATION_NUMBER = "pickupConfirmationNumber";
  @SerializedName(SERIALIZED_NAME_PICKUP_CONFIRMATION_NUMBER)
  private String pickupConfirmationNumber;

  public static final String SERIALIZED_NAME_PICKUP_ID = "pickupId";
  @SerializedName(SERIALIZED_NAME_PICKUP_ID)
  private String pickupId;


  public SchedulePickupResponse pickupAddress(Address pickupAddress) {
    
    this.pickupAddress = pickupAddress;
    return this;
  }

   /**
   * Get pickupAddress
   * @return pickupAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Address getPickupAddress() {
    return pickupAddress;
  }


  public void setPickupAddress(Address pickupAddress) {
    this.pickupAddress = pickupAddress;
  }


  public SchedulePickupResponse carrier(String carrier) {
    
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


  public SchedulePickupResponse pickupSummary(List<SchedulePickupPickupSummary> pickupSummary) {
    
    this.pickupSummary = pickupSummary;
    return this;
  }

  public SchedulePickupResponse addPickupSummaryItem(SchedulePickupPickupSummary pickupSummaryItem) {
    if (this.pickupSummary == null) {
      this.pickupSummary = new ArrayList<SchedulePickupPickupSummary>();
    }
    this.pickupSummary.add(pickupSummaryItem);
    return this;
  }

   /**
   * Get pickupSummary
   * @return pickupSummary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SchedulePickupPickupSummary> getPickupSummary() {
    return pickupSummary;
  }


  public void setPickupSummary(List<SchedulePickupPickupSummary> pickupSummary) {
    this.pickupSummary = pickupSummary;
  }


  public SchedulePickupResponse reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public SchedulePickupResponse packageLocation(String packageLocation) {
    
    this.packageLocation = packageLocation;
    return this;
  }

   /**
   * Get packageLocation
   * @return packageLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPackageLocation() {
    return packageLocation;
  }


  public void setPackageLocation(String packageLocation) {
    this.packageLocation = packageLocation;
  }


  public SchedulePickupResponse specialInstructions(String specialInstructions) {
    
    this.specialInstructions = specialInstructions;
    return this;
  }

   /**
   * Get specialInstructions
   * @return specialInstructions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSpecialInstructions() {
    return specialInstructions;
  }


  public void setSpecialInstructions(String specialInstructions) {
    this.specialInstructions = specialInstructions;
  }


  public SchedulePickupResponse pickupDateTime(String pickupDateTime) {
    
    this.pickupDateTime = pickupDateTime;
    return this;
  }

   /**
   * Get pickupDateTime
   * @return pickupDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPickupDateTime() {
    return pickupDateTime;
  }


  public void setPickupDateTime(String pickupDateTime) {
    this.pickupDateTime = pickupDateTime;
  }


  public SchedulePickupResponse pickupConfirmationNumber(String pickupConfirmationNumber) {
    
    this.pickupConfirmationNumber = pickupConfirmationNumber;
    return this;
  }

   /**
   * Get pickupConfirmationNumber
   * @return pickupConfirmationNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPickupConfirmationNumber() {
    return pickupConfirmationNumber;
  }


  public void setPickupConfirmationNumber(String pickupConfirmationNumber) {
    this.pickupConfirmationNumber = pickupConfirmationNumber;
  }


  public SchedulePickupResponse pickupId(String pickupId) {
    
    this.pickupId = pickupId;
    return this;
  }

   /**
   * Get pickupId
   * @return pickupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPickupId() {
    return pickupId;
  }


  public void setPickupId(String pickupId) {
    this.pickupId = pickupId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchedulePickupResponse schedulePickupResponse = (SchedulePickupResponse) o;
    return Objects.equals(this.pickupAddress, schedulePickupResponse.pickupAddress) &&
        Objects.equals(this.carrier, schedulePickupResponse.carrier) &&
        Objects.equals(this.pickupSummary, schedulePickupResponse.pickupSummary) &&
        Objects.equals(this.reference, schedulePickupResponse.reference) &&
        Objects.equals(this.packageLocation, schedulePickupResponse.packageLocation) &&
        Objects.equals(this.specialInstructions, schedulePickupResponse.specialInstructions) &&
        Objects.equals(this.pickupDateTime, schedulePickupResponse.pickupDateTime) &&
        Objects.equals(this.pickupConfirmationNumber, schedulePickupResponse.pickupConfirmationNumber) &&
        Objects.equals(this.pickupId, schedulePickupResponse.pickupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pickupAddress, carrier, pickupSummary, reference, packageLocation, specialInstructions, pickupDateTime, pickupConfirmationNumber, pickupId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchedulePickupResponse {\n");
    sb.append("    pickupAddress: ").append(toIndentedString(pickupAddress)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    pickupSummary: ").append(toIndentedString(pickupSummary)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    packageLocation: ").append(toIndentedString(packageLocation)).append("\n");
    sb.append("    specialInstructions: ").append(toIndentedString(specialInstructions)).append("\n");
    sb.append("    pickupDateTime: ").append(toIndentedString(pickupDateTime)).append("\n");
    sb.append("    pickupConfirmationNumber: ").append(toIndentedString(pickupConfirmationNumber)).append("\n");
    sb.append("    pickupId: ").append(toIndentedString(pickupId)).append("\n");
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

