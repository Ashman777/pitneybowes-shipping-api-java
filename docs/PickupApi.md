# PickupApi

All URIs are relative to *https://api-sandbox.pitneybowes.com/shippingservices*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelPickup**](PickupApi.md#cancelPickup) | **POST** /v1/pickups/{pickupId}/cancel | Cancel Pickup
[**getPickupschedule**](PickupApi.md#getPickupschedule) | **POST** /v1/pickups/schedule | Address validation


<a name="cancelPickup"></a>
# **cancelPickup**
> InlineResponse2001 cancelPickup(xPBTransactionId, pickupId, xPBUnifiedErrorStructure)

Cancel Pickup

This operation schedules a USPS package pickup from a residential or commercial location and provides a pickup confirmation number.

### Example
```java
// Import classes:
import org.pitneybowes.shippingapi.ApiClient;
import org.pitneybowes.shippingapi.ApiException;
import org.pitneybowes.shippingapi.Configuration;
import org.pitneybowes.shippingapi.auth.*;
import org.pitneybowes.shippingapi.models.*;
import org.pitneybowes.shippingapi.api.PickupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.pitneybowes.com/shippingservices");
    
    // Configure OAuth2 access token for authorization: oAuth2ClientCredentials
    OAuth oAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("oAuth2ClientCredentials");
    oAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    PickupApi apiInstance = new PickupApi(defaultClient);
    String xPBTransactionId = "xPBTransactionId_example"; // String | A unique identifier for the transaction, up to 25 characters
    String pickupId = "pickupId_example"; // String | A unique identifier for the transaction, up to 25 characters
    Boolean xPBUnifiedErrorStructure = true; // Boolean | Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs.
    try {
      InlineResponse2001 result = apiInstance.cancelPickup(xPBTransactionId, pickupId, xPBUnifiedErrorStructure);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickupApi#cancelPickup");
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
 **xPBTransactionId** | **String**| A unique identifier for the transaction, up to 25 characters |
 **pickupId** | **String**| A unique identifier for the transaction, up to 25 characters |
 **xPBUnifiedErrorStructure** | **Boolean**| Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. | [optional] [default to true]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[oAuth2ClientCredentials](../README.md#oAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getPickupschedule"></a>
# **getPickupschedule**
> SchedulePickupResponse getPickupschedule(xPBTransactionId, schedulePickup, xPBUnifiedErrorStructure)

Address validation

This operation schedules a USPS package pickup from a residential or commercial location and provides a pickup confirmation number.

### Example
```java
// Import classes:
import org.pitneybowes.shippingapi.ApiClient;
import org.pitneybowes.shippingapi.ApiException;
import org.pitneybowes.shippingapi.Configuration;
import org.pitneybowes.shippingapi.auth.*;
import org.pitneybowes.shippingapi.models.*;
import org.pitneybowes.shippingapi.api.PickupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.pitneybowes.com/shippingservices");
    
    // Configure OAuth2 access token for authorization: oAuth2ClientCredentials
    OAuth oAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("oAuth2ClientCredentials");
    oAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    PickupApi apiInstance = new PickupApi(defaultClient);
    String xPBTransactionId = "xPBTransactionId_example"; // String | A unique identifier for the transaction, up to 25 characters
    SchedulePickup schedulePickup = new SchedulePickup(); // SchedulePickup | Schedule Pickup request.
    Boolean xPBUnifiedErrorStructure = true; // Boolean | Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs.
    try {
      SchedulePickupResponse result = apiInstance.getPickupschedule(xPBTransactionId, schedulePickup, xPBUnifiedErrorStructure);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickupApi#getPickupschedule");
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
 **xPBTransactionId** | **String**| A unique identifier for the transaction, up to 25 characters |
 **schedulePickup** | [**SchedulePickup**](SchedulePickup.md)| Schedule Pickup request. |
 **xPBUnifiedErrorStructure** | **Boolean**| Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. | [optional] [default to true]

### Return type

[**SchedulePickupResponse**](SchedulePickupResponse.md)

### Authorization

[oAuth2ClientCredentials](../README.md#oAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**405** | Invalid input |  -  |

