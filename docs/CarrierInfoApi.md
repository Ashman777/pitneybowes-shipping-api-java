# CarrierInfoApi

All URIs are relative to *https://api-sandbox.pitneybowes.com/shippingservices*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCarrierFacilities**](CarrierInfoApi.md#getCarrierFacilities) | **POST** /v1/carrier-facility | Find Carrier Facilities
[**getCarrierLicenseAgreement**](CarrierInfoApi.md#getCarrierLicenseAgreement) | **GET** /v1/carrier/license-agreements | This operation retrieves a carrier&#39;s license agreement.
[**getCarrierServiceRules**](CarrierInfoApi.md#getCarrierServiceRules) | **GET** /v1/information/rules/rating-services | Retrieves the rules governing the carrier&#39;s services.
[**getCarrierSupportedDestination**](CarrierInfoApi.md#getCarrierSupportedDestination) | **GET** /v1/countries | This operation returns a list of supported destination countries to which the carrier offers international shipping services.


<a name="getCarrierFacilities"></a>
# **getCarrierFacilities**
> CarrierFacilityResponse getCarrierFacilities(carrierFacilityRequest, xPBUnifiedErrorStructure)

Find Carrier Facilities

This operation locates Post Offices and other facilities for a given carrier. You can use this operation, for example, to locate all USPS Post Offices near to a given postal code.If you use the Standard Return API and if you use the option to print a QR code, use this API to locate facilities where the buyer can print the label from the QR code.

### Example
```java
// Import classes:
import PitneyBowes.Developer.ApiClient;
import PitneyBowes.Developer.ApiException;
import PitneyBowes.Developer.Configuration;
import PitneyBowes.Developer.auth.*;
import PitneyBowes.Developer.models.*;
import PitneyBowes.Developer.ShippingApi.CarrierInfoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.pitneybowes.com/shippingservices");
    
    // Configure OAuth2 access token for authorization: oAuth2ClientCredentials
    OAuth oAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("oAuth2ClientCredentials");
    oAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    CarrierInfoApi apiInstance = new CarrierInfoApi(defaultClient);
    CarrierFacilityRequest carrierFacilityRequest = {"address":{"addressLines":["6525 Greenway Dr"],"cityTown":"Roanoke","stateProvince":"VA","countryCode":"US"},"carrier":"USPS","carrierFacilityOptions":[{"name":"FACILITY_TYPE_SERVICE","value":"LABEL_BROKER_RETAIL"},{"name":"FACILITY_TYPE","value":"POST_OFFICE"},{"name":"FACILITY_WITHIN_RADIUS","value":"10"},{"name":"NUMBER_OF_FACILITIES","value":"5"}]}; // CarrierFacilityRequest | 
    Boolean xPBUnifiedErrorStructure = true; // Boolean | Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs.
    try {
      CarrierFacilityResponse result = apiInstance.getCarrierFacilities(carrierFacilityRequest, xPBUnifiedErrorStructure);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CarrierInfoApi#getCarrierFacilities");
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
 **carrierFacilityRequest** | [**CarrierFacilityRequest**](CarrierFacilityRequest.md)|  |
 **xPBUnifiedErrorStructure** | **Boolean**| Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. | [optional] [default to true]

### Return type

[**CarrierFacilityResponse**](CarrierFacilityResponse.md)

### Authorization

[oAuth2ClientCredentials](../README.md#oAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**0** | Error |  -  |

<a name="getCarrierLicenseAgreement"></a>
# **getCarrierLicenseAgreement**
> InlineResponse200 getCarrierLicenseAgreement(carrier, originCountryCode, xPBUnifiedErrorStructure)

This operation retrieves a carrier&#39;s license agreement.

This operation retrieves a carrier&#39;s license agreement. The operation is used in the [Carrier Registration Tutorial](https://shipping.pitneybowes.com/carrier-registration.html).

### Example
```java
// Import classes:
import PitneyBowes.Developer.ApiClient;
import PitneyBowes.Developer.ApiException;
import PitneyBowes.Developer.Configuration;
import PitneyBowes.Developer.auth.*;
import PitneyBowes.Developer.models.*;
import PitneyBowes.Developer.ShippingApi.CarrierInfoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.pitneybowes.com/shippingservices");
    
    // Configure OAuth2 access token for authorization: oAuth2ClientCredentials
    OAuth oAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("oAuth2ClientCredentials");
    oAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    CarrierInfoApi apiInstance = new CarrierInfoApi(defaultClient);
    String carrier = UPS; // String | The carrier name. Currently this must be set to: UPS
    ISOCountryCode originCountryCode = US; // ISOCountryCode | The two-character ISO country code for the country where the shipment originates.
    Boolean xPBUnifiedErrorStructure = true; // Boolean | Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs.
    try {
      InlineResponse200 result = apiInstance.getCarrierLicenseAgreement(carrier, originCountryCode, xPBUnifiedErrorStructure);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CarrierInfoApi#getCarrierLicenseAgreement");
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
 **carrier** | **String**| The carrier name. Currently this must be set to: UPS | [default to &quot;UPS&quot;]
 **originCountryCode** | [**ISOCountryCode**](.md)| The two-character ISO country code for the country where the shipment originates. | [default to US] [enum: AF, AX, AL, DZ, AS, AD, AO, AI, AQ, AG, AR, AM, AW, AU, AT, AZ, BS, BH, BD, BB, BY, BE, BZ, BJ, BM, BT, BO, BQ, BA, BW, BV, BR, IO, BN, BG, BF, BI, KH, CM, CA, CV, KY, CF, TD, CL, CN, CX, CC, CO, KM, CG, CD, CK, CR, CI, HR, CU, CW, CY, CZ, DK, DJ, DM, DO, EC, EG, SV, GQ, ER, EE, ET, FK, FO, FJ, FI, FR, GF, PF, TF, GA, GM, GE, DE, GH, GI, GR, GL, GD, GP, GU, GT, GG, GN, GW, GY, HT, HM, VA, HN, HK, HU, IS, IN, ID, IR, IQ, IE, IM, IL, IT, JM, JP, JE, JO, KZ, KE, KI, KP, KR, KW, KG, LA, LV, LB, LS, LR, LY, LI, LT, LU, MO, MK, MG, MW, MY, MV, ML, MT, MH, MQ, MR, MU, YT, MX, FM, MD, MC, MN, ME, MS, MA, MZ, MM, NA, NR, NP, NL, NC, NZ, NI, NE, NG, NU, NF, MP, NO, OM, PK, PW, PS, PA, PG, PY, PE, PH, PN, PL, PT, PR, QA, RE, RO, RU, RW, BL, SH, KN, LC, MF, PM, VC, WS, SM, ST, SA, SN, RS, SC, SL, SG, SX, SK, SI, SB, SO, ZA, GS, SS, ES, LK, SD, SR, SJ, SZ, SE, CH, SY, TW, TJ, TZ, TH, TL, TG, TK, TO, TT, TN, TR, TM, TC, TV, UG, UA, AE, GB, US, UM, UY, UZ, VU, VE, VN, VG, VI, WF, EH, YE, ZM, ZW]
 **xPBUnifiedErrorStructure** | **Boolean**| Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. | [optional] [default to true]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[oAuth2ClientCredentials](../README.md#oAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**0** | Error |  -  |

<a name="getCarrierServiceRules"></a>
# **getCarrierServiceRules**
> CarrierRule getCarrierServiceRules(carrier, originCountryCode, destinationCountryCode, xPBUnifiedErrorStructure, rateTypeId, futureShipmentDate, returnShipment, compactResponse)

Retrieves the rules governing the carrier&#39;s services.

This operation retrieves the rules governing the carrier&#39;s services, including the available parcel types and the limits on weights and dimensions. **This API currently returns rules only for USPS** . Find more information at [Get Carrier Rules](https://shipping.pitneybowes.com/api/get-carrier-rules.html)

### Example
```java
// Import classes:
import PitneyBowes.Developer.ApiClient;
import PitneyBowes.Developer.ApiException;
import PitneyBowes.Developer.Configuration;
import PitneyBowes.Developer.auth.*;
import PitneyBowes.Developer.models.*;
import PitneyBowes.Developer.ShippingApi.CarrierInfoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.pitneybowes.com/shippingservices");
    
    // Configure OAuth2 access token for authorization: oAuth2ClientCredentials
    OAuth oAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("oAuth2ClientCredentials");
    oAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    CarrierInfoApi apiInstance = new CarrierInfoApi(defaultClient);
    Carrier carrier = USPS; // Carrier | The carrier name. **Currently this must be set to: USPS** 
    ISOCountryCode originCountryCode = US; // ISOCountryCode | The [two-character ISO country code](https://www.iso.org/obp/ui/#search) for the country where the shipment originates.
    ISOCountryCode destinationCountryCode = IN; // ISOCountryCode | The [two-character ISO country code](https://www.iso.org/obp/ui/#search) for the country of the shipment's destination address.
    Boolean xPBUnifiedErrorStructure = true; // Boolean | Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs.
    String rateTypeId = "rateTypeId_example"; // String | The type of rate requested, such as COMMERCIAL_BASE. If a rate type is not specified, all eligible rate types are returned.
    String futureShipmentDate = "futureShipmentDate_example"; // String | If the shipment is for a future date, and if a rate change is expected before the shipment date, use this field to ensure you get the correct rates and correct rate rules. Note that a rate change can affect the structure of the rate rules as well as the actual rates.Specify this value in UTC/GMT, not in local time. Formats allowed are   * **YYYY-MM-DD**   * **YYYY-MM-DD HH:mm:ss** * **YYYY-MM-DD HH:mm:ss.SSS**
    OffsetDateTime returnShipment = new OffsetDateTime(); // OffsetDateTime | If set to true, provides only services applicable for return shipment.
    Boolean compactResponse = true; // Boolean | If set to true, returns only summary, without special service details.
    try {
      CarrierRule result = apiInstance.getCarrierServiceRules(carrier, originCountryCode, destinationCountryCode, xPBUnifiedErrorStructure, rateTypeId, futureShipmentDate, returnShipment, compactResponse);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CarrierInfoApi#getCarrierServiceRules");
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
 **carrier** | [**Carrier**](.md)| The carrier name. **Currently this must be set to: USPS**  | [default to USPS] [enum: USPS, PBPRESORT, NEWGISTICS, PBI, FEDEX, USP]
 **originCountryCode** | [**ISOCountryCode**](.md)| The [two-character ISO country code](https://www.iso.org/obp/ui/#search) for the country where the shipment originates. | [default to US] [enum: AF, AX, AL, DZ, AS, AD, AO, AI, AQ, AG, AR, AM, AW, AU, AT, AZ, BS, BH, BD, BB, BY, BE, BZ, BJ, BM, BT, BO, BQ, BA, BW, BV, BR, IO, BN, BG, BF, BI, KH, CM, CA, CV, KY, CF, TD, CL, CN, CX, CC, CO, KM, CG, CD, CK, CR, CI, HR, CU, CW, CY, CZ, DK, DJ, DM, DO, EC, EG, SV, GQ, ER, EE, ET, FK, FO, FJ, FI, FR, GF, PF, TF, GA, GM, GE, DE, GH, GI, GR, GL, GD, GP, GU, GT, GG, GN, GW, GY, HT, HM, VA, HN, HK, HU, IS, IN, ID, IR, IQ, IE, IM, IL, IT, JM, JP, JE, JO, KZ, KE, KI, KP, KR, KW, KG, LA, LV, LB, LS, LR, LY, LI, LT, LU, MO, MK, MG, MW, MY, MV, ML, MT, MH, MQ, MR, MU, YT, MX, FM, MD, MC, MN, ME, MS, MA, MZ, MM, NA, NR, NP, NL, NC, NZ, NI, NE, NG, NU, NF, MP, NO, OM, PK, PW, PS, PA, PG, PY, PE, PH, PN, PL, PT, PR, QA, RE, RO, RU, RW, BL, SH, KN, LC, MF, PM, VC, WS, SM, ST, SA, SN, RS, SC, SL, SG, SX, SK, SI, SB, SO, ZA, GS, SS, ES, LK, SD, SR, SJ, SZ, SE, CH, SY, TW, TJ, TZ, TH, TL, TG, TK, TO, TT, TN, TR, TM, TC, TV, UG, UA, AE, GB, US, UM, UY, UZ, VU, VE, VN, VG, VI, WF, EH, YE, ZM, ZW]
 **destinationCountryCode** | [**ISOCountryCode**](.md)| The [two-character ISO country code](https://www.iso.org/obp/ui/#search) for the country of the shipment&#39;s destination address. | [default to US] [enum: AF, AX, AL, DZ, AS, AD, AO, AI, AQ, AG, AR, AM, AW, AU, AT, AZ, BS, BH, BD, BB, BY, BE, BZ, BJ, BM, BT, BO, BQ, BA, BW, BV, BR, IO, BN, BG, BF, BI, KH, CM, CA, CV, KY, CF, TD, CL, CN, CX, CC, CO, KM, CG, CD, CK, CR, CI, HR, CU, CW, CY, CZ, DK, DJ, DM, DO, EC, EG, SV, GQ, ER, EE, ET, FK, FO, FJ, FI, FR, GF, PF, TF, GA, GM, GE, DE, GH, GI, GR, GL, GD, GP, GU, GT, GG, GN, GW, GY, HT, HM, VA, HN, HK, HU, IS, IN, ID, IR, IQ, IE, IM, IL, IT, JM, JP, JE, JO, KZ, KE, KI, KP, KR, KW, KG, LA, LV, LB, LS, LR, LY, LI, LT, LU, MO, MK, MG, MW, MY, MV, ML, MT, MH, MQ, MR, MU, YT, MX, FM, MD, MC, MN, ME, MS, MA, MZ, MM, NA, NR, NP, NL, NC, NZ, NI, NE, NG, NU, NF, MP, NO, OM, PK, PW, PS, PA, PG, PY, PE, PH, PN, PL, PT, PR, QA, RE, RO, RU, RW, BL, SH, KN, LC, MF, PM, VC, WS, SM, ST, SA, SN, RS, SC, SL, SG, SX, SK, SI, SB, SO, ZA, GS, SS, ES, LK, SD, SR, SJ, SZ, SE, CH, SY, TW, TJ, TZ, TH, TL, TG, TK, TO, TT, TN, TR, TM, TC, TV, UG, UA, AE, GB, US, UM, UY, UZ, VU, VE, VN, VG, VI, WF, EH, YE, ZM, ZW]
 **xPBUnifiedErrorStructure** | **Boolean**| Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. | [optional] [default to true]
 **rateTypeId** | **String**| The type of rate requested, such as COMMERCIAL_BASE. If a rate type is not specified, all eligible rate types are returned. | [optional]
 **futureShipmentDate** | **String**| If the shipment is for a future date, and if a rate change is expected before the shipment date, use this field to ensure you get the correct rates and correct rate rules. Note that a rate change can affect the structure of the rate rules as well as the actual rates.Specify this value in UTC/GMT, not in local time. Formats allowed are   * **YYYY-MM-DD**   * **YYYY-MM-DD HH:mm:ss** * **YYYY-MM-DD HH:mm:ss.SSS** | [optional]
 **returnShipment** | **OffsetDateTime**| If set to true, provides only services applicable for return shipment. | [optional]
 **compactResponse** | **Boolean**| If set to true, returns only summary, without special service details. | [optional]

### Return type

[**CarrierRule**](CarrierRule.md)

### Authorization

[oAuth2ClientCredentials](../README.md#oAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**0** | For a list of all PB Shipping APIs error codes, please see [Error Codes](https://shipping.pitneybowes.com/reference/error-codes.html) |  -  |

<a name="getCarrierSupportedDestination"></a>
# **getCarrierSupportedDestination**
> List&lt;Object&gt; getCarrierSupportedDestination(carrier, originCountryCode, xPBUnifiedErrorStructure)

This operation returns a list of supported destination countries to which the carrier offers international shipping services.

### Example
```java
// Import classes:
import PitneyBowes.Developer.ApiClient;
import PitneyBowes.Developer.ApiException;
import PitneyBowes.Developer.Configuration;
import PitneyBowes.Developer.auth.*;
import PitneyBowes.Developer.models.*;
import PitneyBowes.Developer.ShippingApi.CarrierInfoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.pitneybowes.com/shippingservices");
    
    // Configure OAuth2 access token for authorization: oAuth2ClientCredentials
    OAuth oAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("oAuth2ClientCredentials");
    oAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    CarrierInfoApi apiInstance = new CarrierInfoApi(defaultClient);
    Carrier carrier = usps; // Carrier | The carrier name. Currently this must be set to: USPS
    ISOCountryCode originCountryCode = US; // ISOCountryCode | The two-character ISO country code for the country where the shipment originates.
    Boolean xPBUnifiedErrorStructure = true; // Boolean | Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs.
    try {
      List<Object> result = apiInstance.getCarrierSupportedDestination(carrier, originCountryCode, xPBUnifiedErrorStructure);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CarrierInfoApi#getCarrierSupportedDestination");
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
 **carrier** | [**Carrier**](.md)| The carrier name. Currently this must be set to: USPS | [default to USPS] [enum: USPS, PBPRESORT, NEWGISTICS, PBI, FEDEX, USP]
 **originCountryCode** | [**ISOCountryCode**](.md)| The two-character ISO country code for the country where the shipment originates. | [default to US] [enum: AF, AX, AL, DZ, AS, AD, AO, AI, AQ, AG, AR, AM, AW, AU, AT, AZ, BS, BH, BD, BB, BY, BE, BZ, BJ, BM, BT, BO, BQ, BA, BW, BV, BR, IO, BN, BG, BF, BI, KH, CM, CA, CV, KY, CF, TD, CL, CN, CX, CC, CO, KM, CG, CD, CK, CR, CI, HR, CU, CW, CY, CZ, DK, DJ, DM, DO, EC, EG, SV, GQ, ER, EE, ET, FK, FO, FJ, FI, FR, GF, PF, TF, GA, GM, GE, DE, GH, GI, GR, GL, GD, GP, GU, GT, GG, GN, GW, GY, HT, HM, VA, HN, HK, HU, IS, IN, ID, IR, IQ, IE, IM, IL, IT, JM, JP, JE, JO, KZ, KE, KI, KP, KR, KW, KG, LA, LV, LB, LS, LR, LY, LI, LT, LU, MO, MK, MG, MW, MY, MV, ML, MT, MH, MQ, MR, MU, YT, MX, FM, MD, MC, MN, ME, MS, MA, MZ, MM, NA, NR, NP, NL, NC, NZ, NI, NE, NG, NU, NF, MP, NO, OM, PK, PW, PS, PA, PG, PY, PE, PH, PN, PL, PT, PR, QA, RE, RO, RU, RW, BL, SH, KN, LC, MF, PM, VC, WS, SM, ST, SA, SN, RS, SC, SL, SG, SX, SK, SI, SB, SO, ZA, GS, SS, ES, LK, SD, SR, SJ, SZ, SE, CH, SY, TW, TJ, TZ, TH, TL, TG, TK, TO, TT, TN, TR, TM, TC, TV, UG, UA, AE, GB, US, UM, UY, UZ, VU, VE, VN, VG, VI, WF, EH, YE, ZM, ZW]
 **xPBUnifiedErrorStructure** | **Boolean**| Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. | [optional] [default to true]

### Return type

**List&lt;Object&gt;**

### Authorization

[oAuth2ClientCredentials](../README.md#oAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**0** | Error |  -  |

