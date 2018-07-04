package com.jillnguyen.driverlicense.service;

import org.springframework.stereotype.Service;

import com.jillnguyen.driverlicense.models.License;
import com.jillnguyen.driverlicense.repositories.LicenseRepository;

@Service
public class LicenseService {
	private final LicenseRepository licenseRepository;
	public LicenseService(LicenseRepository licenseRepository) {
		this.licenseRepository = licenseRepository;
	}
	
	public License createLicense(License l) {
		return licenseRepository.save(l);
	}
	
}
