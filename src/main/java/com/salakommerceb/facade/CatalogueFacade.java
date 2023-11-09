package com.salakommerceb.facade;

import com.salakommerceb.common.dto.*;
import com.salakommerceb.common.exception.*;
import com.salakommerceb.server.service.catalog.products.IProductService;
import com.salakommerceb.server.service.catalog.subcategory.ISubCategoryService;
import com.salakommerceb.server.service.catalog.univers.IUniversService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * The type Catalogue facade.
 */
@Component
public class CatalogueFacade implements ICatalogueFacade {

    @Autowired
    private IUniversService universService;

    @Autowired
    private ISubCategoryService subCategoryService;

    @Autowired
    private IProductService iProductService;

    @Override
    public CategoryDTO createCategory(CategoryDTO categoryDTO) throws CheckException, CreateException {
        return null;
    }

    @Override
    public CategoryDTO findCategory(Long categoryId) throws FinderException, CheckException, CreateException {
        return null;
    }

    @Override
    public void deleteCategory(Long categoryId) throws RemoveException, CheckException {

    }

    @Override
    public void updateCategory(CategoryDTO categoryDTO) throws UpdateException, CheckException {

    }

    @Override
    public List<CategoryDTO> findCategories() throws FinderException {
        return null;
    }

    @Override
    public List<CategoryDTO> findCategoriesByLevel(String level) throws FinderException {
        return null;
    }

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) throws CheckException, CreateException {
        return null;
    }

    @Override
    public ProductDTO findProduct(Long productId) throws FinderException, CheckException {
        return null;
    }

    @Override
    public void deleteProduct(Long productId) throws RemoveException, CheckException {

    }

    @Override
    public void updateProduct(ProductDTO productDTO) throws UpdateException, CheckException {

    }

    @Override
    public List<ProductDTO> findProducts() throws FinderException {
        return null;
    }

    @Override
    public List<ProductDTO> findProductsBySubCategoryId(final Long subCategoryId) throws FinderException, CheckException {
        return iProductService.findAllProductsByCategoryId(subCategoryId);
    }

    @Override
    public ItemDTO createItem(ItemDTO itemDTO) throws CheckException, CreateException {
        return null;
    }

    @Override
    public ItemDTO findItem(Long itemId) throws FinderException, CheckException {
        return null;
    }

    @Override
    public void deleteItem(Long itemId) throws RemoveException, CheckException {

    }

    @Override
    public void updateItem(ItemDTO itemDTO) throws UpdateException, CheckException {

    }

    @Override
    public List<ItemDTO> findItems() throws FinderException {
        return null;
    }

    @Override
    public List<ItemDTO> findItemsByProductId(Long productId) throws FinderException, CheckException {
        return null;
    }

    @Override
    public List<ItemDTO> searchItems(String keyword) throws FinderException {
        return null;
    }

    @Override
    public List<UniversDTO> findUniversByLevel(final String level) {
        return universService.getAllUniversByLevel(level);
    }

    @Override
    public List<SubCategoryDTO> findAllSubCategory(String level) {
        return subCategoryService.getAllSubCategoryByLevel(level);
    }

    @Override
    public ProductDTO findProductsById(long id) {
        return iProductService.findProductsById(id);
    }
}
