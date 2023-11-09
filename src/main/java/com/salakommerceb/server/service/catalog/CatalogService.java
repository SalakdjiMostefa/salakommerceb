package com.salakommerceb.server.service.catalog;

import com.salakommerceb.common.converter.CategoriesToDTO;
import com.salakommerceb.common.converter.ProductToDTO;
import com.salakommerceb.common.converter.SubCategoriesToDTO;
import com.salakommerceb.common.converter.UniversToDTO;
import com.salakommerceb.common.dto.CategoryDTO;
import com.salakommerceb.common.dto.ItemDTO;
import com.salakommerceb.common.dto.ProductDTO;
import com.salakommerceb.common.exception.*;
import com.salakommerceb.server.domain.category.Category;
import com.salakommerceb.server.domain.category.CategoryDAO;
import com.salakommerceb.server.domain.item.Item;
import com.salakommerceb.server.domain.item.ItemDAO;
import com.salakommerceb.server.domain.product.Product;
import com.salakommerceb.server.domain.product.ProductDAO;
import com.salakommerceb.server.domain.subcategory.SubCategoryDAO;
import com.salakommerceb.server.domain.univers.UniversDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The type Catalog service.
 */
@Service
public class CatalogService implements ICatalogService {
    // ======================================
    // =             Attributes             =
    // ======================================
    @Autowired
    private UniversDAO universDAO;
    @Autowired
    private CategoryDAO categoryDAO;
    @Autowired
    private SubCategoryDAO subCategoryDAO;
    @Autowired
    private ProductDAO productDAO;
    @Autowired
    private ItemDAO itemDAO;

    @Autowired
    private UniversToDTO universToDTO;
    @Autowired
    private CategoriesToDTO categoriesToDTO;
    @Autowired
    private SubCategoriesToDTO subCategoriesToDTO;
    @Autowired
    private ProductToDTO productToDTO;

    /**
     * Instantiates a new Catalog service.
     */
// ======================================
    // =            Constructors            =
    // ======================================
    public CatalogService() {
    }

    // ======================================
    // =      Category Business methods     =
    // ======================================
    public CategoryDTO createCategory(final CategoryDTO categoryDTO) throws CheckException, CreateException {

        if (categoryDTO == null)
            throw new CheckException("Category object is null");

        // Transforms DTO into domain object
        final Category category = new Category(categoryDTO.getId(), categoryDTO.getName(), categoryDTO.getDescription());

        category.checkData();
        // Creates the object
        categoryDAO.save(category);

        // Transforms domain object into DTO
        final CategoryDTO result = categoriesToDTO.transformCategory2DTO(category);

        return result;
    }

    public CategoryDTO findCategory(final Long categoryId) throws CreateException, CheckException {

        if (categoryId == null || "".equals(categoryId))
            throw new CheckException("Invalid id");

        final Category category = categoryDAO.findById(categoryId).get();

        // Transforms domain object into DTO
        final CategoryDTO categoryDTO = categoriesToDTO.transformCategory2DTO(category);

        return categoryDTO;
    }

    public void deleteCategory(final Long categoryId) throws RemoveException, CheckException {

        checkId(categoryId);

        // Checks if the object exists
        categoryDAO.findById(categoryId);

        // Deletes the object
        categoryDAO.deleteById(categoryId);
    }

    public void updateCategory(final CategoryDTO categoryDTO) throws UpdateException, CheckException {

        if (categoryDTO == null)
            throw new CheckException("Category object is null");

        checkId(categoryDTO.getId());

        // Checks if the object exists
        Category category = categoryDAO.findById(categoryDTO.getId()).get();

        // Transforms DTO into domain object
        category.setName(categoryDTO.getName());
        category.setDescription(categoryDTO.getDescription());

        // Updates the object
        categoryDAO.saveAndFlush(category);
    }

    public List<CategoryDTO> findCategories() throws FinderException {

        // Finds all the objects
        final List<Category> categories = categoryDAO.findAll();

        // Transforms domain objects into DTOs
        final List<CategoryDTO> categoriesDTO = categoriesToDTO.transformCategories2DTOs(categories);

        return categoriesDTO;
    }

    // ======================================
    // =      Product Business methods     =
    // ======================================
    public ProductDTO createProduct(final ProductDTO productDTO) throws CheckException {

//        if (productDTO == null)
//            throw new CheckException("Product object is null");
//        if (productDTO.getCategoryDTO() == null || "".equals(productDTO.getCategoryDTO()))
//            throw new CheckException("Invalid category id");
//
//        // Finds the linked object
//        Category category = categoryDAO.findById(productDTO.getCategoryDTO().getId()).get();

        // Transforms DTO into domain object
        final Product product = new Product();

        // Creates the object
        productDAO.save(product);

        // Transforms domain object into DTO
        final ProductDTO result = productToDTO.transformProduct2DTO(product);

        return result;
    }

    public ProductDTO findProduct(final Long productId) throws FinderException, CheckException {

        checkId(productId);

        // Finds the object
        final Product product = productDAO.findById(productId).get();

        // Transforms domain object into DTO
        final ProductDTO productDTO = productToDTO.transformProduct2DTO(product);

        return productDTO;
    }

    public void deleteProduct(final Long productId) throws RemoveException, CheckException {

        checkId(productId);

        // Checks if the object exists
        productDAO.findById(productId);

        // Deletes the object
        productDAO.deleteById(productId);
    }

