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

/**
 * CarrierFacilityRequestAddress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-27T12:45:29.729+05:30[Asia/Calcutta]")
public class CarrierFacilityRequestAddress {
  public static final String SERIALIZED_NAME_ADDRESS_LINES = "addressLines";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINES)
  private List<String> addressLines = null;

  public static final String SERIALIZED_NAME_CITY_TOWN = "cityTown";
  @SerializedName(SERIALIZED_NAME_CITY_TOWN)
  private String cityTown;

  public static final String SERIALIZED_NAME_STATE_PROVINCE = "stateProvince";
  @SerializedName(SERIALIZED_NAME_STATE_PROVINCE)
  private String stateProvince;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;


  public CarrierFacilityRequestAddress addressLines(List<String> addressLines) {
    
    this.addressLines = addressLines;
    return this;
  }

  public CarrierFacilityRequestAddress addAddressLinesItem(String addressLinesItem) {
    if (this.addressLines == null) {
      this.addressLines = new ArrayList<String>();
    }
    this.addressLines.add(addressLinesItem);
    return this;
  }

   /**
   * Get addressLines
   * @return addressLines
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAddressLines() {
    return addressLines;
  }


  public void setAddressLines(List<String> addressLines) {
    this.addressLines = addressLines;
  }


  public CarrierFacilityRequestAddress cityTown(String cityTown) {
    
    this.cityTown = cityTown;
    return this;
  }

   /**
   * Get cityTown
   * @return cityTown
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCityTown() {
    return cityTown;
  }


  public void setCityTown(String cityTown) {
    this.cityTown = cityTown;
  }


  public CarrierFacilityRequestAddress stateProvince(String stateProvince) {
    
    this.stateProvince = stateProvince;
    return this;
  }

   /**
   * Get stateProvince
   * @return stateProvince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStateProvince() {
    return stateProvince;
  }


  public void setStateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
  }


  public CarrierFacilityRequestAddress countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarrierFacilityRequestAddress carrierFacilityRequestAddress = (CarrierFacilityRequestAddress) o;
    return Objects.equals(this.addressLines, carrierFacilityRequestAddress.addressLines) &&
        Objects.equals(this.cityTown, carrierFacilityRequestAddress.cityTown) &&
        Objects.equals(this.stateProvince, carrierFacilityRequestAddress.stateProvince) &&
        Objects.equals(this.countryCode, carrierFacilityRequestAddress.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLines, cityTown, stateProvince, countryCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarrierFacilityRequestAddress {\n");
    sb.append("    addressLines: ").append(toIndentedString(addressLines)).append("\n");
    sb.append("    cityTown: ").append(toIndentedString(cityTown)).append("\n");
    sb.append("    stateProvince: ").append(toIndentedString(stateProvince)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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
