

# CarrierPayment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountNumber** | **String** |  |  [optional]
**countryCode** | **String** |  |  [optional]
**party** | [**PartyEnum**](#PartyEnum) |  | 
**postalCode** | **String** |  |  [optional]
**typeOfCharge** | [**TypeOfChargeEnum**](#TypeOfChargeEnum) |  | 



## Enum: PartyEnum

Name | Value
---- | -----
RECEIVER | &quot;BILL_RECEIVER&quot;
SENDER | &quot;BILL_SENDER&quot;
THIRD_PARTY | &quot;BILL_THIRD_PARTY&quot;
RECEIVER_CONTRACT | &quot;BILL_RECEIVER_CONTRACT&quot;



## Enum: TypeOfChargeEnum

Name | Value
---- | -----
TRANSPORTATION_CHARGES | &quot;TRANSPORTATION_CHARGES&quot;
DUTIES_AND_TAXES | &quot;DUTIES_AND_TAXES&quot;
ALL_CHARGES | &quot;ALL_CHARGES&quot;



