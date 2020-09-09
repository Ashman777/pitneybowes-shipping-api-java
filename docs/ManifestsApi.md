# ManifestsApi

All URIs are relative to *https://api-sandbox.pitneybowes.com/shippingservices*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createManifest**](ManifestsApi.md#createManifest) | **POST** /v1/manifests | This operation creates an end-of-day manifest
[**reprintManifest**](ManifestsApi.md#reprintManifest) | **GET** /v1/manifests/{manifestId} | reprintManifest
[**retryManifest**](ManifestsApi.md#retryManifest) | **GET** /v1/manifests | retryManifest


<a name="createManifest"></a>
# **createManifest**
> Manifest createManifest(xPBTransactionId, manifest, xPBUnifiedErrorStructure)

This operation creates an end-of-day manifest

This operation creates an end-of-day manifest that either combines all parcels into a single form or electronically closes the day, depending on the carrier. Use the instructions appropriate to the carrier. * Create a [USPS SCAN Form](https://shipping.pitneybowes.com/api/post-manifests-scan.html)  * Create a [Newgistics Closeout](https://shipping.pitneybowes.com/api/post-manifests-newgistics.html) * Create a [PB Presort Pickup Slip](https://shipping.pitneybowes.com/api/post-manifests-presort.html) * Create a [Manifest for PMOD Shipments](https://shipping.pitneybowes.com/api/post-manifests-pmod.html)

### Example
```java
// Import classes:
import org.pitneybowes.shippingapi.ApiClient;
import org.pitneybowes.shippingapi.ApiException;
import org.pitneybowes.shippingapi.Configuration;
import org.pitneybowes.shippingapi.auth.*;
import org.pitneybowes.shippingapi.models.*;
import org.pitneybowes.shippingapi.api.ManifestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.pitneybowes.com/shippingservices");
    
    // Configure OAuth2 access token for authorization: oAuth2ClientCredentials
    OAuth oAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("oAuth2ClientCredentials");
    oAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    ManifestsApi apiInstance = new ManifestsApi(defaultClient);
    String xPBTransactionId = "xPBTransactionId_example"; // String | Required. A unique identifier for the transaction, up to 25 characters.
    Manifest manifest = {"carrier":"usps","parcelTrackingNumbers":["9405509898644518132830"],"submissionDate":"2020-07-08","fromAddress":{"company":"Pitney Bowes Inc.","name":"sender_fname","phone":"2032032033","email":"sender@email.com","residential":true,"addressLines":["27 Waterview Drive"],"cityTown":"Shelton","stateProvince":"CT","postalCode":"06484","countryCode":"US"}}; // Manifest | manifest
    Boolean xPBUnifiedErrorStructure = true; // Boolean | Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs.
    try {
      Manifest result = apiInstance.createManifest(xPBTransactionId, manifest, xPBUnifiedErrorStructure);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManifestsApi#createManifest");
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
 **manifest** | [**Manifest**](Manifest.md)| manifest |
 **xPBUnifiedErrorStructure** | **Boolean**| Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. | [optional] [default to true]

### Return type

[**Manifest**](Manifest.md)

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

<a name="reprintManifest"></a>
# **reprintManifest**
> Manifest reprintManifest(manifestId, xPBUnifiedErrorStructure)

reprintManifest

### Example
```java
// Import classes:
import org.pitneybowes.shippingapi.ApiClient;
import org.pitneybowes.shippingapi.ApiException;
import org.pitneybowes.shippingapi.Configuration;
import org.pitneybowes.shippingapi.auth.*;
import org.pitneybowes.shippingapi.models.*;
import org.pitneybowes.shippingapi.api.ManifestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.pitneybowes.com/shippingservices");
    
    // Configure OAuth2 access token for authorization: oAuth2ClientCredentials
    OAuth oAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("oAuth2ClientCredentials");
    oAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    ManifestsApi apiInstance = new ManifestsApi(defaultClient);
    String manifestId = "manifestId_example"; // String | manifestId
    Boolean xPBUnifiedErrorStructure = true; // Boolean | Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs.
    try {
      Manifest result = apiInstance.reprintManifest(manifestId, xPBUnifiedErrorStructure);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManifestsApi#reprintManifest");
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
 **manifestId** | **String**| manifestId |
 **xPBUnifiedErrorStructure** | **Boolean**| Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. | [optional] [default to true]

### Return type

[**Manifest**](Manifest.md)

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

<a name="retryManifest"></a>
# **retryManifest**
> Manifest retryManifest(originalTransactionId, xPBUnifiedErrorStructure)

retryManifest

### Example
```java
// Import classes:
import org.pitneybowes.shippingapi.ApiClient;
import org.pitneybowes.shippingapi.ApiException;
import org.pitneybowes.shippingapi.Configuration;
import org.pitneybowes.shippingapi.auth.*;
import org.pitneybowes.shippingapi.models.*;
import org.pitneybowes.shippingapi.api.ManifestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.pitneybowes.com/shippingservices");
    
    // Configure OAuth2 access token for authorization: oAuth2ClientCredentials
    OAuth oAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("oAuth2ClientCredentials");
    oAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    ManifestsApi apiInstance = new ManifestsApi(defaultClient);
    String originalTransactionId = "originalTransactionId_example"; // String | 
    Boolean xPBUnifiedErrorStructure = true; // Boolean | Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs.
    try {
      Manifest result = apiInstance.retryManifest(originalTransactionId, xPBUnifiedErrorStructure);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManifestsApi#retryManifest");
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

### Return type

[**Manifest**](Manifest.md)

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

