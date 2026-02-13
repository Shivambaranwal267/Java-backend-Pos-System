package com.codebridge.service;

import com.codebridge.model.User;
import com.codebridge.payload.dto.ProductDTO;

import java.util.List;

public interface ProductService {

    ProductDTO createProduct(ProductDTO productDTO, User user);
    List<ProductDTO> getProductByStoreId(Long storeId);
    ProductDTO updateProduct(Long id, ProductDTO productDTO, User user);
    List<ProductDTO> searchByKeyword(Long storeId, String keyword);
    void deleteProduct(Long id, User user);


}
