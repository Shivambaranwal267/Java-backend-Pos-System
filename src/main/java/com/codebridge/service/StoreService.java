package com.codebridge.service;

import com.codebridge.domain.StoreStatus;
import com.codebridge.exception.UserException;
import com.codebridge.model.Store;
import com.codebridge.model.User;
import com.codebridge.payload.dto.StoreDTO;

import java.util.List;

public interface StoreService {

    StoreDTO createStore(StoreDTO storeDTO, User user);

    StoreDTO getStoreById(Long id) throws Exception;

    List<StoreDTO> getAllStores();

    Store getStoreByAdmin() throws UserException;

    StoreDTO updateStore(Long id, StoreDTO storeDTO) throws Exception;

    void deleteStore(Long id) throws Exception;

    StoreDTO getStoreByEmployee() throws UserException;

    StoreDTO moderateStore(long id, StoreStatus status) throws Exception;

}
