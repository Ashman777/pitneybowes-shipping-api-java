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

import org.pitneybowes.shippingapi.ApiException;
import org.pitneybowes.shippingapi.model.ContainerManifestResponse;
import org.pitneybowes.shippingapi.model.Manifest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContainerApi
 */
@Ignore
public class ContainerApiTest {

    private final ContainerApi api = new ContainerApi();

    
    /**
     * Create Container Manifest Label
     *
     * This operation prints a label for the shipment of containerized parcels destined for a Pitney Bowes warehouse facility from the client location.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getContainerizedParcelsLabelsTest() throws ApiException {
        String xPBTransactionId = null;
        Manifest manifest = null;
        Boolean xPBUnifiedErrorStructure = null;
        ContainerManifestResponse response = api.getContainerizedParcelsLabels(xPBTransactionId, manifest, xPBUnifiedErrorStructure);

        // TODO: test validations
    }
    
}
