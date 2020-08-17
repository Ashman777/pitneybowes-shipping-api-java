# RateParcelsApi

All URIs are relative to *https://api-sandbox.pitneybowes.com/shippingservices*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rateParcel**](RateParcelsApi.md#rateParcel) | **POST** /v1/rates | Use this operation to rate a parcel before you print and purchase a shipment label. You can rate a parcel for multiple services and multiple parcel types with a single API request.


<a name="rateParcel"></a>
# **rateParcel**
> Shipment rateParcel(shipment, xPBUnifiedErrorStructure, xPBShipperRatePlan, xPBIntegratorCarrierId, xPBShipperCarrierAccountId, includeDeliveryCommitment, carrier)

Use this operation to rate a parcel before you print and purchase a shipment label. You can rate a parcel for multiple services and multiple parcel types with a single API request.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RateParcelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.pitneybowes.com/shippingservices");
    
    // Configure OAuth2 access token for authorization: oAuth2ClientCredentials
    OAuth oAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("oAuth2ClientCredentials");
    oAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    RateParcelsApi apiInstance = new RateParcelsApi(defaultClient);
    Shipment shipment = {"fromAddress":{"company":"Supplier","name":"J. Smith","phone":"303-555-1213","email":"js@example.com","residential":false,"addressLines":["4750 Walnut Street"],"cityTown":"Boulder","stateProvince":"CO","postalCode":"80301","countryCode":"US"},"toAddress":{"company":"Shop","name":"J. Jones","phone":"203-000-1234","email":"jjones@example.com","residential":false,"addressLines":["771 Orange St"],"cityTown":"New Haven","stateProvince":"CT","postalCode":"06511","countryCode":"US"},"parcel":{"weight":{"weight":1,"unitOfMeasurement":"OZ"},"dimension":{"length":5,"width":0.25,"height":4,"unitOfMeasurement":"IN","irregularParcelGirth":1}},"rates":[{"carrier":"USPS","parcelType":"PKG","inductionPostalCode":"06484"}]}; // Shipment | Shipment request for Rates
    Boolean xPBUnifiedErrorStructure = true; // Boolean | Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs.
    String xPBShipperRatePlan = "xPBShipperRatePlan_example"; // String | USPS Only. Shipper rate plan, if applicable. For more information, see [this FAQ](https://shipping.pitneybowes.com/faqs/rates.html#rate-plans-faq)
    String xPBIntegratorCarrierId = "xPBIntegratorCarrierId_example"; // String | USPS Only. Negotiated services rate, if applicable.
    String xPBShipperCarrierAccountId = "xPBShipperCarrierAccountId_example"; // String | UPS (United Parcel Service) Only. The unique identifier returned in the shipperCarrierAccountId field by the [Register an Existing Carrier Account](https://shipping.pitneybowes.com/api/post-carrier-accounts-register.html) API.
    Boolean includeDeliveryCommitment = true; // Boolean | When set to true, returns estimated transit time in days.
    String carrier = "carrier_example"; // String | Cross-Border only. Required for PB Cross-Border. Set this to PBI.
    try {
      Shipment result = apiInstance.rateParcel(shipment, xPBUnifiedErrorStructure, xPBShipperRatePlan, xPBIntegratorCarrierId, xPBShipperCarrierAccountId, includeDeliveryCommitment, carrier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RateParcelsApi#rateParcel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipment** | [**Shipment**](Shipment.md)| Shipment request for Rates |
 **xPBUnifiedErrorStructure** | **Boolean**| Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. | [optional] [default to true]
 **xPBShipperRatePlan** | **String**| USPS Only. Shipper rate plan, if applicable. For more information, see [this FAQ](https://shipping.pitneybowes.com/faqs/rates.html#rate-plans-faq) | [optional]
 **xPBIntegratorCarrierId** | **String**| USPS Only. Negotiated services rate, if applicable. | [optional]
 **xPBShipperCarrierAccountId** | **String**| UPS (United Parcel Service) Only. The unique identifier returned in the shipperCarrierAccountId field by the [Register an Existing Carrier Account](https://shipping.pitneybowes.com/api/post-carrier-accounts-register.html) API. | [optional]
 **includeDeliveryCommitment** | **Boolean**| When set to true, returns estimated transit time in days. | [optional]
 **carrier** | **String**| Cross-Border only. Required for PB Cross-Border. Set this to PBI. | [optional]

### Return type

[**Shipment**](Shipment.md)

### Authorization

[oAuth2ClientCredentials](../README.md#oAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**0** | Error |  -  |

