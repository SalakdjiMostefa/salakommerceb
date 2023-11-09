package com.salakommerceb.facade;

import com.salakommerceb.common.dto.*;
import com.salakommerceb.common.exception.*;

import java.util.List;

/**
 * The interface Catalogue facade.
 */
public interface ICatalogueFacade {

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
    CategoryDTO createCategory(final CategoryDTO categoryDTO) throws CheckException, CreateException;

    /**
     * Find category category dto.
     *
     * @param categoryId the category id
     * @return the category dto
     * @throws FinderException the finder exception
     * @throws CheckException  the check exception
     * @throws CreateException the create exception
     */
    CategoryDTO findCategory(final Long categoryId) throws FinderException, CheckException, CreateException;

    /**
     * Delete category.
     *
     * @param categoryId the category id
     * @throws RemoveException the remove exception
     * @throws CheckException  the check exception
     */
    void deleteCategory(final Long categoryId) throws RemoveException, CheckException;

    /**
     * Update category.
     *
     * @param categoryDTO the category dto
     * @throws UpdateException the update exception
     * @throws CheckException  the check exception
     */
    void updateCategory(final CategoryDTO categoryDTO) throws UpdateException, CheckException;

    /**
     * Find categories list.
     *
     * @return the list
     * @throws FinderException the finder exception
     */
    List<CategoryDTO> findCategories() throws FinderException;

    /**
     * Find categories by level list.
     *
     * @param level the level
     * @return the list
     * @throws FinderException the finder exception
     */
    List<CategoryDTO> findCategoriesByLevel(final String level) throws FinderException;

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
    ProductDTO createProduct(final ProductDTO productDTO) throws CheckException, CreateException;

    /**
     * Find product product dto.
     *
     * @param productId the product id
     * @return the product dto
     * @throws FinderException the finder exception
     * @throws CheckException  the check exception
     */
    ProductDTO findProduct(final Long productId) throws FinderException, CheckException;

    /**
     * Delete product.
     *
     * @param productId the product id
     * @throws RemoveException the remove exception
     * @throws CheckException  the check exception
     */
    void deleteProduct(final Long productId) throws RemoveException, CheckException;

    /**
     * Update product.
     *
     * @param productDTO the product dto
     * @throws UpdateException the update exception
     * @throws CheckException  the check exception
     */
    void updateProduct(final ProductDTO productDTO) throws UpdateException, CheckException;

    /**
     * Find products list.
     *
     * @return the list
     * @throws FinderException the finder exception
     */
    List<ProductDTO> findProducts() throws FinderException;

    /**
     * Find products by sub category id list.
     *
     * @param categoryId the category id
     * @return the list
     * @throws FinderException the finder exception
     * @throws CheckException  the check exception
     */
    List<ProductDTO> findProductsBySubCategoryId(final Long categoryId) throws FinderException, CheckException;

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
    ItemDTO createItem(final ItemDTO itemDTO) throws CheckException, CreateException;

    /**
     * Find item item dto.
     *
     * @param itemId the item id
     * @return the item dto
     * @throws FinderException the finder exception
     * @throws CheckException  the check exception
     */
    ItemDTO findItem(final Long itemId) throws FinderException, CheckException;

    /**
     * Delete item.
     *
     * @param itemId the item id
     * @throws RemoveException the remove exception
     * @throws CheckException  the check exception
     */
    void deleteItem(final Long itemId) throws RemoveException, CheckException;

    /**
     * Update item.
     *
     * @param itemDTO the item dto
     * @throws UpdateException the update exception
     * @throws CheckException  the check exception
     */
    void updateItem(final ItemDTO itemDTO) throws UpdateException, CheckException;

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
    List<ItemDTO> findItemsByProductId(final Long productId) throws FinderException, CheckException;

    /**
     * Search items list.
     *
     * @param keyword the keyword
     * @return the list
     * @throws FinderException the finder exception
     */
    List<ItemDTO> searchItems(final String keyword) throws FinderException;

    /**
     * Find univers by level list.
     *
     * @param level the level
     * @return the list
     */
    List<UniversDTO> findUniversByLevel(final String level);

    /**
     * Find all sub category list.
     *
     * @param level the level
     * @return the list
     */
    List<SubCategoryDTO> findAllSubCategory(final String level);

    /**
     * Find products by id product dto.
     *
     * @param id the id
     * @return the product dto
     */
    ProductDTO findProductsById(final long id);
}
