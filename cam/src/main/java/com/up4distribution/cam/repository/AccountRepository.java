package com.up4distribution.cam.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.up4distribution.cam.model.Account;

public interface AccountRepository extends CrudRepository<Account, UUID> {

}