    public void updateProduct(final ProductDTO productDTO) throws UpdateException, CheckException {

        if (productDTO == null)
            throw new CheckException("Product object is null");

        checkId(productDTO.getId());
//        if (productDTO.getCategoryDTO().getId() == null)
//            throw new CheckException("Invalid Category");
//
//        Product product = null;
//
//        // Checks if the object exists
//        product = productDAO.findById(productDTO.getId()).get();
//
//        // Finds the linked object
//        Category category = categoryDAO.findById(productDTO.getCategoryDTO().getId()).get();
        Category category = null;
        Product product = null;
        // Transforms DTO into domain object
        product.setName(productDTO.getName());
        product.setDescription(productDTO.getDescription());
//        product.setSubCategory(Category(category);

        // Updates the object
        productDAO.saveAndFlush(product);
    }

    public List<ProductDTO> findProducts() throws FinderException {

        // Finds all the objects
        final List<Product> products = productDAO.findAll();

        // Transforms domain objects into DTOs
        final List<ProductDTO> productsDTO = productToDTO.transformProducts2DTOs(products);

        return productsDTO;
    }

    public List<ProductDTO> findProductsByCategoryId(final Long categoryId) throws FinderException, CheckException {

        checkId(categoryId);

        //TODO
        // Finds all the products
        final List<Product> products = new ArrayList<>();
//                productDAO.findAllInCategory(categoryId);

        // Transforms domain objects into DTOs
        List<ProductDTO> productsDTO = productToDTO.transformProducts2DTOs(products);

        return productsDTO;
    }

    // ======================================
    // =        Item Business methods       =
    // ======================================
    public ItemDTO createItem(final ItemDTO itemDTO) throws CreateException, CheckException {

        if (itemDTO == null)
            throw new CheckException("Item object is null");

        if (itemDTO.getProductDTO().getId() == null)
            throw new CheckException("Invalid Product id");
        checkId(itemDTO.getProductDTO().getId());

        // Finds the linked object
        Product product = null;
        product = productDAO.findById(itemDTO.getProductDTO().getId()).get();

        // Transforms DTO into domain object
//        final Item item = new Item(itemDTO.getId(), itemDTO.getName(), itemDTO.getUnitCost(), itemDTO.getStock(), product);
        final Item item = new Item();

        item.checkData();

        // Creates the object
        itemDAO.save(item);

        // Transforms domain object into DTO
        final ItemDTO result = transformItem2DTO(item);

        return result;
    }

    public ItemDTO findItem(final Long itemId) throws FinderException, CheckException {

        checkId(itemId);

        // Finds the object
        final Item item = itemDAO.findById(itemId).get();

        // Retreives the data for the linked object
        Product product = productDAO.findById(item.getProduct().getId()).get();
        item.setProduct(product);

        // Transforms domain object into DTO
        final ItemDTO itemDTO = transformItem2DTO(item);

        return itemDTO;
    }

    public void deleteItem(final Long itemId) throws RemoveException, CheckException {

        checkId(itemId);

        // Checks if the object exists
        itemDAO.findById(itemId);

        // Deletes the object
        itemDAO.deleteById(itemId);
    }

    public void updateItem(final ItemDTO itemDTO) throws UpdateException, CheckException {

        if (itemDTO == null)
            throw new UpdateException("Item object is null");

        checkId(itemDTO.getId());
        if (itemDTO.getProductDTO().getId() == null)
            throw new CheckException("Invalid Product in Item");

        Item item = null;

        // Checks if the object exists
        item = itemDAO.findById(itemDTO.getId()).get();

        // Finds the linked object
        Product product = null;
        product = productDAO.findById(itemDTO.getProductDTO().getId()).get();

        // Transforms DTO into domain object
        item.setName(itemDTO.getName());
        item.setUnitCost(itemDTO.getUnitCost());
        item.setProduct(product);

        item.checkData();

        // Updates the object
        itemDAO.saveAndFlush(item);
    }

    public List<ItemDTO> findItems() throws FinderException {

        // Finds all the objects
        final List<Item> items = itemDAO.findAll();

        // Transforms domain objects into DTOs
        final List<ItemDTO> itemsDTO = transformItems2DTOs(items);


        return itemsDTO;
    }

    public List<ItemDTO> findItemsByProductId(final Long productId) throws FinderException, CheckException {

        checkId(productId);

        // Finds all the items
        final List<Item> items = new ArrayList<>();
//                itemDAO.findAllInProduct(productId);

        // Transforms domain objects into DTOs
        final List<ItemDTO> itemsDTO = transformItems2DTOs(items);

        return itemsDTO;
    }

    public List<ItemDTO> searchItems(final String keyword) throws FinderException {

        // Search all the items
        final List<Item> items = new ArrayList<>();
//                itemDAO.search(keyword);

        // Transforms domain objects into DTOs
        final List<ItemDTO> itemsDTO = transformItems2DTOs(items);

        return itemsDTO;
    }

    // ======================================
    // =          Private Methods           =
    // ======================================

    // Item
    private ItemDTO transformItem2DTO(final Item item) {
        final ItemDTO itemDTO = new ItemDTO();
        itemDTO.setId(item.getId());
        itemDTO.setName(item.getName());
        itemDTO.setUnitCost(item.getUnitCost());
        itemDTO.setQty(item.getQty());
        // Retreives the data for the linked object
        Product product = null;
        product = productDAO.findById(item.getProduct().getId()).get();
        itemDTO.getProductDTO().setId(product.getId());
        return itemDTO;
    }

    private List<ItemDTO> transformItems2DTOs(final List<Item> items) {
        final List<ItemDTO> itemsDTO = new ArrayList();
        for (Iterator iterator = items.iterator(); iterator.hasNext(); ) {
            final Item item = (Item) iterator.next();
            itemsDTO.add(transformItem2DTO(item));
        }
        return itemsDTO;
    }

    /**
     * Check id.
     *
     * @param id the id
     * @throws CheckException the check exception
     */
    protected void checkId(final Long id) throws CheckException {
        if (id == null)
            throw new CheckException("Id should not be null or empty");
    }
}
