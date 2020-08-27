# ContainerApi

All URIs are relative to *https://api-sandbox.pitneybowes.com/shippingservices*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getContainerizedParcelsLabels**](ContainerApi.md#getContainerizedParcelsLabels) | **POST** /v1/container-manifest | Create Container Manifest Label


<a name="getContainerizedParcelsLabels"></a>
# **getContainerizedParcelsLabels**
> ContainerManifestResponse getContainerizedParcelsLabels(xPBTransactionId, manifest, xPBUnifiedErrorStructure)

Create Container Manifest Label

This operation prints a label for the shipment of containerized parcels destined for a Pitney Bowes warehouse facility from the client location.

### Example
```java
// Import classes:
import PitneyBowes.Developer.ApiClient;
import PitneyBowes.Developer.ApiException;
import PitneyBowes.Developer.Configuration;
import PitneyBowes.Developer.auth.*;
import PitneyBowes.Developer.models.*;
import PitneyBowes.Developer.ShippingApi.ContainerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.pitneybowes.com/shippingservices");
    
    // Configure OAuth2 access token for authorization: oAuth2ClientCredentials
    OAuth oAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("oAuth2ClientCredentials");
    oAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    ContainerApi apiInstance = new ContainerApi(defaultClient);
    String xPBTransactionId = "xPBTransactionId_example"; // String | Required. A unique identifier for the transaction, up to 25 characters.
    Manifest manifest = {"carrier":"Newgistics","containerType":"Carton","parcelTrackingNumbers":["9205500000000000000000","9206600000000000000000"],"documents":[{"resolution":"DPI_203","size":"DOC_4X4","fileFormat":"PDF"}],"parameters":[{"name":"CLIENT_CONTAINER_ID","value":"AB12345678"},{"name":"SHIPMENT_REFERENCE_NUMBER","value":"CD12345678"},{"name":"CLIENT_FACILITY_ID","value":"7777"},{"name":"CARRIER_GATEWAY_FACILITY_ID","value":"1234"},{"name":"CARRIER_FACILITY_ID","value":"4321"},{"name":"PRINT_CUSTOM_MESSAGE_1","value":"Container: AB12345678, Shipment: CD12345678"},{"name":"current_container","value":"1"},{"name":"total_container_count","value":"2"},{"name":"client_Id","value":"NGST"}]}; // Manifest | manifest
    Boolean xPBUnifiedErrorStructure = true; // Boolean | Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs.
    try {
      ContainerManifestResponse result = apiInstance.getContainerizedParcelsLabels(xPBTransactionId, manifest, xPBUnifiedErrorStructure);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainerApi#getContainerizedParcelsLabels");
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

[**ContainerManifestResponse**](ContainerManifestResponse.md)

### Authorization

[oAuth2ClientCredentials](../README.md#oAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

