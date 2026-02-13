package com.codebridge.service.impl;

import com.codebridge.model.User;
import com.codebridge.payload.dto.ProductDTO;
import com.codebridge.repository.ProductRepository;
import com.codebridge.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public ProductDTO createProduct(ProductDTO productDTO, User user) {
        return null;
    }

    @Override
    public List<ProductDTO> getProductByStoreId(Long storeId) {
        return List.of();
    }

    @Override
    public ProductDTO updateProduct(Long id, ProductDTO productDTO, User user) {
        return null;
    }

    @Override
    public List<ProductDTO> searchByKeyword(Long storeId, String keyword) {
        return List.of();
    }

    @Override
    public void deleteProduct(Long id, User user) {

    }
}
