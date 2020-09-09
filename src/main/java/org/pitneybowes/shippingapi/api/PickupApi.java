/*
 * Shipping API
 * Shipping API Sample.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@pb.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.pitneybowes.shippingapi.api;

import org.pitneybowes.shippingapi.ApiCallback;
import org.pitneybowes.shippingapi.ApiClient;
import org.pitneybowes.shippingapi.ApiException;
import org.pitneybowes.shippingapi.ApiResponse;
import org.pitneybowes.shippingapi.Configuration;
import org.pitneybowes.shippingapi.Pair;
import org.pitneybowes.shippingapi.ProgressRequestBody;
import org.pitneybowes.shippingapi.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.pitneybowes.shippingapi.model.InlineResponse2001;
import org.pitneybowes.shippingapi.model.SchedulePickup;
import org.pitneybowes.shippingapi.model.SchedulePickupResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickupApi {
    private ApiClient localVarApiClient;

    public PickupApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PickupApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for cancelPickup
     * @param xPBTransactionId A unique identifier for the transaction, up to 25 characters (required)
     * @param pickupId A unique identifier for the transaction, up to 25 characters (required)
     * @param xPBUnifiedErrorStructure Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. (optional, default to true)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cancelPickupCall(String xPBTransactionId, String pickupId, Boolean xPBUnifiedErrorStructure, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/pickups/{pickupId}/cancel"
            .replaceAll("\\{" + "pickupId" + "\\}", localVarApiClient.escapeString(pickupId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xPBUnifiedErrorStructure != null) {
            localVarHeaderParams.put("X-PB-UnifiedErrorStructure", localVarApiClient.parameterToString(xPBUnifiedErrorStructure));
        }

        if (xPBTransactionId != null) {
            localVarHeaderParams.put("X-PB-TransactionId", localVarApiClient.parameterToString(xPBTransactionId));
        }

        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "oAuth2ClientCredentials" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call cancelPickupValidateBeforeCall(String xPBTransactionId, String pickupId, Boolean xPBUnifiedErrorStructure, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xPBTransactionId' is set
        if (xPBTransactionId == null) {
            throw new ApiException("Missing the required parameter 'xPBTransactionId' when calling cancelPickup(Async)");
        }
        
        // verify the required parameter 'pickupId' is set
        if (pickupId == null) {
            throw new ApiException("Missing the required parameter 'pickupId' when calling cancelPickup(Async)");
        }
        

        okhttp3.Call localVarCall = cancelPickupCall(xPBTransactionId, pickupId, xPBUnifiedErrorStructure, _callback);
        return localVarCall;

    }

    /**
     * Cancel Pickup
     * This operation schedules a USPS package pickup from a residential or commercial location and provides a pickup confirmation number.
     * @param xPBTransactionId A unique identifier for the transaction, up to 25 characters (required)
     * @param pickupId A unique identifier for the transaction, up to 25 characters (required)
     * @param xPBUnifiedErrorStructure Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. (optional, default to true)
     * @return InlineResponse2001
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public InlineResponse2001 cancelPickup(String xPBTransactionId, String pickupId, Boolean xPBUnifiedErrorStructure) throws ApiException {
        ApiResponse<InlineResponse2001> localVarResp = cancelPickupWithHttpInfo(xPBTransactionId, pickupId, xPBUnifiedErrorStructure);
        return localVarResp.getData();
    }

    /**
     * Cancel Pickup
     * This operation schedules a USPS package pickup from a residential or commercial location and provides a pickup confirmation number.
     * @param xPBTransactionId A unique identifier for the transaction, up to 25 characters (required)
     * @param pickupId A unique identifier for the transaction, up to 25 characters (required)
     * @param xPBUnifiedErrorStructure Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. (optional, default to true)
     * @return ApiResponse&lt;InlineResponse2001&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InlineResponse2001> cancelPickupWithHttpInfo(String xPBTransactionId, String pickupId, Boolean xPBUnifiedErrorStructure) throws ApiException {
        okhttp3.Call localVarCall = cancelPickupValidateBeforeCall(xPBTransactionId, pickupId, xPBUnifiedErrorStructure, null);
        Type localVarReturnType = new TypeToken<InlineResponse2001>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Cancel Pickup (asynchronously)
     * This operation schedules a USPS package pickup from a residential or commercial location and provides a pickup confirmation number.
     * @param xPBTransactionId A unique identifier for the transaction, up to 25 characters (required)
     * @param pickupId A unique identifier for the transaction, up to 25 characters (required)
     * @param xPBUnifiedErrorStructure Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. (optional, default to true)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cancelPickupAsync(String xPBTransactionId, String pickupId, Boolean xPBUnifiedErrorStructure, final ApiCallback<InlineResponse2001> _callback) throws ApiException {

        okhttp3.Call localVarCall = cancelPickupValidateBeforeCall(xPBTransactionId, pickupId, xPBUnifiedErrorStructure, _callback);
        Type localVarReturnType = new TypeToken<InlineResponse2001>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPickupschedule
     * @param xPBTransactionId A unique identifier for the transaction, up to 25 characters (required)
     * @param schedulePickup Schedule Pickup request. (required)
     * @param xPBUnifiedErrorStructure Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. (optional, default to true)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Invalid input </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPickupscheduleCall(String xPBTransactionId, SchedulePickup schedulePickup, Boolean xPBUnifiedErrorStructure, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = schedulePickup;

        // create path and map variables
        String localVarPath = "/v1/pickups/schedule";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xPBUnifiedErrorStructure != null) {
            localVarHeaderParams.put("X-PB-UnifiedErrorStructure", localVarApiClient.parameterToString(xPBUnifiedErrorStructure));
        }

        if (xPBTransactionId != null) {
            localVarHeaderParams.put("X-PB-TransactionId", localVarApiClient.parameterToString(xPBTransactionId));
        }

        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "oAuth2ClientCredentials" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPickupscheduleValidateBeforeCall(String xPBTransactionId, SchedulePickup schedulePickup, Boolean xPBUnifiedErrorStructure, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xPBTransactionId' is set
        if (xPBTransactionId == null) {
            throw new ApiException("Missing the required parameter 'xPBTransactionId' when calling getPickupschedule(Async)");
        }
        
        // verify the required parameter 'schedulePickup' is set
        if (schedulePickup == null) {
            throw new ApiException("Missing the required parameter 'schedulePickup' when calling getPickupschedule(Async)");
        }
        

        okhttp3.Call localVarCall = getPickupscheduleCall(xPBTransactionId, schedulePickup, xPBUnifiedErrorStructure, _callback);
        return localVarCall;

    }

    /**
     * Address validation
     * This operation schedules a USPS package pickup from a residential or commercial location and provides a pickup confirmation number.
     * @param xPBTransactionId A unique identifier for the transaction, up to 25 characters (required)
     * @param schedulePickup Schedule Pickup request. (required)
     * @param xPBUnifiedErrorStructure Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. (optional, default to true)
     * @return SchedulePickupResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Invalid input </td><td>  -  </td></tr>
     </table>
     */
    public SchedulePickupResponse getPickupschedule(String xPBTransactionId, SchedulePickup schedulePickup, Boolean xPBUnifiedErrorStructure) throws ApiException {
        ApiResponse<SchedulePickupResponse> localVarResp = getPickupscheduleWithHttpInfo(xPBTransactionId, schedulePickup, xPBUnifiedErrorStructure);
        return localVarResp.getData();
    }

    /**
     * Address validation
     * This operation schedules a USPS package pickup from a residential or commercial location and provides a pickup confirmation number.
     * @param xPBTransactionId A unique identifier for the transaction, up to 25 characters (required)
     * @param schedulePickup Schedule Pickup request. (required)
     * @param xPBUnifiedErrorStructure Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. (optional, default to true)
     * @return ApiResponse&lt;SchedulePickupResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Invalid input </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SchedulePickupResponse> getPickupscheduleWithHttpInfo(String xPBTransactionId, SchedulePickup schedulePickup, Boolean xPBUnifiedErrorStructure) throws ApiException {
        okhttp3.Call localVarCall = getPickupscheduleValidateBeforeCall(xPBTransactionId, schedulePickup, xPBUnifiedErrorStructure, null);
        Type localVarReturnType = new TypeToken<SchedulePickupResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Address validation (asynchronously)
     * This operation schedules a USPS package pickup from a residential or commercial location and provides a pickup confirmation number.
     * @param xPBTransactionId A unique identifier for the transaction, up to 25 characters (required)
     * @param schedulePickup Schedule Pickup request. (required)
     * @param xPBUnifiedErrorStructure Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. (optional, default to true)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Invalid input </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPickupscheduleAsync(String xPBTransactionId, SchedulePickup schedulePickup, Boolean xPBUnifiedErrorStructure, final ApiCallback<SchedulePickupResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPickupscheduleValidateBeforeCall(xPBTransactionId, schedulePickup, xPBUnifiedErrorStructure, _callback);
        Type localVarReturnType = new TypeToken<SchedulePickupResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}