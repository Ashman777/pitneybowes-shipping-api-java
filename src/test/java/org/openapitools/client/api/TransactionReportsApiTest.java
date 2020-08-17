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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Errors;
import org.threeten.bp.OffsetDateTime;
import org.openapitools.client.model.PageRealTransactionDetailReport;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TransactionReportsApi
 */
@Ignore
public class TransactionReportsApiTest {

    private final TransactionReportsApi api = new TransactionReportsApi();

    
    /**
     * This operation retrieves all transactions for a specified period of time.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransactionReportTest() throws ApiException {
        String developerId = null;
        Boolean xPBUnifiedErrorStructure = null;
        OffsetDateTime fromDate = null;
        Integer shipDetails = null;
        Integer page = null;
        Integer size = null;
        String printStatus = null;
        OffsetDateTime toDate = null;
        String transactionType = null;
        String merchantId = null;
        String sort = null;
        String parcelTrackingNumber = null;
        String transactionId = null;
        PageRealTransactionDetailReport response = api.getTransactionReport(developerId, xPBUnifiedErrorStructure, fromDate, shipDetails, page, size, printStatus, toDate, transactionType, merchantId, sort, parcelTrackingNumber, transactionId);

        // TODO: test validations
    }
    
}