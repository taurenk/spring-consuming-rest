package com.taurenk.hello;

import org.springframework.web.client.RestTemplate;

/**
 * Created by tauren on 2/13/15.
 */

public class Application {

    public static void main(String[] args) {

        // RestTemplate allows interaction with REST services
        // Cna interact with one line of code:
        RestTemplate restTemplate = new RestTemplate();
        Page page = restTemplate.getForObject("http://graph.facebook.com/pivotalsoftware", Page.class);
        System.out.println("Name:    " + page.getName());
        System.out.println("About:   " + page.getAbout());
        System.out.println("Phone:   " + page.getPhone());
        System.out.println("Website: " + page.getWebsite());

        // Check out my facebook
        page = restTemplate.getForObject("http://graph.facebook.com/tauren.kristich.5", Page.class);
        System.out.println("Name:    " + page.getName());
        System.out.println("About:   " + page.getAbout());
        System.out.println("Phone:   " + page.getPhone());
        System.out.println("Website: " + page.getWebsite());


    }
}
