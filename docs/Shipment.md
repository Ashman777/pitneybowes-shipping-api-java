

# Shipment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalAddresses** | [**List&lt;AdditionalAddress&gt;**](AdditionalAddress.md) |  |  [optional]
**altReturnAddress** | [**Address**](Address.md) |  |  [optional]
**carrierPayments** | [**List&lt;CarrierPayment&gt;**](CarrierPayment.md) |  |  [optional]
**customs** | [**Customs**](Customs.md) |  |  [optional]
**documents** | [**List&lt;Document&gt;**](Document.md) |  |  [optional]
**fromAddress** | [**Address**](Address.md) |  | 
**hazmatDetails** | [**HazmatDetails**](HazmatDetails.md) |  |  [optional]
**parcel** | [**Parcel**](Parcel.md) |  | 
**parcelTrackingNumber** | **String** |  |  [optional]
**rates** | [**List&lt;Rate&gt;**](Rate.md) |  | 
**references** | [**List&lt;Parameter&gt;**](Parameter.md) |  |  [optional]
**shipmentId** | **String** |  |  [optional]
**shipmentOptions** | [**List&lt;Parameter&gt;**](Parameter.md) |  |  [optional]
**shipmentType** | [**ShipmentTypeEnum**](#ShipmentTypeEnum) |  |  [optional]
**soldToAddress** | [**Address**](Address.md) |  |  [optional]
**toAddress** | [**Address**](Address.md) |  | 



## Enum: ShipmentTypeEnum

Name | Value
---- | -----
OUTBOUND | &quot;OUTBOUND&quot;
RETURN | &quot;RETURN&quot;



