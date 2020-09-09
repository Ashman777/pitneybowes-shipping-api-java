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
import org.pitneybowes.shippingapi.model.InlineResponse2001;
import org.pitneybowes.shippingapi.model.SchedulePickup;
import org.pitneybowes.shippingapi.model.SchedulePickupResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PickupApi
 */
@Ignore
public class PickupApiTest {

    private final PickupApi api = new PickupApi();

    
    /**
     * Cancel Pickup
     *
     * This operation schedules a USPS package pickup from a residential or commercial location and provides a pickup confirmation number.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelPickupTest() throws ApiException {
        String xPBTransactionId = null;
        String pickupId = null;
        Boolean xPBUnifiedErrorStructure = null;
        InlineResponse2001 response = api.cancelPickup(xPBTransactionId, pickupId, xPBUnifiedErrorStructure);

        // TODO: test validations
    }
    
    /**
     * Address validation
     *
     * This operation schedules a USPS package pickup from a residential or commercial location and provides a pickup confirmation number.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPickupscheduleTest() throws ApiException {
        String xPBTransactionId = null;
        SchedulePickup schedulePickup = null;
        Boolean xPBUnifiedErrorStructure = null;
        SchedulePickupResponse response = api.getPickupschedule(xPBTransactionId, schedulePickup, xPBUnifiedErrorStructure);

        // TODO: test validations
    }
    
}
