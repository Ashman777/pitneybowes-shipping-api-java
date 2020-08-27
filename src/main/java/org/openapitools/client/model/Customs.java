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
import org.openapitools.client.model.CustomsInfo;
import org.openapitools.client.model.CustomsItem;

/**
 * Customs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-27T12:03:32.867+05:30[Asia/Calcutta]")
public class Customs {
  public static final String SERIALIZED_NAME_CUSTOMS_INFO = "customsInfo";
  @SerializedName(SERIALIZED_NAME_CUSTOMS_INFO)
  private CustomsInfo customsInfo;

  public static final String SERIALIZED_NAME_CUSTOMS_ITEMS = "customsItems";
  @SerializedName(SERIALIZED_NAME_CUSTOMS_ITEMS)
  private List<CustomsItem> customsItems = null;


  public Customs customsInfo(CustomsInfo customsInfo) {
    
    this.customsInfo = customsInfo;
    return this;
  }

   /**
   * Get customsInfo
   * @return customsInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CustomsInfo getCustomsInfo() {
    return customsInfo;
  }


  public void setCustomsInfo(CustomsInfo customsInfo) {
    this.customsInfo = customsInfo;
  }


  public Customs customsItems(List<CustomsItem> customsItems) {
    
    this.customsItems = customsItems;
    return this;
  }

  public Customs addCustomsItemsItem(CustomsItem customsItemsItem) {
    if (this.customsItems == null) {
      this.customsItems = new ArrayList<CustomsItem>();
    }
    this.customsItems.add(customsItemsItem);
    return this;
  }

   /**
   * Get customsItems
   * @return customsItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CustomsItem> getCustomsItems() {
    return customsItems;
  }


  public void setCustomsItems(List<CustomsItem> customsItems) {
    this.customsItems = customsItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customs customs = (Customs) o;
    return Objects.equals(this.customsInfo, customs.customsInfo) &&
        Objects.equals(this.customsItems, customs.customsItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customsInfo, customsItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customs {\n");
    sb.append("    customsInfo: ").append(toIndentedString(customsInfo)).append("\n");
    sb.append("    customsItems: ").append(toIndentedString(customsItems)).append("\n");
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

