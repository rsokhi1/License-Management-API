package com.project.License_Management_API.Service;

import com.project.License_Management_API.entities.License;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class LicenseService {
//    @Autowired private LicenseRepository repo;

    public License issueLicense(String email){
        License license = new License();
        license.setUserEmail(email);
        license.setLicenseKey(UUID.randomUUID().toString());
        license.setActive(true);
        return license;
    }

}
