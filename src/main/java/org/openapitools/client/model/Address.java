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
 * Address
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-27T12:03:32.867+05:30[Asia/Calcutta]")
public class Address {
  public static final String SERIALIZED_NAME_ADDRESS_LINES = "addressLines";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINES)
  private List<String> addressLines = null;

  public static final String SERIALIZED_NAME_CARRIER_ROUTE = "carrierRoute";
  @SerializedName(SERIALIZED_NAME_CARRIER_ROUTE)
  private String carrierRoute;

  public static final String SERIALIZED_NAME_CITY_TOWN = "cityTown";
  @SerializedName(SERIALIZED_NAME_CITY_TOWN)
  private String cityTown;

  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private String company;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_DELIVERY_POINT = "deliveryPoint";
  @SerializedName(SERIALIZED_NAME_DELIVERY_POINT)
  private String deliveryPoint;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_RESIDENTIAL = "residential";
  @SerializedName(SERIALIZED_NAME_RESIDENTIAL)
  private Boolean residential;

  public static final String SERIALIZED_NAME_STATE_PROVINCE = "stateProvince";
  @SerializedName(SERIALIZED_NAME_STATE_PROVINCE)
  private String stateProvince;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PARSED("PARSED"),
    
    VALIDATED_CHANGED("VALIDATED_CHANGED"),
    
    VALIDATED_AND_NOT_CHANGED("VALIDATED_AND_NOT_CHANGED"),
    
    NOT_CHANGED("NOT_CHANGED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_TAX_ID = "taxId";
  @SerializedName(SERIALIZED_NAME_TAX_ID)
  private String taxId;

  /**
   * Gets or Sets taxIdType
   */
  @JsonAdapter(TaxIdTypeEnum.Adapter.class)
  public enum TaxIdTypeEnum {
    EIN("EIN"),
    
    GST("GST"),
    
    VAT("VAT"),
    
    RFC("RFC"),
    
    EORI("EORI");

    private String value;

    TaxIdTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TaxIdTypeEnum fromValue(String value) {
      for (TaxIdTypeEnum b : TaxIdTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TaxIdTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TaxIdTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TaxIdTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TaxIdTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TAX_ID_TYPE = "taxIdType";
  @SerializedName(SERIALIZED_NAME_TAX_ID_TYPE)
  private TaxIdTypeEnum taxIdType;


  public Address addressLines(List<String> addressLines) {
    
    this.addressLines = addressLines;
    return this;
  }

  public Address addAddressLinesItem(String addressLinesItem) {
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


  public Address carrierRoute(String carrierRoute) {
    
    this.carrierRoute = carrierRoute;
    return this;
  }

   /**
   * Get carrierRoute
   * @return carrierRoute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCarrierRoute() {
    return carrierRoute;
  }


  public void setCarrierRoute(String carrierRoute) {
    this.carrierRoute = carrierRoute;
  }


  public Address cityTown(String cityTown) {
    
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


  public Address company(String company) {
    
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCompany() {
    return company;
  }


  public void setCompany(String company) {
    this.company = company;
  }


  public Address countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * 2-character country code (ISO-3166-1 alpha-2)
   * @return countryCode
  **/
  @ApiModelProperty(required = true, value = "2-character country code (ISO-3166-1 alpha-2)")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public Address deliveryPoint(String deliveryPoint) {
    
    this.deliveryPoint = deliveryPoint;
    return this;
  }

   /**
   * Get deliveryPoint
   * @return deliveryPoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeliveryPoint() {
    return deliveryPoint;
  }


  public void setDeliveryPoint(String deliveryPoint) {
    this.deliveryPoint = deliveryPoint;
  }


  public Address email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public Address name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Address phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public Address postalCode(String postalCode) {
    
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


  public Address residential(Boolean residential) {
    
    this.residential = residential;
    return this;
  }

   /**
   * Get residential
   * @return residential
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getResidential() {
    return residential;
  }


  public void setResidential(Boolean residential) {
    this.residential = residential;
  }


  public Address stateProvince(String stateProvince) {
    
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


  public Address status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Address taxId(String taxId) {
    
    this.taxId = taxId;
    return this;
  }

   /**
   * Get taxId
   * @return taxId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaxId() {
    return taxId;
  }


  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }


  public Address taxIdType(TaxIdTypeEnum taxIdType) {
    
    this.taxIdType = taxIdType;
    return this;
  }

   /**
   * Get taxIdType
   * @return taxIdType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TaxIdTypeEnum getTaxIdType() {
    return taxIdType;
  }


  public void setTaxIdType(TaxIdTypeEnum taxIdType) {
    this.taxIdType = taxIdType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.addressLines, address.addressLines) &&
        Objects.equals(this.carrierRoute, address.carrierRoute) &&
        Objects.equals(this.cityTown, address.cityTown) &&
        Objects.equals(this.company, address.company) &&
        Objects.equals(this.countryCode, address.countryCode) &&
        Objects.equals(this.deliveryPoint, address.deliveryPoint) &&
        Objects.equals(this.email, address.email) &&
        Objects.equals(this.name, address.name) &&
        Objects.equals(this.phone, address.phone) &&
        Objects.equals(this.postalCode, address.postalCode) &&
        Objects.equals(this.residential, address.residential) &&
        Objects.equals(this.stateProvince, address.stateProvince) &&
        Objects.equals(this.status, address.status) &&
        Objects.equals(this.taxId, address.taxId) &&
        Objects.equals(this.taxIdType, address.taxIdType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLines, carrierRoute, cityTown, company, countryCode, deliveryPoint, email, name, phone, postalCode, residential, stateProvince, status, taxId, taxIdType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    addressLines: ").append(toIndentedString(addressLines)).append("\n");
    sb.append("    carrierRoute: ").append(toIndentedString(carrierRoute)).append("\n");
    sb.append("    cityTown: ").append(toIndentedString(cityTown)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    deliveryPoint: ").append(toIndentedString(deliveryPoint)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    residential: ").append(toIndentedString(residential)).append("\n");
    sb.append("    stateProvince: ").append(toIndentedString(stateProvince)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    taxIdType: ").append(toIndentedString(taxIdType)).append("\n");
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

