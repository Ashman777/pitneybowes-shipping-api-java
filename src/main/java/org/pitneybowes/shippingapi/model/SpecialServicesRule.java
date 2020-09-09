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
import java.util.ArrayList;
import java.util.List;
import org.pitneybowes.shippingapi.model.PrerequisiteRules;
import org.pitneybowes.shippingapi.model.ServicesParameterRule;
import org.pitneybowes.shippingapi.model.SpecialServiceCodes;

/**
 * SpecialServicesRule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-10T01:37:26.222+05:30[Asia/Calcutta]")
public class SpecialServicesRule {
  public static final String SERIALIZED_NAME_SPECIAL_SERVICE_ID = "specialServiceId";
  @SerializedName(SERIALIZED_NAME_SPECIAL_SERVICE_ID)
  private SpecialServiceCodes specialServiceId;

  public static final String SERIALIZED_NAME_BRANDED_NAME = "brandedName";
  @SerializedName(SERIALIZED_NAME_BRANDED_NAME)
  private String brandedName;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "categoryId";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private String categoryId;

  public static final String SERIALIZED_NAME_CATEGORY_NAME = "categoryName";
  @SerializedName(SERIALIZED_NAME_CATEGORY_NAME)
  private String categoryName;

  public static final String SERIALIZED_NAME_TRACKABLE = "trackable";
  @SerializedName(SERIALIZED_NAME_TRACKABLE)
  private Boolean trackable;

  public static final String SERIALIZED_NAME_INPUT_PARAMETER_RULES = "inputParameterRules";
  @SerializedName(SERIALIZED_NAME_INPUT_PARAMETER_RULES)
  private List<ServicesParameterRule> inputParameterRules = null;

  public static final String SERIALIZED_NAME_PREREQUISITE_RULES = "prerequisiteRules";
  @SerializedName(SERIALIZED_NAME_PREREQUISITE_RULES)
  private List<PrerequisiteRules> prerequisiteRules = null;

  public static final String SERIALIZED_NAME_INCOMPATIBLE_SPECIAL_SERVICES = "incompatibleSpecialServices";
  @SerializedName(SERIALIZED_NAME_INCOMPATIBLE_SPECIAL_SERVICES)
  private SpecialServiceCodes incompatibleSpecialServices;


  public SpecialServicesRule specialServiceId(SpecialServiceCodes specialServiceId) {
    
    this.specialServiceId = specialServiceId;
    return this;
  }

   /**
   * Get specialServiceId
   * @return specialServiceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SpecialServiceCodes getSpecialServiceId() {
    return specialServiceId;
  }


  public void setSpecialServiceId(SpecialServiceCodes specialServiceId) {
    this.specialServiceId = specialServiceId;
  }


  public SpecialServicesRule brandedName(String brandedName) {
    
    this.brandedName = brandedName;
    return this;
  }

   /**
   * Get brandedName
   * @return brandedName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBrandedName() {
    return brandedName;
  }


  public void setBrandedName(String brandedName) {
    this.brandedName = brandedName;
  }


  public SpecialServicesRule categoryId(String categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Get categoryId
   * @return categoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  public SpecialServicesRule categoryName(String categoryName) {
    
    this.categoryName = categoryName;
    return this;
  }

   /**
   * Get categoryName
   * @return categoryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCategoryName() {
    return categoryName;
  }


  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }


  public SpecialServicesRule trackable(Boolean trackable) {
    
    this.trackable = trackable;
    return this;
  }

   /**
   * Get trackable
   * @return trackable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTrackable() {
    return trackable;
  }


  public void setTrackable(Boolean trackable) {
    this.trackable = trackable;
  }


  public SpecialServicesRule inputParameterRules(List<ServicesParameterRule> inputParameterRules) {
    
    this.inputParameterRules = inputParameterRules;
    return this;
  }

  public SpecialServicesRule addInputParameterRulesItem(ServicesParameterRule inputParameterRulesItem) {
    if (this.inputParameterRules == null) {
      this.inputParameterRules = new ArrayList<ServicesParameterRule>();
    }
    this.inputParameterRules.add(inputParameterRulesItem);
    return this;
  }

   /**
   * Get inputParameterRules
   * @return inputParameterRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ServicesParameterRule> getInputParameterRules() {
    return inputParameterRules;
  }


  public void setInputParameterRules(List<ServicesParameterRule> inputParameterRules) {
    this.inputParameterRules = inputParameterRules;
  }


  public SpecialServicesRule prerequisiteRules(List<PrerequisiteRules> prerequisiteRules) {
    
    this.prerequisiteRules = prerequisiteRules;
    return this;
  }

  public SpecialServicesRule addPrerequisiteRulesItem(PrerequisiteRules prerequisiteRulesItem) {
    if (this.prerequisiteRules == null) {
      this.prerequisiteRules = new ArrayList<PrerequisiteRules>();
    }
    this.prerequisiteRules.add(prerequisiteRulesItem);
    return this;
  }

   /**
   * Get prerequisiteRules
   * @return prerequisiteRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PrerequisiteRules> getPrerequisiteRules() {
    return prerequisiteRules;
  }


  public void setPrerequisiteRules(List<PrerequisiteRules> prerequisiteRules) {
    this.prerequisiteRules = prerequisiteRules;
  }


  public SpecialServicesRule incompatibleSpecialServices(SpecialServiceCodes incompatibleSpecialServices) {
    
    this.incompatibleSpecialServices = incompatibleSpecialServices;
    return this;
  }

   /**
   * Get incompatibleSpecialServices
   * @return incompatibleSpecialServices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SpecialServiceCodes getIncompatibleSpecialServices() {
    return incompatibleSpecialServices;
  }


  public void setIncompatibleSpecialServices(SpecialServiceCodes incompatibleSpecialServices) {
    this.incompatibleSpecialServices = incompatibleSpecialServices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecialServicesRule specialServicesRule = (SpecialServicesRule) o;
    return Objects.equals(this.specialServiceId, specialServicesRule.specialServiceId) &&
        Objects.equals(this.brandedName, specialServicesRule.brandedName) &&
        Objects.equals(this.categoryId, specialServicesRule.categoryId) &&
        Objects.equals(this.categoryName, specialServicesRule.categoryName) &&
        Objects.equals(this.trackable, specialServicesRule.trackable) &&
        Objects.equals(this.inputParameterRules, specialServicesRule.inputParameterRules) &&
        Objects.equals(this.prerequisiteRules, specialServicesRule.prerequisiteRules) &&
        Objects.equals(this.incompatibleSpecialServices, specialServicesRule.incompatibleSpecialServices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(specialServiceId, brandedName, categoryId, categoryName, trackable, inputParameterRules, prerequisiteRules, incompatibleSpecialServices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialServicesRule {\n");
    sb.append("    specialServiceId: ").append(toIndentedString(specialServiceId)).append("\n");
    sb.append("    brandedName: ").append(toIndentedString(brandedName)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    trackable: ").append(toIndentedString(trackable)).append("\n");
    sb.append("    inputParameterRules: ").append(toIndentedString(inputParameterRules)).append("\n");
    sb.append("    prerequisiteRules: ").append(toIndentedString(prerequisiteRules)).append("\n");
    sb.append("    incompatibleSpecialServices: ").append(toIndentedString(incompatibleSpecialServices)).append("\n");
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

