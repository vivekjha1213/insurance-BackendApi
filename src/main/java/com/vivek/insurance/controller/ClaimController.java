package com.vivek.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.vivek.insurance.model.Claim;
import com.vivek.insurance.service.ClaimService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/claims")
public class ClaimController {

    @Autowired
    private ClaimService claimService;

    @GetMapping
    public ResponseEntity<List<Claim>> getAllClaims() {
        List<Claim> claims = claimService.getAllClaims();
        return new ResponseEntity<>(claims, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Claim> getClaimById(@PathVariable String id) {
        Optional<Claim> claim = claimService.getClaimById(id);
        return claim.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/saveClaim")
    public ResponseEntity<Claim> createClaim(@RequestBody Claim claim) {
        Claim savedClaim = claimService.saveClaim(claim);

        return new ResponseEntity<>(savedClaim, HttpStatus.CREATED);
        


    }

    @PutMapping("/{id}")
    public ResponseEntity<Claim> updateClaim(@PathVariable String id, @RequestBody Claim claim) {
        Optional<Claim> existingClaim = claimService.getClaimById(id);
        if (existingClaim.isPresent()) {
            claim.setClaimId(id);
            Claim updatedClaim = claimService.saveClaim(claim);
            return new ResponseEntity<>(updatedClaim, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClaimById(@PathVariable String id) {
        claimService.deleteClaimById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
