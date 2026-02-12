package com.codebridge.service;

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

    StoreDTO deleteStore(Long id);

    StoreDTO getStoreByEmployee() throws UserException;

}
