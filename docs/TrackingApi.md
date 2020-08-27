# TrackingApi

All URIs are relative to *https://api-sandbox.pitneybowes.com/shippingservices*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTrackingEvents**](TrackingApi.md#addTrackingEvents) | **POST** /v2/track/events | getTrackingDetails
[**getTrackingDetails**](TrackingApi.md#getTrackingDetails) | **GET** /v1/tracking/{trackingNumber} | getTrackingDetails


<a name="addTrackingEvents"></a>
# **addTrackingEvents**
> InlineResponse2002 addTrackingEvents(addTrackingEvents, xPBUnifiedErrorStructure)

getTrackingDetails

### Example
```java
// Import classes:
import PitneyBowes.Developer.ApiClient;
import PitneyBowes.Developer.ApiException;
import PitneyBowes.Developer.Configuration;
import PitneyBowes.Developer.auth.*;
import PitneyBowes.Developer.models.*;
import PitneyBowes.Developer.ShippingApi.TrackingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.pitneybowes.com/shippingservices");
    
    // Configure OAuth2 access token for authorization: oAuth2ClientCredentials
    OAuth oAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("oAuth2ClientCredentials");
    oAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    TrackingApi apiInstance = new TrackingApi(defaultClient);
    AddTrackingEvents addTrackingEvents = {"carrier":"NEWGISTICS","references":[{"referenceType":"package","referenceValue":"1Z00","events":[{"eventCode":"DPB","carrierEventCode":"DOAC","eventDate":"2020-04-18","eventTime":"12:48:10","eventTimeOffset":"-06:00","eventCity":"Decatur","eventStateOrProvince":"IL","postalCode":"62521","country":"US"}]},{"referenceType":"package","referenceValue":"3Z30","events":[{"eventCode":"DPB","carrierEventCode":"DOAC","eventDate":"2020-04-18","eventTime":"12:50:00","eventTimeOffset":"-06:00","eventCity":"Decatur","eventStateOrProvince":"IL","postalCode":"62521","country":"US"}]}]}; // AddTrackingEvents | add track event
    Boolean xPBUnifiedErrorStructure = true; // Boolean | Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs.
    try {
      InlineResponse2002 result = apiInstance.addTrackingEvents(addTrackingEvents, xPBUnifiedErrorStructure);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackingApi#addTrackingEvents");
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
 **addTrackingEvents** | [**AddTrackingEvents**](AddTrackingEvents.md)| add track event |
 **xPBUnifiedErrorStructure** | **Boolean**| Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. | [optional] [default to true]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[oAuth2ClientCredentials](../README.md#oAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Error |  -  |
**0** | Error |  -  |

<a name="getTrackingDetails"></a>
# **getTrackingDetails**
> TrackingResponse getTrackingDetails(trackingNumber, packageIdentifierType, carrier, xPBUnifiedErrorStructure)

getTrackingDetails

### Example
```java
// Import classes:
import PitneyBowes.Developer.ApiClient;
import PitneyBowes.Developer.ApiException;
import PitneyBowes.Developer.Configuration;
import PitneyBowes.Developer.auth.*;
import PitneyBowes.Developer.models.*;
import PitneyBowes.Developer.ShippingApi.TrackingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.pitneybowes.com/shippingservices");
    
    // Configure OAuth2 access token for authorization: oAuth2ClientCredentials
    OAuth oAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("oAuth2ClientCredentials");
    oAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    TrackingApi apiInstance = new TrackingApi(defaultClient);
    String trackingNumber = "trackingNumber_example"; // String | The tracking number for the shipment.
    String packageIdentifierType = "\"TrackingNumber\""; // String | packageIdentifierType
    String carrier = "carrier_example"; // String | carrier
    Boolean xPBUnifiedErrorStructure = true; // Boolean | Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs.
    try {
      TrackingResponse result = apiInstance.getTrackingDetails(trackingNumber, packageIdentifierType, carrier, xPBUnifiedErrorStructure);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackingApi#getTrackingDetails");
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
 **trackingNumber** | **String**| The tracking number for the shipment. |
 **packageIdentifierType** | **String**| packageIdentifierType | [default to &quot;TrackingNumber&quot;]
 **carrier** | **String**| carrier | [enum: USPS, IMB, UPS, PBI, FedEx, NEWGISTICS, FDR]
 **xPBUnifiedErrorStructure** | **Boolean**| Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. | [optional] [default to true]

### Return type

[**TrackingResponse**](TrackingResponse.md)

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

