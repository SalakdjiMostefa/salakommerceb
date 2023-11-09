package com.salakommerceb.server.service.catalog;


import com.salakommerceb.common.dto.CategoryDTO;
import com.salakommerceb.common.dto.ItemDTO;
import com.salakommerceb.common.dto.ProductDTO;
import com.salakommerceb.common.exception.*;

import java.util.List;

/**
 * This interface gives a remote view of the CatalogServiceBean. Any distant client that wants to call
 * a method on the CatalogServiceBean has to use this interface.
 */
public interface ICatalogService {

    // ======================================
    // =      Category Business methods     =
    // ======================================

    /**
     * Create category category dto.
     *
     * @param categoryDTO the category dto
     * @return the category dto
     * @throws CheckException  the check exception
     * @throws CreateException the create exception
     */
    CategoryDTO createCategory(CategoryDTO categoryDTO) throws CheckException, CreateException;

    /**
     * Find category category dto.
     *
     * @param categoryId the category id
     * @return the category dto
     * @throws FinderException the finder exception
     * @throws CheckException  the check exception
     * @throws CreateException the create exception
     */
    CategoryDTO findCategory(Long categoryId) throws FinderException, CheckException, CreateException;

    /**
     * Delete category.
     *
     * @param categoryId the category id
     * @throws RemoveException the remove exception
     * @throws CheckException  the check exception
     */
    void deleteCategory(Long categoryId) throws RemoveException, CheckException;

    /**
     * Update category.
     *
     * @param categoryDTO the category dto
     * @throws UpdateException the update exception
     * @throws CheckException  the check exception
     */
    void updateCategory(CategoryDTO categoryDTO) throws UpdateException, CheckException;

    /**
     * Find categories list.
     *
     * @return the list
     * @throws FinderException the finder exception
     */
    List<CategoryDTO> findCategories() throws FinderException;

    // ======================================
    // =      Product Business methods     =
    // ======================================


    /**
     * Create product product dto.
     *
     * @param productDTO the product dto
     * @return the product dto
     * @throws CheckException  the check exception
     * @throws CreateException the create exception
     */
    ProductDTO createProduct(ProductDTO productDTO) throws CheckException, CreateException;

    /**
     * Find product product dto.
     *
     * @param productId the product id
     * @return the product dto
     * @throws FinderException the finder exception
     * @throws CheckException  the check exception
     */
    ProductDTO findProduct(Long productId) throws FinderException, CheckException;

    /**
     * Delete product.
     *
     * @param productId the product id
     * @throws RemoveException the remove exception
     * @throws CheckException  the check exception
     */
    void deleteProduct(Long productId) throws RemoveException, CheckException;

    /**
     * Update product.
     *
     * @param productDTO the product dto
     * @throws UpdateException the update exception
     * @throws CheckException  the check exception
     */
    void updateProduct(ProductDTO productDTO) throws UpdateException, CheckException;

    /**
     * Find products list.
     *
     * @return the list
     * @throws FinderException the finder exception
     */
    List<ProductDTO> findProducts() throws FinderException;

    /**
     * Find products by category id list.
     *
     * @param categoryId the category id
     * @return the list
     * @throws FinderException the finder exception
     * @throws CheckException  the check exception
     */
    List<ProductDTO> findProductsByCategoryId(Long categoryId) throws FinderException, CheckException;

    // ======================================
    // =        Item Business methods       =
    // ======================================

    /**
     * Create item item dto.
     *
     * @param itemDTO the item dto
     * @return the item dto
     * @throws CheckException  the check exception
     * @throws CreateException the create exception
     */
    ItemDTO createItem(ItemDTO itemDTO) throws CheckException, CreateException;

    /**
     * Find item item dto.
     *
     * @param itemId the item id
     * @return the item dto
     * @throws FinderException the finder exception
     * @throws CheckException  the check exception
     */
    ItemDTO findItem(Long itemId) throws FinderException, CheckException;

    /**
     * Delete item.
     *
     * @param itemId the item id
     * @throws RemoveException the remove exception
     * @throws CheckException  the check exception
     */
    void deleteItem(Long itemId) throws RemoveException, CheckException;

    /**
     * Update item.
     *
     * @param itemDTO the item dto
     * @throws UpdateException the update exception
     * @throws CheckException  the check exception
     */
    void updateItem(ItemDTO itemDTO) throws UpdateException, CheckException;

    /**
     * Find items list.
     *
     * @return the list
     * @throws FinderException the finder exception
     */
    List<ItemDTO> findItems() throws FinderException;

    /**
     * Find items by product id list.
     *
     * @param productId the product id
     * @return the list
     * @throws FinderException the finder exception
     * @throws CheckException  the check exception
     */
    List<ItemDTO> findItemsByProductId(Long productId) throws FinderException, CheckException;

    /**
     * Search items list.
     *
     * @param keyword the keyword
     * @return the list
     * @throws FinderException the finder exception
     */
    List<ItemDTO> searchItems(String keyword) throws FinderException;

}
