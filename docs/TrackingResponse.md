

# TrackingResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**packageCount** | **Integer** |  |  [optional]
**carrier** | **String** |  |  [optional]
**trackingNumber** | **String** |  |  [optional]
**referenceNumber** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**updatedDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**updatedTime** | **String** |  |  [optional]
**shipDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**estimatedDeliveryDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**estimatedDeliveryTime** | **String** |  |  [optional]
**deliveryDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**deliveryTime** | **String** |  |  [optional]
**deliveryLocation** | **String** |  |  [optional]
**deliveryLocationDescription** | **String** |  |  [optional]
**signedBy** | **String** |  |  [optional]
**weight** | **Integer** |  |  [optional]
**weightOUM** | [**WeightOUMEnum**](#WeightOUMEnum) |  |  [optional]
**reattemptDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**reattemptTime** | **String** |  |  [optional]
**destinationAddress** | [**TrackingAddress**](TrackingAddress.md) |  |  [optional]
**senderAddress** | [**TrackingAddress**](TrackingAddress.md) |  |  [optional]
**scanDetailsList** | [**List&lt;TrackingResponseScanDetailsList&gt;**](TrackingResponseScanDetailsList.md) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
IN_TRANSIT | &quot;In Transit&quot;
DELIVERED | &quot;Delivered&quot;
MANIFEST | &quot;Manifest&quot;



## Enum: WeightOUMEnum

Name | Value
---- | -----
LBS | &quot;LBS&quot;
KGS | &quot;KGS&quot;



