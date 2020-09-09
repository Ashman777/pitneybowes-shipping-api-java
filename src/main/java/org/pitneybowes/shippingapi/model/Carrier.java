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


package org.pitneybowes.shippingapi.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * USPS - US Postal Service | PBPRESORT - Pitney Powes Presort Services |   NEWGISTICS - Newgistics. 
 */
@JsonAdapter(Carrier.Adapter.class)
public enum Carrier {
  
  USPS("USPS"),
  
  PBPRESORT("PBPRESORT"),
  
  NEWGISTICS("NEWGISTICS"),
  
  PBI("PBI"),
  
  FEDEX("FEDEX"),
  
  USP("USP");

  private String value;

  Carrier(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Carrier fromValue(String value) {
    for (Carrier b : Carrier.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Carrier> {
    @Override
    public void write(final JsonWriter jsonWriter, final Carrier enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Carrier read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Carrier.fromValue(value);
    }
  }
}

