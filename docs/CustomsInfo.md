

# CustomsInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EELPFC** | **String** |  |  [optional]
**blanketEndDate** | **String** | format: YYYY-MM-DD |  [optional]
**blanketStartDate** | **String** | format: YYYY-MM-DD |  [optional]
**certificateNumber** | **String** |  |  [optional]
**comments** | **String** |  |  [optional]
**currencyCode** | **String** | ISO-4217 | 
**customsDeclaredValue** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**declarationStatement** | **String** |  |  [optional]
**freightCharge** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**fromCustomsReference** | **String** |  |  [optional]
**handlingCosts** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**importerCustomsReference** | **String** |  |  [optional]
**insuredAmount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**insuredNumber** | **String** |  |  [optional]
**invoiceNumber** | **String** |  |  [optional]
**licenseNumber** | **String** |  |  [optional]
**otherCharge** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**otherDescription** | **String** |  |  [optional]
**otherType** | [**OtherTypeEnum**](#OtherTypeEnum) |  |  [optional]
**packingCosts** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**producerSpecification** | [**ProducerSpecificationEnum**](#ProducerSpecificationEnum) |  |  [optional]
**reasonForExport** | [**ReasonForExportEnum**](#ReasonForExportEnum) |  |  [optional]
**reasonForExportExplanation** | **String** |  |  [optional]
**sdrValue** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**shippingDocumentType** | [**ShippingDocumentTypeEnum**](#ShippingDocumentTypeEnum) |  |  [optional]
**signatureContact** | [**Address**](Address.md) |  |  [optional]
**termsOfSale** | **String** |  |  [optional]



## Enum: OtherTypeEnum

Name | Value
---- | -----
COMMISSIONS | &quot;COMMISSIONS&quot;
DISCOUNTS | &quot;DISCOUNTS&quot;
HANDLING_FEES | &quot;HANDLING_FEES&quot;
OTHER | &quot;OTHER&quot;
ROYALTIES_AND_LICENSE_FEES | &quot;ROYALTIES_AND_LICENSE_FEES&quot;
TAXES | &quot;TAXES&quot;



## Enum: ProducerSpecificationEnum

Name | Value
---- | -----
MULTIPLE_SPECIFIED | &quot;MULTIPLE_SPECIFIED&quot;
SAME | &quot;SAME&quot;
SINGLE_SPECIFIED | &quot;SINGLE_SPECIFIED&quot;
UNKNOWN | &quot;UNKNOWN&quot;
AVAILABLE_UPON_REQUEST | &quot;AVAILABLE_UPON_REQUEST&quot;



## Enum: ReasonForExportEnum

Name | Value
---- | -----
GIFT | &quot;GIFT&quot;
COMMERCIAL_SAMPLE | &quot;COMMERCIAL_SAMPLE&quot;
MERCHANDISE | &quot;MERCHANDISE&quot;
DOCUMENTS | &quot;DOCUMENTS&quot;
RETURNED_GOODS | &quot;RETURNED_GOODS&quot;
SOLD | &quot;SOLD&quot;
NOT_SOLD | &quot;NOT_SOLD&quot;
OTHER | &quot;OTHER&quot;
DANGEROUS_GOOD | &quot;DANGEROUS_GOOD&quot;
HUMANITARIAN_GOODS | &quot;HUMANITARIAN_GOODS&quot;



## Enum: ShippingDocumentTypeEnum

Name | Value
---- | -----
NAFTA | &quot;NAFTA&quot;
COO | &quot;COO&quot;



