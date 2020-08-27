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

/**
 * AddTrackingEventsEvents
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-27T12:03:32.867+05:30[Asia/Calcutta]")
public class AddTrackingEventsEvents {
  public static final String SERIALIZED_NAME_EVENT_CODE = "eventCode";
  @SerializedName(SERIALIZED_NAME_EVENT_CODE)
  private String eventCode;

  public static final String SERIALIZED_NAME_CARRIER_EVENT_CODE = "carrierEventCode";
  @SerializedName(SERIALIZED_NAME_CARRIER_EVENT_CODE)
  private String carrierEventCode;

  public static final String SERIALIZED_NAME_EVENT_DATE = "eventDate";
  @SerializedName(SERIALIZED_NAME_EVENT_DATE)
  private String eventDate;

  public static final String SERIALIZED_NAME_EVENT_TIME = "eventTime";
  @SerializedName(SERIALIZED_NAME_EVENT_TIME)
  private String eventTime;

  public static final String SERIALIZED_NAME_EVENT_TIME_OFFSET = "eventTimeOffset";
  @SerializedName(SERIALIZED_NAME_EVENT_TIME_OFFSET)
  private String eventTimeOffset;

  public static final String SERIALIZED_NAME_EVENT_CITY = "eventCity";
  @SerializedName(SERIALIZED_NAME_EVENT_CITY)
  private String eventCity;

  public static final String SERIALIZED_NAME_EVENT_STATE_OR_PROVINCE = "eventStateOrProvince";
  @SerializedName(SERIALIZED_NAME_EVENT_STATE_OR_PROVINCE)
  private String eventStateOrProvince;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;


  public AddTrackingEventsEvents eventCode(String eventCode) {
    
    this.eventCode = eventCode;
    return this;
  }

   /**
   * Get eventCode
   * @return eventCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEventCode() {
    return eventCode;
  }


  public void setEventCode(String eventCode) {
    this.eventCode = eventCode;
  }


  public AddTrackingEventsEvents carrierEventCode(String carrierEventCode) {
    
    this.carrierEventCode = carrierEventCode;
    return this;
  }

   /**
   * Get carrierEventCode
   * @return carrierEventCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCarrierEventCode() {
    return carrierEventCode;
  }


  public void setCarrierEventCode(String carrierEventCode) {
    this.carrierEventCode = carrierEventCode;
  }


  public AddTrackingEventsEvents eventDate(String eventDate) {
    
    this.eventDate = eventDate;
    return this;
  }

   /**
   * Get eventDate
   * @return eventDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEventDate() {
    return eventDate;
  }


  public void setEventDate(String eventDate) {
    this.eventDate = eventDate;
  }


  public AddTrackingEventsEvents eventTime(String eventTime) {
    
    this.eventTime = eventTime;
    return this;
  }

   /**
   * Get eventTime
   * @return eventTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEventTime() {
    return eventTime;
  }


  public void setEventTime(String eventTime) {
    this.eventTime = eventTime;
  }


  public AddTrackingEventsEvents eventTimeOffset(String eventTimeOffset) {
    
    this.eventTimeOffset = eventTimeOffset;
    return this;
  }

   /**
   * Get eventTimeOffset
   * @return eventTimeOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEventTimeOffset() {
    return eventTimeOffset;
  }


  public void setEventTimeOffset(String eventTimeOffset) {
    this.eventTimeOffset = eventTimeOffset;
  }


  public AddTrackingEventsEvents eventCity(String eventCity) {
    
    this.eventCity = eventCity;
    return this;
  }

   /**
   * Get eventCity
   * @return eventCity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEventCity() {
    return eventCity;
  }


  public void setEventCity(String eventCity) {
    this.eventCity = eventCity;
  }


  public AddTrackingEventsEvents eventStateOrProvince(String eventStateOrProvince) {
    
    this.eventStateOrProvince = eventStateOrProvince;
    return this;
  }

   /**
   * Get eventStateOrProvince
   * @return eventStateOrProvince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEventStateOrProvince() {
    return eventStateOrProvince;
  }


  public void setEventStateOrProvince(String eventStateOrProvince) {
    this.eventStateOrProvince = eventStateOrProvince;
  }


  public AddTrackingEventsEvents postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public AddTrackingEventsEvents country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddTrackingEventsEvents addTrackingEventsEvents = (AddTrackingEventsEvents) o;
    return Objects.equals(this.eventCode, addTrackingEventsEvents.eventCode) &&
        Objects.equals(this.carrierEventCode, addTrackingEventsEvents.carrierEventCode) &&
        Objects.equals(this.eventDate, addTrackingEventsEvents.eventDate) &&
        Objects.equals(this.eventTime, addTrackingEventsEvents.eventTime) &&
        Objects.equals(this.eventTimeOffset, addTrackingEventsEvents.eventTimeOffset) &&
        Objects.equals(this.eventCity, addTrackingEventsEvents.eventCity) &&
        Objects.equals(this.eventStateOrProvince, addTrackingEventsEvents.eventStateOrProvince) &&
        Objects.equals(this.postalCode, addTrackingEventsEvents.postalCode) &&
        Objects.equals(this.country, addTrackingEventsEvents.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventCode, carrierEventCode, eventDate, eventTime, eventTimeOffset, eventCity, eventStateOrProvince, postalCode, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddTrackingEventsEvents {\n");
    sb.append("    eventCode: ").append(toIndentedString(eventCode)).append("\n");
    sb.append("    carrierEventCode: ").append(toIndentedString(carrierEventCode)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    eventTimeOffset: ").append(toIndentedString(eventTimeOffset)).append("\n");
    sb.append("    eventCity: ").append(toIndentedString(eventCity)).append("\n");
    sb.append("    eventStateOrProvince: ").append(toIndentedString(eventStateOrProvince)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

