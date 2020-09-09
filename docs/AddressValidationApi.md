# AddressValidationApi

All URIs are relative to *https://api-sandbox.pitneybowes.com/shippingservices*

Method | HTTP request | Description
------------- | ------------- | -------------
[**verifyAddress**](AddressValidationApi.md#verifyAddress) | **POST** /v1/addresses/verify | Address validation
[**verifyAndSuggestAddress**](AddressValidationApi.md#verifyAndSuggestAddress) | **POST** /v1/addresses/verify-suggest | Address Suggestion


<a name="verifyAddress"></a>
# **verifyAddress**
> Address verifyAddress(address, xPBUnifiedErrorStructure, minimalAddressValidation)

Address validation

Address validation verifies and cleanses postal addresses within the United States to help ensure packages are rated accurately and shipments arrive at their final destinations on time.

### Example
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

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | [**Address**](Address.md)| Address object that needs to be validated. |
 **xPBUnifiedErrorStructure** | **Boolean**| Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. | [optional] [default to true]
 **minimalAddressValidation** | **Boolean**| When set to true, the complete address (delivery line and last line) is validated but only the last line (city, state, and postal code) would be changed by the validation check. | [optional]

### Return type

[**Address**](Address.md)

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

<a name="verifyAndSuggestAddress"></a>
# **verifyAndSuggestAddress**
> AddressSuggestionResponse verifyAndSuggestAddress(returnSuggestions, addressVerifySuggest, xPBUnifiedErrorStructure)

Address Suggestion

This operation returns suggested addresses. Use this if the [Address Validation API](https://shipping.pitneybowes.com/api/post-address-verify.html) call has returned an error.

### Example
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
    String returnSuggestions = "\"true\""; // String | To return suggested addresses, set this to true.
    AddressVerifySuggest addressVerifySuggest = new AddressVerifySuggest(); // AddressVerifySuggest | Address object that needs to be validated.
    Boolean xPBUnifiedErrorStructure = true; // Boolean | Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs.
    try {
      AddressSuggestionResponse result = apiInstance.verifyAndSuggestAddress(returnSuggestions, addressVerifySuggest, xPBUnifiedErrorStructure);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressValidationApi#verifyAndSuggestAddress");
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
 **returnSuggestions** | **String**| To return suggested addresses, set this to true. | [default to &quot;true&quot;]
 **addressVerifySuggest** | [**AddressVerifySuggest**](AddressVerifySuggest.md)| Address object that needs to be validated. |
 **xPBUnifiedErrorStructure** | **Boolean**| Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. | [optional] [default to true]

### Return type

[**AddressSuggestionResponse**](AddressSuggestionResponse.md)

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

