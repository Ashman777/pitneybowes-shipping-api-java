

# Address

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addressLines** | **List&lt;String&gt;** |  |  [optional]
**carrierRoute** | **String** |  |  [optional]
**cityTown** | **String** |  |  [optional]
**company** | **String** |  |  [optional]
**countryCode** | **String** | 2-character country code (ISO-3166-1 alpha-2) | 
**deliveryPoint** | **String** |  |  [optional]
**email** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**phone** | **String** |  |  [optional]
**postalCode** | **String** |  |  [optional]
**residential** | **Boolean** |  |  [optional]
**stateProvince** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**taxId** | **String** |  |  [optional]
**taxIdType** | [**TaxIdTypeEnum**](#TaxIdTypeEnum) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
PARSED | &quot;PARSED&quot;
VALIDATED_CHANGED | &quot;VALIDATED_CHANGED&quot;
VALIDATED_AND_NOT_CHANGED | &quot;VALIDATED_AND_NOT_CHANGED&quot;
NOT_CHANGED | &quot;NOT_CHANGED&quot;



## Enum: TaxIdTypeEnum

Name | Value
---- | -----
EIN | &quot;EIN&quot;
GST | &quot;GST&quot;
VAT | &quot;VAT&quot;
RFC | &quot;RFC&quot;
EORI | &quot;EORI&quot;



