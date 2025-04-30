package com.project.License_Management_API.Controller;

import com.project.License_Management_API.Service.LicenseService;
import com.project.License_Management_API.entities.License;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/license")
public class LicenseController {
    @Autowired private LicenseService service;

    @PostMapping("/register")
    public License register(@RequestParam String email){
        return service.issueLicense(email);
    }
}
