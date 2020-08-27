# TransactionReportsApi

All URIs are relative to *https://api-sandbox.pitneybowes.com/shippingservices*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTransactionReport**](TransactionReportsApi.md#getTransactionReport) | **GET** /v4/ledger/developers/{developerId}/transactions/reports | This operation retrieves all transactions for a specified period of time.


<a name="getTransactionReport"></a>
# **getTransactionReport**
> PageRealTransactionDetailReport getTransactionReport(developerId, xPBUnifiedErrorStructure, fromDate, shipDetails, page, size, printStatus, toDate, transactionType, merchantId, sort, parcelTrackingNumber, transactionId)

This operation retrieves all transactions for a specified period of time.

### Example
```java
// Import classes:
import PitneyBowes.Developer.ApiClient;
import PitneyBowes.Developer.ApiException;
import PitneyBowes.Developer.Configuration;
import PitneyBowes.Developer.auth.*;
import PitneyBowes.Developer.models.*;
import PitneyBowes.Developer.ShippingApi.TransactionReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.pitneybowes.com/shippingservices");
    
    // Configure OAuth2 access token for authorization: oAuth2ClientCredentials
    OAuth oAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("oAuth2ClientCredentials");
    oAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    TransactionReportsApi apiInstance = new TransactionReportsApi(defaultClient);
    String developerId = "developerId_example"; // String | developerId
    Boolean xPBUnifiedErrorStructure = true; // Boolean | Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs.
    OffsetDateTime fromDate = new OffsetDateTime(); // OffsetDateTime | fromDate
    Integer shipDetails = 0; // Integer | 
    Integer page = 56; // Integer | 
    Integer size = 20; // Integer | 
    String printStatus = "printStatus_example"; // String | printStatus
    OffsetDateTime toDate = new OffsetDateTime(); // OffsetDateTime | toDate
    String transactionType = "transactionType_example"; // String | transactionType
    String merchantId = "merchantId_example"; // String | The value of the postalReportingNumber element in the [merchant object](https://shipping.pitneybowes.com/reference/resource-objects.html). This value is also the merchant's Shipper ID.
    String sort = "sort_example"; // String | Defines a property to sort on and the sort order. Sort order can be ascending (asc) or descending (desc). Use the following form-  * **sort=<property_name>,<sort_direction>** For example- **sort=transactionId,desc** 
    String parcelTrackingNumber = "parcelTrackingNumber_example"; // String | Parcel tracking number of the shipment.
    String transactionId = "transactionId_example"; // String | The unique string that identifies all the transactions associated with a given shipment. The string comprises the developer ID and the shipment's X-PB-TransactionId, separated by an underscore (_). For example-  * **transactionId=44397664_ad5aa07-ad7414-a78a-c22b3**
    try {
      PageRealTransactionDetailReport result = apiInstance.getTransactionReport(developerId, xPBUnifiedErrorStructure, fromDate, shipDetails, page, size, printStatus, toDate, transactionType, merchantId, sort, parcelTrackingNumber, transactionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionReportsApi#getTransactionReport");
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
 **developerId** | **String**| developerId |
 **xPBUnifiedErrorStructure** | **Boolean**| Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. | [optional] [default to true]
 **fromDate** | **OffsetDateTime**| fromDate | [optional]
 **shipDetails** | **Integer**|  | [optional] [default to 0] [enum: 0, 1]
 **page** | **Integer**|  | [optional]
 **size** | **Integer**|  | [optional] [default to 20]
 **printStatus** | **String**| printStatus | [optional] [enum: SBR, SBRPrinted, SBRCharged]
 **toDate** | **OffsetDateTime**| toDate | [optional]
 **transactionType** | **String**| transactionType | [optional] [enum: POSTAGE FUND, POSTAGE PRINT, POSTAGE REFUND, APV-POSTAGE ALL, APV-POSTAGE OVERPAID, APV-POSTAGE UNDERPAID]
 **merchantId** | **String**| The value of the postalReportingNumber element in the [merchant object](https://shipping.pitneybowes.com/reference/resource-objects.html). This value is also the merchant&#39;s Shipper ID. | [optional]
 **sort** | **String**| Defines a property to sort on and the sort order. Sort order can be ascending (asc) or descending (desc). Use the following form-  * **sort&#x3D;&lt;property_name&gt;,&lt;sort_direction&gt;** For example- **sort&#x3D;transactionId,desc**  | [optional]
 **parcelTrackingNumber** | **String**| Parcel tracking number of the shipment. | [optional]
 **transactionId** | **String**| The unique string that identifies all the transactions associated with a given shipment. The string comprises the developer ID and the shipment&#39;s X-PB-TransactionId, separated by an underscore (_). For example-  * **transactionId&#x3D;44397664_ad5aa07-ad7414-a78a-c22b3** | [optional]

### Return type

[**PageRealTransactionDetailReport**](PageRealTransactionDetailReport.md)

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

