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
import java.math.BigDecimal;
import org.pitneybowes.shippingapi.model.Address;

/**
 * CustomsInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-10T01:37:26.222+05:30[Asia/Calcutta]")
public class CustomsInfo {
  public static final String SERIALIZED_NAME_E_E_L_P_F_C = "EELPFC";
  @SerializedName(SERIALIZED_NAME_E_E_L_P_F_C)
  private String EELPFC;

  public static final String SERIALIZED_NAME_BLANKET_END_DATE = "blanketEndDate";
  @SerializedName(SERIALIZED_NAME_BLANKET_END_DATE)
  private String blanketEndDate;

  public static final String SERIALIZED_NAME_BLANKET_START_DATE = "blanketStartDate";
  @SerializedName(SERIALIZED_NAME_BLANKET_START_DATE)
  private String blanketStartDate;

  public static final String SERIALIZED_NAME_CERTIFICATE_NUMBER = "certificateNumber";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_NUMBER)
  private String certificateNumber;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private String comments;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_CUSTOMS_DECLARED_VALUE = "customsDeclaredValue";
  @SerializedName(SERIALIZED_NAME_CUSTOMS_DECLARED_VALUE)
  private BigDecimal customsDeclaredValue;

  public static final String SERIALIZED_NAME_DECLARATION_STATEMENT = "declarationStatement";
  @SerializedName(SERIALIZED_NAME_DECLARATION_STATEMENT)
  private String declarationStatement;

  public static final String SERIALIZED_NAME_FREIGHT_CHARGE = "freightCharge";
  @SerializedName(SERIALIZED_NAME_FREIGHT_CHARGE)
  private BigDecimal freightCharge;

  public static final String SERIALIZED_NAME_FROM_CUSTOMS_REFERENCE = "fromCustomsReference";
  @SerializedName(SERIALIZED_NAME_FROM_CUSTOMS_REFERENCE)
  private String fromCustomsReference;

  public static final String SERIALIZED_NAME_HANDLING_COSTS = "handlingCosts";
  @SerializedName(SERIALIZED_NAME_HANDLING_COSTS)
  private BigDecimal handlingCosts;

  public static final String SERIALIZED_NAME_IMPORTER_CUSTOMS_REFERENCE = "importerCustomsReference";
  @SerializedName(SERIALIZED_NAME_IMPORTER_CUSTOMS_REFERENCE)
  private String importerCustomsReference;

  public static final String SERIALIZED_NAME_INSURED_AMOUNT = "insuredAmount";
  @SerializedName(SERIALIZED_NAME_INSURED_AMOUNT)
  private BigDecimal insuredAmount;

  public static final String SERIALIZED_NAME_INSURED_NUMBER = "insuredNumber";
  @SerializedName(SERIALIZED_NAME_INSURED_NUMBER)
  private String insuredNumber;

  public static final String SERIALIZED_NAME_INVOICE_NUMBER = "invoiceNumber";
  @SerializedName(SERIALIZED_NAME_INVOICE_NUMBER)
  private String invoiceNumber;

  public static final String SERIALIZED_NAME_LICENSE_NUMBER = "licenseNumber";
  @SerializedName(SERIALIZED_NAME_LICENSE_NUMBER)
  private String licenseNumber;

  public static final String SERIALIZED_NAME_OTHER_CHARGE = "otherCharge";
  @SerializedName(SERIALIZED_NAME_OTHER_CHARGE)
  private BigDecimal otherCharge;

  public static final String SERIALIZED_NAME_OTHER_DESCRIPTION = "otherDescription";
  @SerializedName(SERIALIZED_NAME_OTHER_DESCRIPTION)
  private String otherDescription;

  /**
   * Gets or Sets otherType
   */
  @JsonAdapter(OtherTypeEnum.Adapter.class)
  public enum OtherTypeEnum {
    COMMISSIONS("COMMISSIONS"),
    
    DISCOUNTS("DISCOUNTS"),
    
    HANDLING_FEES("HANDLING_FEES"),
    
    OTHER("OTHER"),
    
    ROYALTIES_AND_LICENSE_FEES("ROYALTIES_AND_LICENSE_FEES"),
    
    TAXES("TAXES");

    private String value;

    OtherTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OtherTypeEnum fromValue(String value) {
      for (OtherTypeEnum b : OtherTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OtherTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OtherTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OtherTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OtherTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OTHER_TYPE = "otherType";
  @SerializedName(SERIALIZED_NAME_OTHER_TYPE)
  private OtherTypeEnum otherType;

  public static final String SERIALIZED_NAME_PACKING_COSTS = "packingCosts";
  @SerializedName(SERIALIZED_NAME_PACKING_COSTS)
  private BigDecimal packingCosts;

  /**
   * Gets or Sets producerSpecification
   */
  @JsonAdapter(ProducerSpecificationEnum.Adapter.class)
  public enum ProducerSpecificationEnum {
    MULTIPLE_SPECIFIED("MULTIPLE_SPECIFIED"),
    
    SAME("SAME"),
    
    SINGLE_SPECIFIED("SINGLE_SPECIFIED"),
    
    UNKNOWN("UNKNOWN"),
    
    AVAILABLE_UPON_REQUEST("AVAILABLE_UPON_REQUEST");

    private String value;

    ProducerSpecificationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProducerSpecificationEnum fromValue(String value) {
      for (ProducerSpecificationEnum b : ProducerSpecificationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProducerSpecificationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProducerSpecificationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProducerSpecificationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProducerSpecificationEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PRODUCER_SPECIFICATION = "producerSpecification";
  @SerializedName(SERIALIZED_NAME_PRODUCER_SPECIFICATION)
  private ProducerSpecificationEnum producerSpecification;

  /**
   * Gets or Sets reasonForExport
   */
  @JsonAdapter(ReasonForExportEnum.Adapter.class)
  public enum ReasonForExportEnum {
    GIFT("GIFT"),
    
    COMMERCIAL_SAMPLE("COMMERCIAL_SAMPLE"),
    
    MERCHANDISE("MERCHANDISE"),
    
    DOCUMENTS("DOCUMENTS"),
    
    RETURNED_GOODS("RETURNED_GOODS"),
    
    SOLD("SOLD"),
    
    NOT_SOLD("NOT_SOLD"),
    
    OTHER("OTHER"),
    
    DANGEROUS_GOOD("DANGEROUS_GOOD"),
    
    HUMANITARIAN_GOODS("HUMANITARIAN_GOODS");

    private String value;

    ReasonForExportEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReasonForExportEnum fromValue(String value) {
      for (ReasonForExportEnum b : ReasonForExportEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ReasonForExportEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReasonForExportEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReasonForExportEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ReasonForExportEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REASON_FOR_EXPORT = "reasonForExport";
  @SerializedName(SERIALIZED_NAME_REASON_FOR_EXPORT)
  private ReasonForExportEnum reasonForExport;

  public static final String SERIALIZED_NAME_REASON_FOR_EXPORT_EXPLANATION = "reasonForExportExplanation";
  @SerializedName(SERIALIZED_NAME_REASON_FOR_EXPORT_EXPLANATION)
  private String reasonForExportExplanation;

  public static final String SERIALIZED_NAME_SDR_VALUE = "sdrValue";
  @SerializedName(SERIALIZED_NAME_SDR_VALUE)
  private BigDecimal sdrValue;

  /**
   * Gets or Sets shippingDocumentType
   */
  @JsonAdapter(ShippingDocumentTypeEnum.Adapter.class)
  public enum ShippingDocumentTypeEnum {
    NAFTA("NAFTA"),
    
    COO("COO");

    private String value;

    ShippingDocumentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ShippingDocumentTypeEnum fromValue(String value) {
      for (ShippingDocumentTypeEnum b : ShippingDocumentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ShippingDocumentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ShippingDocumentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ShippingDocumentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ShippingDocumentTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SHIPPING_DOCUMENT_TYPE = "shippingDocumentType";
  @SerializedName(SERIALIZED_NAME_SHIPPING_DOCUMENT_TYPE)
  private ShippingDocumentTypeEnum shippingDocumentType;

  public static final String SERIALIZED_NAME_SIGNATURE_CONTACT = "signatureContact";
  @SerializedName(SERIALIZED_NAME_SIGNATURE_CONTACT)
  private Address signatureContact;

  public static final String SERIALIZED_NAME_TERMS_OF_SALE = "termsOfSale";
  @SerializedName(SERIALIZED_NAME_TERMS_OF_SALE)
  private String termsOfSale;


  public CustomsInfo EELPFC(String EELPFC) {
    
    this.EELPFC = EELPFC;
    return this;
  }

   /**
   * Get EELPFC
   * @return EELPFC
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEELPFC() {
    return EELPFC;
  }


  public void setEELPFC(String EELPFC) {
    this.EELPFC = EELPFC;
  }


  public CustomsInfo blanketEndDate(String blanketEndDate) {
    
    this.blanketEndDate = blanketEndDate;
    return this;
  }

   /**
   * format: YYYY-MM-DD
   * @return blanketEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "format: YYYY-MM-DD")

  public String getBlanketEndDate() {
    return blanketEndDate;
  }


  public void setBlanketEndDate(String blanketEndDate) {
    this.blanketEndDate = blanketEndDate;
  }


  public CustomsInfo blanketStartDate(String blanketStartDate) {
    
    this.blanketStartDate = blanketStartDate;
    return this;
  }

   /**
   * format: YYYY-MM-DD
   * @return blanketStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "format: YYYY-MM-DD")

  public String getBlanketStartDate() {
    return blanketStartDate;
  }


  public void setBlanketStartDate(String blanketStartDate) {
    this.blanketStartDate = blanketStartDate;
  }


  public CustomsInfo certificateNumber(String certificateNumber) {
    
    this.certificateNumber = certificateNumber;
    return this;
  }

   /**
   * Get certificateNumber
   * @return certificateNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCertificateNumber() {
    return certificateNumber;
  }


  public void setCertificateNumber(String certificateNumber) {
    this.certificateNumber = certificateNumber;
  }


  public CustomsInfo comments(String comments) {
    
    this.comments = comments;
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getComments() {
    return comments;
  }


  public void setComments(String comments) {
    this.comments = comments;
  }


  public CustomsInfo currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * ISO-4217
   * @return currencyCode
  **/
  @ApiModelProperty(required = true, value = "ISO-4217")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public CustomsInfo customsDeclaredValue(BigDecimal customsDeclaredValue) {
    
    this.customsDeclaredValue = customsDeclaredValue;
    return this;
  }

   /**
   * Get customsDeclaredValue
   * @return customsDeclaredValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getCustomsDeclaredValue() {
    return customsDeclaredValue;
  }


  public void setCustomsDeclaredValue(BigDecimal customsDeclaredValue) {
    this.customsDeclaredValue = customsDeclaredValue;
  }


  public CustomsInfo declarationStatement(String declarationStatement) {
    
    this.declarationStatement = declarationStatement;
    return this;
  }

   /**
   * Get declarationStatement
   * @return declarationStatement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeclarationStatement() {
    return declarationStatement;
  }


  public void setDeclarationStatement(String declarationStatement) {
    this.declarationStatement = declarationStatement;
  }


  public CustomsInfo freightCharge(BigDecimal freightCharge) {
    
    this.freightCharge = freightCharge;
    return this;
  }

   /**
   * Get freightCharge
   * @return freightCharge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getFreightCharge() {
    return freightCharge;
  }


  public void setFreightCharge(BigDecimal freightCharge) {
    this.freightCharge = freightCharge;
  }


  public CustomsInfo fromCustomsReference(String fromCustomsReference) {
    
    this.fromCustomsReference = fromCustomsReference;
    return this;
  }

   /**
   * Get fromCustomsReference
   * @return fromCustomsReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFromCustomsReference() {
    return fromCustomsReference;
  }


  public void setFromCustomsReference(String fromCustomsReference) {
    this.fromCustomsReference = fromCustomsReference;
  }


  public CustomsInfo handlingCosts(BigDecimal handlingCosts) {
    
    this.handlingCosts = handlingCosts;
    return this;
  }

   /**
   * Get handlingCosts
   * @return handlingCosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getHandlingCosts() {
    return handlingCosts;
  }


  public void setHandlingCosts(BigDecimal handlingCosts) {
    this.handlingCosts = handlingCosts;
  }


  public CustomsInfo importerCustomsReference(String importerCustomsReference) {
    
    this.importerCustomsReference = importerCustomsReference;
    return this;
  }

   /**
   * Get importerCustomsReference
   * @return importerCustomsReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImporterCustomsReference() {
    return importerCustomsReference;
  }


  public void setImporterCustomsReference(String importerCustomsReference) {
    this.importerCustomsReference = importerCustomsReference;
  }


  public CustomsInfo insuredAmount(BigDecimal insuredAmount) {
    
    this.insuredAmount = insuredAmount;
    return this;
  }

   /**
   * Get insuredAmount
   * @return insuredAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getInsuredAmount() {
    return insuredAmount;
  }


  public void setInsuredAmount(BigDecimal insuredAmount) {
    this.insuredAmount = insuredAmount;
  }


  public CustomsInfo insuredNumber(String insuredNumber) {
    
    this.insuredNumber = insuredNumber;
    return this;
  }

   /**
   * Get insuredNumber
   * @return insuredNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInsuredNumber() {
    return insuredNumber;
  }


  public void setInsuredNumber(String insuredNumber) {
    this.insuredNumber = insuredNumber;
  }


  public CustomsInfo invoiceNumber(String invoiceNumber) {
    
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Get invoiceNumber
   * @return invoiceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInvoiceNumber() {
    return invoiceNumber;
  }


  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }


  public CustomsInfo licenseNumber(String licenseNumber) {
    
    this.licenseNumber = licenseNumber;
    return this;
  }

   /**
   * Get licenseNumber
   * @return licenseNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLicenseNumber() {
    return licenseNumber;
  }


  public void setLicenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
  }


  public CustomsInfo otherCharge(BigDecimal otherCharge) {
    
    this.otherCharge = otherCharge;
    return this;
  }

   /**
   * Get otherCharge
   * @return otherCharge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getOtherCharge() {
    return otherCharge;
  }


  public void setOtherCharge(BigDecimal otherCharge) {
    this.otherCharge = otherCharge;
  }


  public CustomsInfo otherDescription(String otherDescription) {
    
    this.otherDescription = otherDescription;
    return this;
  }

   /**
   * Get otherDescription
   * @return otherDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOtherDescription() {
    return otherDescription;
  }


  public void setOtherDescription(String otherDescription) {
    this.otherDescription = otherDescription;
  }


  public CustomsInfo otherType(OtherTypeEnum otherType) {
    
    this.otherType = otherType;
    return this;
  }

   /**
   * Get otherType
   * @return otherType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OtherTypeEnum getOtherType() {
    return otherType;
  }


  public void setOtherType(OtherTypeEnum otherType) {
    this.otherType = otherType;
  }


  public CustomsInfo packingCosts(BigDecimal packingCosts) {
    
    this.packingCosts = packingCosts;
    return this;
  }

   /**
   * Get packingCosts
   * @return packingCosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getPackingCosts() {
    return packingCosts;
  }


  public void setPackingCosts(BigDecimal packingCosts) {
    this.packingCosts = packingCosts;
  }


  public CustomsInfo producerSpecification(ProducerSpecificationEnum producerSpecification) {
    
    this.producerSpecification = producerSpecification;
    return this;
  }

   /**
   * Get producerSpecification
   * @return producerSpecification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProducerSpecificationEnum getProducerSpecification() {
    return producerSpecification;
  }


  public void setProducerSpecification(ProducerSpecificationEnum producerSpecification) {
    this.producerSpecification = producerSpecification;
  }


  public CustomsInfo reasonForExport(ReasonForExportEnum reasonForExport) {
    
    this.reasonForExport = reasonForExport;
    return this;
  }

   /**
   * Get reasonForExport
   * @return reasonForExport
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReasonForExportEnum getReasonForExport() {
    return reasonForExport;
  }


  public void setReasonForExport(ReasonForExportEnum reasonForExport) {
    this.reasonForExport = reasonForExport;
  }


  public CustomsInfo reasonForExportExplanation(String reasonForExportExplanation) {
    
    this.reasonForExportExplanation = reasonForExportExplanation;
    return this;
  }

   /**
   * Get reasonForExportExplanation
   * @return reasonForExportExplanation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReasonForExportExplanation() {
    return reasonForExportExplanation;
  }


  public void setReasonForExportExplanation(String reasonForExportExplanation) {
    this.reasonForExportExplanation = reasonForExportExplanation;
  }


  public CustomsInfo sdrValue(BigDecimal sdrValue) {
    
    this.sdrValue = sdrValue;
    return this;
  }

   /**
   * Get sdrValue
   * @return sdrValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getSdrValue() {
    return sdrValue;
  }


  public void setSdrValue(BigDecimal sdrValue) {
    this.sdrValue = sdrValue;
  }


  public CustomsInfo shippingDocumentType(ShippingDocumentTypeEnum shippingDocumentType) {
    
    this.shippingDocumentType = shippingDocumentType;
    return this;
  }

   /**
   * Get shippingDocumentType
   * @return shippingDocumentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ShippingDocumentTypeEnum getShippingDocumentType() {
    return shippingDocumentType;
  }


  public void setShippingDocumentType(ShippingDocumentTypeEnum shippingDocumentType) {
    this.shippingDocumentType = shippingDocumentType;
  }


  public CustomsInfo signatureContact(Address signatureContact) {
    
    this.signatureContact = signatureContact;
    return this;
  }

   /**
   * Get signatureContact
   * @return signatureContact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Address getSignatureContact() {
    return signatureContact;
  }


  public void setSignatureContact(Address signatureContact) {
    this.signatureContact = signatureContact;
  }


  public CustomsInfo termsOfSale(String termsOfSale) {
    
    this.termsOfSale = termsOfSale;
    return this;
  }

   /**
   * Get termsOfSale
   * @return termsOfSale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTermsOfSale() {
    return termsOfSale;
  }


  public void setTermsOfSale(String termsOfSale) {
    this.termsOfSale = termsOfSale;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomsInfo customsInfo = (CustomsInfo) o;
    return Objects.equals(this.EELPFC, customsInfo.EELPFC) &&
        Objects.equals(this.blanketEndDate, customsInfo.blanketEndDate) &&
        Objects.equals(this.blanketStartDate, customsInfo.blanketStartDate) &&
        Objects.equals(this.certificateNumber, customsInfo.certificateNumber) &&
        Objects.equals(this.comments, customsInfo.comments) &&
        Objects.equals(this.currencyCode, customsInfo.currencyCode) &&
        Objects.equals(this.customsDeclaredValue, customsInfo.customsDeclaredValue) &&
        Objects.equals(this.declarationStatement, customsInfo.declarationStatement) &&
        Objects.equals(this.freightCharge, customsInfo.freightCharge) &&
        Objects.equals(this.fromCustomsReference, customsInfo.fromCustomsReference) &&
        Objects.equals(this.handlingCosts, customsInfo.handlingCosts) &&
        Objects.equals(this.importerCustomsReference, customsInfo.importerCustomsReference) &&
        Objects.equals(this.insuredAmount, customsInfo.insuredAmount) &&
        Objects.equals(this.insuredNumber, customsInfo.insuredNumber) &&
        Objects.equals(this.invoiceNumber, customsInfo.invoiceNumber) &&
        Objects.equals(this.licenseNumber, customsInfo.licenseNumber) &&
        Objects.equals(this.otherCharge, customsInfo.otherCharge) &&
        Objects.equals(this.otherDescription, customsInfo.otherDescription) &&
        Objects.equals(this.otherType, customsInfo.otherType) &&
        Objects.equals(this.packingCosts, customsInfo.packingCosts) &&
        Objects.equals(this.producerSpecification, customsInfo.producerSpecification) &&
        Objects.equals(this.reasonForExport, customsInfo.reasonForExport) &&
        Objects.equals(this.reasonForExportExplanation, customsInfo.reasonForExportExplanation) &&
        Objects.equals(this.sdrValue, customsInfo.sdrValue) &&
        Objects.equals(this.shippingDocumentType, customsInfo.shippingDocumentType) &&
        Objects.equals(this.signatureContact, customsInfo.signatureContact) &&
        Objects.equals(this.termsOfSale, customsInfo.termsOfSale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(EELPFC, blanketEndDate, blanketStartDate, certificateNumber, comments, currencyCode, customsDeclaredValue, declarationStatement, freightCharge, fromCustomsReference, handlingCosts, importerCustomsReference, insuredAmount, insuredNumber, invoiceNumber, licenseNumber, otherCharge, otherDescription, otherType, packingCosts, producerSpecification, reasonForExport, reasonForExportExplanation, sdrValue, shippingDocumentType, signatureContact, termsOfSale);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomsInfo {\n");
    sb.append("    EELPFC: ").append(toIndentedString(EELPFC)).append("\n");
    sb.append("    blanketEndDate: ").append(toIndentedString(blanketEndDate)).append("\n");
    sb.append("    blanketStartDate: ").append(toIndentedString(blanketStartDate)).append("\n");
    sb.append("    certificateNumber: ").append(toIndentedString(certificateNumber)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    customsDeclaredValue: ").append(toIndentedString(customsDeclaredValue)).append("\n");
    sb.append("    declarationStatement: ").append(toIndentedString(declarationStatement)).append("\n");
    sb.append("    freightCharge: ").append(toIndentedString(freightCharge)).append("\n");
    sb.append("    fromCustomsReference: ").append(toIndentedString(fromCustomsReference)).append("\n");
    sb.append("    handlingCosts: ").append(toIndentedString(handlingCosts)).append("\n");
    sb.append("    importerCustomsReference: ").append(toIndentedString(importerCustomsReference)).append("\n");
    sb.append("    insuredAmount: ").append(toIndentedString(insuredAmount)).append("\n");
    sb.append("    insuredNumber: ").append(toIndentedString(insuredNumber)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    licenseNumber: ").append(toIndentedString(licenseNumber)).append("\n");
    sb.append("    otherCharge: ").append(toIndentedString(otherCharge)).append("\n");
    sb.append("    otherDescription: ").append(toIndentedString(otherDescription)).append("\n");
    sb.append("    otherType: ").append(toIndentedString(otherType)).append("\n");
    sb.append("    packingCosts: ").append(toIndentedString(packingCosts)).append("\n");
    sb.append("    producerSpecification: ").append(toIndentedString(producerSpecification)).append("\n");
    sb.append("    reasonForExport: ").append(toIndentedString(reasonForExport)).append("\n");
    sb.append("    reasonForExportExplanation: ").append(toIndentedString(reasonForExportExplanation)).append("\n");
    sb.append("    sdrValue: ").append(toIndentedString(sdrValue)).append("\n");
    sb.append("    shippingDocumentType: ").append(toIndentedString(shippingDocumentType)).append("\n");
    sb.append("    signatureContact: ").append(toIndentedString(signatureContact)).append("\n");
    sb.append("    termsOfSale: ").append(toIndentedString(termsOfSale)).append("\n");
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

