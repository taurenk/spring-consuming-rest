package com.taurenk.hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by tauren on 2/13/15.
 */

// Well ignore any json properties not bound in this
@JsonIgnoreProperties(ignoreUnknown = true)
public class Page {

    private String name;
    private String about;
    private String phone;
    private String website;

    public String getName() {
        return name;
    }

    public String getAbout() {
        return about;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }

}
