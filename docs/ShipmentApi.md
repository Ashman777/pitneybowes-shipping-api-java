# ShipmentApi

All URIs are relative to *https://api-sandbox.pitneybowes.com/shippingservices*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelShipment**](ShipmentApi.md#cancelShipment) | **DELETE** /v1/shipments/{shipmentId} | cancelShipment
[**createShipmentLabel**](ShipmentApi.md#createShipmentLabel) | **POST** /v1/shipments | This operation creates a shipment and purchases a shipment label.
[**reprintShipment**](ShipmentApi.md#reprintShipment) | **GET** /v1/shipments/{shipmentId} | reprintShipment
[**retryShipment**](ShipmentApi.md#retryShipment) | **GET** /v1/shipments | retryShipment


<a name="cancelShipment"></a>
# **cancelShipment**
> CancelShipment cancelShipment(xPBTransactionId, shipmentId, xPBUnifiedErrorStructure, xPBShipperCarrierAccountId, cancelInitiator, carrier)

cancelShipment

### Example
```java
// Import classes:
import PitneyBowes.Developer.ApiClient;
import PitneyBowes.Developer.ApiException;
import PitneyBowes.Developer.Configuration;
import PitneyBowes.Developer.auth.*;
import PitneyBowes.Developer.models.*;
import PitneyBowes.Developer.ShippingApi.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.pitneybowes.com/shippingservices");
    
    // Configure OAuth2 access token for authorization: oAuth2ClientCredentials
    OAuth oAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("oAuth2ClientCredentials");
    oAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    String xPBTransactionId = "xPBTransactionId_example"; // String | Required. A unique identifier for the transaction, up to 25 characters.
    String shipmentId = "shipmentId_example"; // String | shipmentId
    String xPBUnifiedErrorStructure = "\"true\""; // String | Recommended. Set this to true to use the standard error object if an error occurs.
    String xPBShipperCarrierAccountId = "xPBShipperCarrierAccountId_example"; // String | UPS Only. The unique identifier returned in the shipperCarrierAccountId field by the [Register an Existing Carrier Account API.(https://shipping.pitneybowes.com/api/post-carrier-accounts-register.html)
    String cancelInitiator = SHIPPER; // String | Indicates that this refund request is initiated by the shipper. Set this to: SHIPPER
    Carrier carrier = USPS; // Carrier | Conditional. The carrier. This is required if the carrier is not USPS
    try {
      CancelShipment result = apiInstance.cancelShipment(xPBTransactionId, shipmentId, xPBUnifiedErrorStructure, xPBShipperCarrierAccountId, cancelInitiator, carrier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#cancelShipment");
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
 **xPBTransactionId** | **String**| Required. A unique identifier for the transaction, up to 25 characters. |
 **shipmentId** | **String**| shipmentId |
 **xPBUnifiedErrorStructure** | **String**| Recommended. Set this to true to use the standard error object if an error occurs. | [optional] [default to &quot;true&quot;]
 **xPBShipperCarrierAccountId** | **String**| UPS Only. The unique identifier returned in the shipperCarrierAccountId field by the [Register an Existing Carrier Account API.(https://shipping.pitneybowes.com/api/post-carrier-accounts-register.html) | [optional]
 **cancelInitiator** | **String**| Indicates that this refund request is initiated by the shipper. Set this to: SHIPPER | [optional]
 **carrier** | [**Carrier**](.md)| Conditional. The carrier. This is required if the carrier is not USPS | [optional] [default to USPS] [enum: USPS, PBPRESORT, NEWGISTICS, PBI, FEDEX, USP]

### Return type

[**CancelShipment**](CancelShipment.md)

### Authorization

[oAuth2ClientCredentials](../README.md#oAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | OK |  -  |
**0** | Error |  -  |

<a name="createShipmentLabel"></a>
# **createShipmentLabel**
> Shipment createShipmentLabel(xPBTransactionId, shipment, xPBUnifiedErrorStructure, xPBIntegratorCarrierId, xPBShipperRatePlan, xPBShipmentGroupId, xPBShipperCarrierAccountId, includeDeliveryCommitment)

This operation creates a shipment and purchases a shipment label.

The API returns the label as either a Base64 string or a link to a PDF. For more information visit [Create Shipment Documents](https://shipping.pitneybowes.com/api/post-shipments.html). Following are samples of different carriers -  * [Create a USPS (U.S. Postal Service) Label](https://shipping.pitneybowes.com/api/post-shipments-usps.html)  * [Create a USPS PMOD Label](https://shipping.pitneybowes.com/api/post-shipments-pmod.html) * [Create a USPS Scan-Based Return Label](https://shipping.pitneybowes.com/api/post-shipments-returns.html) * [Create a Pure Post Return Label](https://shipping.pitneybowes.com/api/post-shipments-pure-post-return.html) * [Create a Newgistics Label](https://shipping.pitneybowes.com/api/post-shipments-newgistics.html) * [Create a PB Presort Label](https://shipping.pitneybowes.com/api/post-shipments-presort.html) * [Create a PB Cross-Border Shipment](https://shipping.pitneybowes.com/api/post-shipments-cbds.html) * [Create a UPS (United Parcel Service) Label](https://shipping.pitneybowes.com/api/post-shipments-ups.html)

### Example
```java
// Import classes:
import PitneyBowes.Developer.ApiClient;
import PitneyBowes.Developer.ApiException;
import PitneyBowes.Developer.Configuration;
import PitneyBowes.Developer.auth.*;
import PitneyBowes.Developer.models.*;
import PitneyBowes.Developer.ShippingApi.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.pitneybowes.com/shippingservices");
    
    // Configure OAuth2 access token for authorization: oAuth2ClientCredentials
    OAuth oAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("oAuth2ClientCredentials");
    oAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    String xPBTransactionId = uniquevalue; // String | Required. A unique identifier for the transaction, up to 25 characters.
    Shipment shipment = {"fromAddress":{"company":"Pitney Bowes Inc.","name":"Paul Wright","phone":"203-555-1430","email":"john.publica@pb.com","residential":false,"addressLines":["27 Waterview Drive"],"cityTown":"Shelton","stateProvince":"CT","postalCode":"06484","countryCode":"US"},"toAddress":{"company":"ABC Company","name":"Rufous Sirius Canid","phone":"323 555-1212","email":"rs.canid@gmail.com","residential":true,"addressLines":["631 S Main St"],"cityTown":"Greenville","stateProvince":"SC","postalCode":"29601","countryCode":"US"},"parcel":{"weight":{"unitOfMeasurement":"OZ","weight":38},"dimension":{"unitOfMeasurement":"IN","length":6,"width":6,"height":6}},"rates":[{"carrier":"USPS","serviceId":"PM","parcelType":"PKG","specialServices":[{"specialServiceId":"DelCon","inputParameters":[{"name":"INPUT_VALUE","value":"0"}]}],"inductionPostalCode":"06484"}],"documents":[{"type":"SHIPPING_LABEL","contentType":"URL","size":"DOC_4X6","fileFormat":"PDF","printDialogOption":"NO_PRINT_DIALOG"}],"shipmentOptions":[{"name":"SHIPPER_ID","value":"3000090171"},{"name":"ADD_TO_MANIFEST","value":"true"},{"name":"HIDE_TOTAL_CARRIER_CHARGE","value":"true"},{"name":"PRINT_CUSTOM_MESSAGE_1","value":"custom message for label"},{"name":"SHIPPING_LABEL_RECEIPT","value":"NO_OPTIONS"}]}; // Shipment | request
    Boolean xPBUnifiedErrorStructure = true; // Boolean | Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs.
    String xPBIntegratorCarrierId = "xPBIntegratorCarrierId_example"; // String | USPS Only. Negotiated services rate, if applicable.
    String xPBShipperRatePlan = "xPBShipperRatePlan_example"; // String | USPS Only. Shipper rate plan, if applicable. For more information, see [this FAQ](https://shipping.pitneybowes.com/faqs/rates.html#rate-plans-faq).
    String xPBShipmentGroupId = "xPBShipmentGroupId_example"; // String |  **[Required parameter for PBPresort service](https://shipping.pitneybowes.com/api/post-shipments-presort.html)**.The job number that represents the agreement between the merchant and PB Presort. This was provided by Pitney Bowes during [merchant onboarding for PB Presort](https://shipping.pitneybowes.com/carriers/pb-presort.html).
    String xPBShipperCarrierAccountId = "xPBShipperCarrierAccountId_example"; // String | **[Required parameter for PBPresort service](https://shipping.pitneybowes.com/api/post-shipments-presort.html)**. The merchant's Mailer ID (MID), as provided by Pitney Bowes during merchant onboarding for PB Presort.
    String includeDeliveryCommitment = "includeDeliveryCommitment_example"; // String | If set to true, returns estimated transit times in days. Only for USPS Create Shipment. See also [Pitney Bowes Delivery Guarantee](https://shipping.pitneybowes.com/faqs/delivery-guarantee.html) [Do all USPS services return transit times?](https://shipping.pitneybowes.com/faqs/shipments.html#transit-times-faq)
    try {
      Shipment result = apiInstance.createShipmentLabel(xPBTransactionId, shipment, xPBUnifiedErrorStructure, xPBIntegratorCarrierId, xPBShipperRatePlan, xPBShipmentGroupId, xPBShipperCarrierAccountId, includeDeliveryCommitment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#createShipmentLabel");
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
 **xPBTransactionId** | **String**| Required. A unique identifier for the transaction, up to 25 characters. |
 **shipment** | [**Shipment**](Shipment.md)| request |
 **xPBUnifiedErrorStructure** | **Boolean**| Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. | [optional] [default to true]
 **xPBIntegratorCarrierId** | **String**| USPS Only. Negotiated services rate, if applicable. | [optional]
 **xPBShipperRatePlan** | **String**| USPS Only. Shipper rate plan, if applicable. For more information, see [this FAQ](https://shipping.pitneybowes.com/faqs/rates.html#rate-plans-faq). | [optional]
 **xPBShipmentGroupId** | **String**|  **[Required parameter for PBPresort service](https://shipping.pitneybowes.com/api/post-shipments-presort.html)**.The job number that represents the agreement between the merchant and PB Presort. This was provided by Pitney Bowes during [merchant onboarding for PB Presort](https://shipping.pitneybowes.com/carriers/pb-presort.html). | [optional]
 **xPBShipperCarrierAccountId** | **String**| **[Required parameter for PBPresort service](https://shipping.pitneybowes.com/api/post-shipments-presort.html)**. The merchant&#39;s Mailer ID (MID), as provided by Pitney Bowes during merchant onboarding for PB Presort. | [optional]
 **includeDeliveryCommitment** | **String**| If set to true, returns estimated transit times in days. Only for USPS Create Shipment. See also [Pitney Bowes Delivery Guarantee](https://shipping.pitneybowes.com/faqs/delivery-guarantee.html) [Do all USPS services return transit times?](https://shipping.pitneybowes.com/faqs/shipments.html#transit-times-faq) | [optional]

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
**201** | OK |  -  |
**0** | Error |  -  |

<a name="reprintShipment"></a>
# **reprintShipment**
> Shipment reprintShipment(shipmentId, xPBUnifiedErrorStructure, carrier)

reprintShipment

### Example
```java
// Import classes:
import PitneyBowes.Developer.ApiClient;
import PitneyBowes.Developer.ApiException;
import PitneyBowes.Developer.Configuration;
import PitneyBowes.Developer.auth.*;
import PitneyBowes.Developer.models.*;
import PitneyBowes.Developer.ShippingApi.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.pitneybowes.com/shippingservices");
    
    // Configure OAuth2 access token for authorization: oAuth2ClientCredentials
    OAuth oAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("oAuth2ClientCredentials");
    oAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    String shipmentId = "shipmentId_example"; // String | Required. The shipment ID that was issued when shipment label was generated.
    Boolean xPBUnifiedErrorStructure = true; // Boolean | Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs.
    Carrier carrier = USPS; // Carrier | 
    try {
      Shipment result = apiInstance.reprintShipment(shipmentId, xPBUnifiedErrorStructure, carrier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#reprintShipment");
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
 **shipmentId** | **String**| Required. The shipment ID that was issued when shipment label was generated. |
 **xPBUnifiedErrorStructure** | **Boolean**| Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. | [optional] [default to true]
 **carrier** | [**Carrier**](.md)|  | [optional] [default to USPS] [enum: USPS, PBPRESORT, NEWGISTICS, PBI, FEDEX, USP]

### Return type

[**Shipment**](Shipment.md)

### Authorization

[oAuth2ClientCredentials](../README.md#oAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**0** | Error |  -  |

<a name="retryShipment"></a>
# **retryShipment**
> Shipment retryShipment(originalTransactionId, xPBUnifiedErrorStructure, carrier)

retryShipment

### Example
```java
// Import classes:
import PitneyBowes.Developer.ApiClient;
import PitneyBowes.Developer.ApiException;
import PitneyBowes.Developer.Configuration;
import PitneyBowes.Developer.auth.*;
import PitneyBowes.Developer.models.*;
import PitneyBowes.Developer.ShippingApi.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.pitneybowes.com/shippingservices");
    
    // Configure OAuth2 access token for authorization: oAuth2ClientCredentials
    OAuth oAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("oAuth2ClientCredentials");
    oAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    String originalTransactionId = 12344; // String | 
    Boolean xPBUnifiedErrorStructure = true; // Boolean | Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs.
    Carrier carrier = USPS; // Carrier | 
    try {
      Shipment result = apiInstance.retryShipment(originalTransactionId, xPBUnifiedErrorStructure, carrier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#retryShipment");
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
 **originalTransactionId** | **String**|  |
 **xPBUnifiedErrorStructure** | **Boolean**| Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. | [optional] [default to true]
 **carrier** | [**Carrier**](.md)|  | [optional] [default to USPS] [enum: USPS, PBPRESORT, NEWGISTICS, PBI, FEDEX, USP]

### Return type

[**Shipment**](Shipment.md)

### Authorization

[oAuth2ClientCredentials](../README.md#oAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | OK |  -  |
**0** | Error |  -  |

