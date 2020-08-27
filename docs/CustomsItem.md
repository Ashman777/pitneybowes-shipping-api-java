

# CustomsItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** |  | 
**hSTariffCode** | **String** |  |  [optional]
**netCostMethod** | [**NetCostMethodEnum**](#NetCostMethodEnum) |  |  [optional]
**originCountryCode** | **String** |  | 
**originStateProvince** | **String** |  |  [optional]
**preferenceCriterion** | [**PreferenceCriterionEnum**](#PreferenceCriterionEnum) |  |  [optional]
**producerAddress** | [**Address**](Address.md) |  |  [optional]
**producerDetermination** | [**ProducerDeterminationEnum**](#ProducerDeterminationEnum) |  |  [optional]
**producerId** | **String** |  |  [optional]
**quantity** | **Integer** |  | 
**quantityUOM** | **String** |  |  [optional]
**unitPrice** | [**BigDecimal**](BigDecimal.md) |  | 
**unitWeight** | [**ParcelWeight**](ParcelWeight.md) |  | 



## Enum: NetCostMethodEnum

Name | Value
---- | -----
NO_NET_COST | &quot;NO_NET_COST&quot;
NET_COST | &quot;NET_COST&quot;



## Enum: PreferenceCriterionEnum

Name | Value
---- | -----
A | &quot;A&quot;
B | &quot;B&quot;
C | &quot;C&quot;
D | &quot;D&quot;
E | &quot;E&quot;
F | &quot;F&quot;



## Enum: ProducerDeterminationEnum

Name | Value
---- | -----
NO_1 | &quot;NO_1&quot;
NO_2 | &quot;NO_2&quot;
NO_3 | &quot;NO_3&quot;
PD_YES | &quot;PD_YES&quot;



