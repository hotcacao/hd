package com.up4distribution.cam.repository.impl;

import java.util.UUID;

import com.up4distribution.cam.model.Account;
import com.up4distribution.cam.repository.AccountRepository;

public class DefaultAccountRepository implements AccountRepository {

    public <S extends Account> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    public <S extends Account> Iterable<S> save(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    public Account findOne(UUID id) {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean exists(UUID id) {
        // TODO Auto-generated method stub
        return false;
    }

    public Iterable<Account> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    public Iterable<Account> findAll(Iterable<UUID> ids) {
        // TODO Auto-generated method stub
        return null;
    }

    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    public void delete(UUID id) {
        // TODO Auto-generated method stub

    }

    public void delete(Account entity) {
        // TODO Auto-generated method stub

    }

    public void delete(Iterable<? extends Account> entities) {
        // TODO Auto-generated method stub

    }

    public void deleteAll() {
        // TODO Auto-generated method stub

    }

}
