# shippingapi

Shipping API
- API version: 1.0.0
  - Build date: 2020-09-10T01:37:26.222+05:30[Asia/Calcutta]

Shipping API Sample.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.pitneybowes</groupId>
  <artifactId>shippingapi</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.pitneybowes:shippingapi:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/shippingapi-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.pitneybowes.shippingapi.ApiClient;
import org.pitneybowes.shippingapi.ApiException;
import org.pitneybowes.shippingapi.Configuration;
import org.pitneybowes.shippingapi.auth.*;
import org.pitneybowes.shippingapi.models.*;
import org.pitneybowes.shippingapi.api.AddressValidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.pitneybowes.com/shippingservices");
    
    // Configure OAuth2 access token for authorization: oAuth2ClientCredentials
    OAuth oAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("oAuth2ClientCredentials");
    oAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    AddressValidationApi apiInstance = new AddressValidationApi(defaultClient);
    Address address = new Address(); // Address | Address object that needs to be validated.
    Boolean xPBUnifiedErrorStructure = true; // Boolean | Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs.
    Boolean minimalAddressValidation = true; // Boolean | When set to true, the complete address (delivery line and last line) is validated but only the last line (city, state, and postal code) would be changed by the validation check.
    try {
      Address result = apiInstance.verifyAddress(address, xPBUnifiedErrorStructure, minimalAddressValidation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressValidationApi#verifyAddress");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api-sandbox.pitneybowes.com/shippingservices*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AddressValidationApi* | [**verifyAddress**](docs/AddressValidationApi.md#verifyAddress) | **POST** /v1/addresses/verify | Address validation
*AddressValidationApi* | [**verifyAndSuggestAddress**](docs/AddressValidationApi.md#verifyAndSuggestAddress) | **POST** /v1/addresses/verify-suggest | Address Suggestion
*CarrierInfoApi* | [**getCarrierFacilities**](docs/CarrierInfoApi.md#getCarrierFacilities) | **POST** /v1/carrier-facility | Find Carrier Facilities
*CarrierInfoApi* | [**getCarrierLicenseAgreement**](docs/CarrierInfoApi.md#getCarrierLicenseAgreement) | **GET** /v1/carrier/license-agreements | This operation retrieves a carrier&#39;s license agreement.
*CarrierInfoApi* | [**getCarrierServiceRules**](docs/CarrierInfoApi.md#getCarrierServiceRules) | **GET** /v1/information/rules/rating-services | Retrieves the rules governing the carrier&#39;s services.
*CarrierInfoApi* | [**getCarrierSupportedDestination**](docs/CarrierInfoApi.md#getCarrierSupportedDestination) | **GET** /v1/countries | This operation returns a list of supported destination countries to which the carrier offers international shipping services.
*ContainerApi* | [**getContainerizedParcelsLabels**](docs/ContainerApi.md#getContainerizedParcelsLabels) | **POST** /v1/container-manifest | Create Container Manifest Label
*CrossBorderQuotesApi* | [**getCrossBorderQuotes**](docs/CrossBorderQuotesApi.md#getCrossBorderQuotes) | **POST** /v1/crossborder/checkout/quotes | Cross-Border Quotes
*CrossBorderQuotesApi* | [**predictedHSCode**](docs/CrossBorderQuotesApi.md#predictedHSCode) | **POST** /v1/crossborder/hs-classification/items | Predicts the HS Code for a parcel
*ManifestsApi* | [**createManifest**](docs/ManifestsApi.md#createManifest) | **POST** /v1/manifests | This operation creates an end-of-day manifest
*ManifestsApi* | [**reprintManifest**](docs/ManifestsApi.md#reprintManifest) | **GET** /v1/manifests/{manifestId} | reprintManifest
*ManifestsApi* | [**retryManifest**](docs/ManifestsApi.md#retryManifest) | **GET** /v1/manifests | retryManifest
*ParcelProtectionApi* | [**cancelParcelProtection**](docs/ParcelProtectionApi.md#cancelParcelProtection) | **POST** /v1/parcel-protection/void | Parcel Protection Coverage
*ParcelProtectionApi* | [**getParcelProtectionCoverage**](docs/ParcelProtectionApi.md#getParcelProtectionCoverage) | **POST** /v1/parcel-protection/create | Parcel Protection Coverage
*ParcelProtectionApi* | [**getParcelProtectionQuote**](docs/ParcelProtectionApi.md#getParcelProtectionQuote) | **POST** /v1/parcel-protection/quote | Parcel Protection Quote
*ParcelProtectionApi* | [**getParcelProtectionReports**](docs/ParcelProtectionApi.md#getParcelProtectionReports) | **GET** /v1/parcel-protection/{developerId}/policies | Parcel Protection Reports
*PickupApi* | [**cancelPickup**](docs/PickupApi.md#cancelPickup) | **POST** /v1/pickups/{pickupId}/cancel | Cancel Pickup
*PickupApi* | [**getPickupschedule**](docs/PickupApi.md#getPickupschedule) | **POST** /v1/pickups/schedule | Address validation
*RateParcelsApi* | [**rateParcel**](docs/RateParcelsApi.md#rateParcel) | **POST** /v1/rates | Use this operation to rate a parcel before you print and purchase a shipment label. You can rate a parcel for multiple services and multiple parcel types with a single API request.
*ShipmentApi* | [**cancelShipment**](docs/ShipmentApi.md#cancelShipment) | **DELETE** /v1/shipments/{shipmentId} | cancelShipment
*ShipmentApi* | [**createShipmentLabel**](docs/ShipmentApi.md#createShipmentLabel) | **POST** /v1/shipments | This operation creates a shipment and purchases a shipment label.
*ShipmentApi* | [**reprintShipment**](docs/ShipmentApi.md#reprintShipment) | **GET** /v1/shipments/{shipmentId} | reprintShipment
*ShipmentApi* | [**retryShipment**](docs/ShipmentApi.md#retryShipment) | **GET** /v1/shipments | retryShipment
*TrackingApi* | [**addTrackingEvents**](docs/TrackingApi.md#addTrackingEvents) | **POST** /v2/track/events | getTrackingDetails
*TrackingApi* | [**getTrackingDetails**](docs/TrackingApi.md#getTrackingDetails) | **GET** /v1/tracking/{trackingNumber} | getTrackingDetails
*TransactionReportsApi* | [**getTransactionReport**](docs/TransactionReportsApi.md#getTransactionReport) | **GET** /v4/ledger/developers/{developerId}/transactions/reports | This operation retrieves all transactions for a specified period of time.


## Documentation for Models

 - [AddTrackingEvents](docs/AddTrackingEvents.md)
 - [AddTrackingEventsEvents](docs/AddTrackingEventsEvents.md)
 - [AddTrackingEventsReferences](docs/AddTrackingEventsReferences.md)
 - [AdditionalAddress](docs/AdditionalAddress.md)
 - [Address](docs/Address.md)
 - [AddressSuggestionResponse](docs/AddressSuggestionResponse.md)
 - [AddressSuggestionResponseSuggestions](docs/AddressSuggestionResponseSuggestions.md)
 - [AddressVerifySuggest](docs/AddressVerifySuggest.md)
 - [BatteryDetails](docs/BatteryDetails.md)
 - [CancelShipment](docs/CancelShipment.md)
 - [Carrier](docs/Carrier.md)
 - [CarrierFacilityRequest](docs/CarrierFacilityRequest.md)
 - [CarrierFacilityRequestAddress](docs/CarrierFacilityRequestAddress.md)
 - [CarrierFacilityResponse](docs/CarrierFacilityResponse.md)
 - [CarrierFacilityResponseCarrierFacilityOptions](docs/CarrierFacilityResponseCarrierFacilityOptions.md)
 - [CarrierFacilityResponseCarrierFacilitySuggestions](docs/CarrierFacilityResponseCarrierFacilitySuggestions.md)
 - [CarrierFacilityResponseFacilityHours](docs/CarrierFacilityResponseFacilityHours.md)
 - [CarrierFacilityResponseFacilityTimings](docs/CarrierFacilityResponseFacilityTimings.md)
 - [CarrierPayment](docs/CarrierPayment.md)
 - [CarrierRule](docs/CarrierRule.md)
 - [CommodityInfo](docs/CommodityInfo.md)
 - [ContainerDetails](docs/ContainerDetails.md)
 - [ContainerManifestResponse](docs/ContainerManifestResponse.md)
 - [ContainerManifestResponseData](docs/ContainerManifestResponseData.md)
 - [CrossBorderQuotesErrors](docs/CrossBorderQuotesErrors.md)
 - [CrossBorderQuotesErrorsErrors](docs/CrossBorderQuotesErrorsErrors.md)
 - [CrossBorderQuotesErrorsErrorsErrors](docs/CrossBorderQuotesErrorsErrorsErrors.md)
 - [CrossBorderQuotesErrorsQuote](docs/CrossBorderQuotesErrorsQuote.md)
 - [CrossBorderQuotesErrorsQuoteLines](docs/CrossBorderQuotesErrorsQuoteLines.md)
 - [CrossBorderQuotesErrorsUnitErrors](docs/CrossBorderQuotesErrorsUnitErrors.md)
 - [CrossBorderQuotesRequest](docs/CrossBorderQuotesRequest.md)
 - [CrossBorderQuotesRequestAttributes](docs/CrossBorderQuotesRequestAttributes.md)
 - [CrossBorderQuotesRequestBasketItems](docs/CrossBorderQuotesRequestBasketItems.md)
 - [CrossBorderQuotesRequestCategories](docs/CrossBorderQuotesRequestCategories.md)
 - [CrossBorderQuotesRequestDescriptions](docs/CrossBorderQuotesRequestDescriptions.md)
 - [CrossBorderQuotesRequestIdentifiers](docs/CrossBorderQuotesRequestIdentifiers.md)
 - [CrossBorderQuotesRequestItemDimension](docs/CrossBorderQuotesRequestItemDimension.md)
 - [CrossBorderQuotesRequestPricing](docs/CrossBorderQuotesRequestPricing.md)
 - [CrossBorderQuotesRequestPricingCodPrice](docs/CrossBorderQuotesRequestPricingCodPrice.md)
 - [CrossBorderQuotesRequestRates](docs/CrossBorderQuotesRequestRates.md)
 - [CrossBorderQuotesRequestUnitWeight](docs/CrossBorderQuotesRequestUnitWeight.md)
 - [CrossBorderQuotesResponse](docs/CrossBorderQuotesResponse.md)
 - [CrossBorderQuotesResponseLineRates](docs/CrossBorderQuotesResponseLineRates.md)
 - [CrossBorderQuotesResponseQuote](docs/CrossBorderQuotesResponseQuote.md)
 - [CrossBorderQuotesResponseQuoteLines](docs/CrossBorderQuotesResponseQuoteLines.md)
 - [CrossBorderQuotesResponseTotalRates](docs/CrossBorderQuotesResponseTotalRates.md)
 - [CrossBorderQuotesResponseUnitRates](docs/CrossBorderQuotesResponseUnitRates.md)
 - [CrossBorderQuotesResponseUnitRatesDeliveryCommitment](docs/CrossBorderQuotesResponseUnitRatesDeliveryCommitment.md)
 - [Customs](docs/Customs.md)
 - [CustomsInfo](docs/CustomsInfo.md)
 - [CustomsItem](docs/CustomsItem.md)
 - [DeliveryCommitment](docs/DeliveryCommitment.md)
 - [DimensionRules](docs/DimensionRules.md)
 - [DimensionRulesMaxParcelDimensions](docs/DimensionRulesMaxParcelDimensions.md)
 - [DimensionRulesMinParcelDimensions](docs/DimensionRulesMinParcelDimensions.md)
 - [Discount](docs/Discount.md)
 - [DocTabItem](docs/DocTabItem.md)
 - [Document](docs/Document.md)
 - [DocumentPage](docs/DocumentPage.md)
 - [Errors](docs/Errors.md)
 - [HazmatDetails](docs/HazmatDetails.md)
 - [ISOCountryCode](docs/ISOCountryCode.md)
 - [InfectiousSubstanceContact](docs/InfectiousSubstanceContact.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [Manifest](docs/Manifest.md)
 - [PageRealTransactionDetailReport](docs/PageRealTransactionDetailReport.md)
 - [Parameter](docs/Parameter.md)
 - [Parcel](docs/Parcel.md)
 - [ParcelDimension](docs/ParcelDimension.md)
 - [ParcelProtectionCreateRequest](docs/ParcelProtectionCreateRequest.md)
 - [ParcelProtectionCreateRequestShipmentInfo](docs/ParcelProtectionCreateRequestShipmentInfo.md)
 - [ParcelProtectionCreateRequestShipmentInfoConsigneeInfo](docs/ParcelProtectionCreateRequestShipmentInfoConsigneeInfo.md)
 - [ParcelProtectionCreateRequestShipmentInfoParcelInfo](docs/ParcelProtectionCreateRequestShipmentInfoParcelInfo.md)
 - [ParcelProtectionCreateRequestShipmentInfoParcelInfoCommodityList](docs/ParcelProtectionCreateRequestShipmentInfoParcelInfoCommodityList.md)
 - [ParcelProtectionCreateRequestShipmentInfoShipperInfo](docs/ParcelProtectionCreateRequestShipmentInfoShipperInfo.md)
 - [ParcelProtectionCreateRequestShipmentInfoShipperInfoAddress](docs/ParcelProtectionCreateRequestShipmentInfoShipperInfoAddress.md)
 - [ParcelProtectionCreateResponse](docs/ParcelProtectionCreateResponse.md)
 - [ParcelProtectionCreateResponseParcelProtectionFeesBreakup](docs/ParcelProtectionCreateResponseParcelProtectionFeesBreakup.md)
 - [ParcelProtectionPolicyResponse](docs/ParcelProtectionPolicyResponse.md)
 - [ParcelProtectionPolicyResponseContent](docs/ParcelProtectionPolicyResponseContent.md)
 - [ParcelProtectionPolicyResponsePolicyDetails](docs/ParcelProtectionPolicyResponsePolicyDetails.md)
 - [ParcelProtectionPolicyResponseShipmentDetails](docs/ParcelProtectionPolicyResponseShipmentDetails.md)
 - [ParcelProtectionPolicyResponseShipperInfo](docs/ParcelProtectionPolicyResponseShipperInfo.md)
 - [ParcelProtectionPolicyResponseShipperInfoAddress](docs/ParcelProtectionPolicyResponseShipperInfoAddress.md)
 - [ParcelProtectionPolicyResponseSort](docs/ParcelProtectionPolicyResponseSort.md)
 - [ParcelProtectionQuoteRequest](docs/ParcelProtectionQuoteRequest.md)
 - [ParcelProtectionQuoteRequestShipmentInfo](docs/ParcelProtectionQuoteRequestShipmentInfo.md)
 - [ParcelProtectionQuoteRequestShipmentInfoConsigneeInfo](docs/ParcelProtectionQuoteRequestShipmentInfoConsigneeInfo.md)
 - [ParcelProtectionQuoteRequestShipmentInfoParcelInfo](docs/ParcelProtectionQuoteRequestShipmentInfoParcelInfo.md)
 - [ParcelProtectionQuoteRequestShipmentInfoParcelInfoCommodityList](docs/ParcelProtectionQuoteRequestShipmentInfoParcelInfoCommodityList.md)
 - [ParcelProtectionQuoteRequestShipmentInfoShipperInfo](docs/ParcelProtectionQuoteRequestShipmentInfoShipperInfo.md)
 - [ParcelProtectionQuoteRequestShipmentInfoShipperInfoAddress](docs/ParcelProtectionQuoteRequestShipmentInfoShipperInfoAddress.md)
 - [ParcelProtectionQuoteResponse](docs/ParcelProtectionQuoteResponse.md)
 - [ParcelProtectionQuoteResponseParcelProtectionFeesBreakup](docs/ParcelProtectionQuoteResponseParcelProtectionFeesBreakup.md)
 - [ParcelType](docs/ParcelType.md)
 - [ParcelTypeRules](docs/ParcelTypeRules.md)
 - [ParcelWeight](docs/ParcelWeight.md)
 - [PrerequisiteRules](docs/PrerequisiteRules.md)
 - [RadioActiveParcelDimension](docs/RadioActiveParcelDimension.md)
 - [RadioActivityDetail](docs/RadioActivityDetail.md)
 - [RadioNuclideDetail](docs/RadioNuclideDetail.md)
 - [Rate](docs/Rate.md)
 - [RealTransactionDetailReport](docs/RealTransactionDetailReport.md)
 - [SchedulePickup](docs/SchedulePickup.md)
 - [SchedulePickupPickupSummary](docs/SchedulePickupPickupSummary.md)
 - [SchedulePickupResponse](docs/SchedulePickupResponse.md)
 - [SchedulePickupTotalWeight](docs/SchedulePickupTotalWeight.md)
 - [SearchCriteria](docs/SearchCriteria.md)
 - [Services](docs/Services.md)
 - [ServicesParameterRule](docs/ServicesParameterRule.md)
 - [Shipment](docs/Shipment.md)
 - [Signatory](docs/Signatory.md)
 - [SpecialService](docs/SpecialService.md)
 - [SpecialServiceCodes](docs/SpecialServiceCodes.md)
 - [SpecialServicesRule](docs/SpecialServicesRule.md)
 - [Surcharge](docs/Surcharge.md)
 - [Tax](docs/Tax.md)
 - [Trackable](docs/Trackable.md)
 - [TrackingAddress](docs/TrackingAddress.md)
 - [TrackingResponse](docs/TrackingResponse.md)
 - [TrackingResponseScanDetailsList](docs/TrackingResponseScanDetailsList.md)
 - [UnitOfDimension](docs/UnitOfDimension.md)
 - [UnitOfWeight](docs/UnitOfWeight.md)
 - [VoidParcelProtectionRequest](docs/VoidParcelProtectionRequest.md)
 - [VoidParcelProtectionResponse](docs/VoidParcelProtectionResponse.md)
 - [WeightRules](docs/WeightRules.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### oAuth2ClientCredentials

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@pb.com

