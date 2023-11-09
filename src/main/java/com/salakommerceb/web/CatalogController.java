package com.salakommerceb.web;

import com.google.gson.Gson;
import com.salakommerceb.common.dto.CategoryDTO;
import com.salakommerceb.common.dto.ItemDTO;
import com.salakommerceb.common.dto.ProductDTO;
import com.salakommerceb.common.exception.CheckException;
import com.salakommerceb.common.exception.CreateException;
import com.salakommerceb.common.exception.FinderException;
import com.salakommerceb.facade.ICatalogueFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * The type Catalog controller.
 */
@CrossOrigin
@RestController
@RequestMapping("/catalog")
public class CatalogController {
    /**
     * The Gson.
     */
    Gson gson = new Gson();

    @Autowired
    private ICatalogueFacade iCatalogueFacade;


    /**
     * Create category category dto.
     *
     * @param categoryDTO the category dto
     * @return the category dto
     * @throws CheckException  the check exception
     * @throws CreateException the create exception
     */
    @PostMapping("/createCategory")
    CategoryDTO createCategory(@RequestBody CategoryDTO categoryDTO) throws CheckException, CreateException {
        return iCatalogueFacade.createCategory(categoryDTO);
    }

    /**
     * Gets category.
     *
     * @param id the id
     * @return the category
     * @throws FinderException the finder exception
     * @throws CheckException  the check exception
     * @throws CreateException the create exception
     */
    @GetMapping("/getCategory/{id}")
    CategoryDTO getCategory(@PathVariable("id") long id) throws FinderException, CheckException, CreateException {
        return iCatalogueFacade.findCategory(id);
    }

    /**
     * Gets all categories.
     *
     * @param level the level
     * @return the all categories
     * @throws FinderException the finder exception
     * @throws CheckException  the check exception
     * @throws CreateException the create exception
     */
    @RequestMapping(value = "/getAllCategories/{level}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllCategories(@PathVariable String level) throws FinderException, CheckException, CreateException {
        System.out.println("level = " + level);
        return gson.toJson(iCatalogueFacade.findCategoriesByLevel(level));
    }

    /**
     * Gets all univers.
     *
     * @param level the level
     * @return the all univers
     */
    @RequestMapping(value = "/getAllUnivers/{level}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllUnivers(@PathVariable String level) {
        return gson.toJson(iCatalogueFacade.findUniversByLevel(level));
    }

    /**
     * Gets all sub cat by cat id.
     *
     * @param level the level
     * @return the all sub cat by cat id
     */
    @RequestMapping(value = "/getAllSubCatByCatId/{level}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllSubCatByCatId(@PathVariable String level) {
        return gson.toJson(iCatalogueFacade.findAllSubCategory(level));
    }

    /**
     * Gets all products.
     *
     * @return the all products
     * @throws FinderException the finder exception
     */
    @GetMapping("/getAllProducts")
    List<ProductDTO> getAllProducts() throws FinderException {
        return iCatalogueFacade.findProducts();
    }

    /**
     * Gets all products by sub cat.
     *
     * @param id the id
     * @return the all products by sub cat
     * @throws FinderException the finder exception
     * @throws CheckException  the check exception
     */
    @GetMapping("/getAllProductsBySubCat/{id}")
    List<ProductDTO> getAllProductsBySubCat(@PathVariable String id) throws FinderException, CheckException {
        return iCatalogueFacade.findProductsBySubCategoryId(Long.valueOf(id));
    }

    /**
     * Gets all products by category id.
     *
     * @param id the id
     * @return the all products by category id
     * @throws FinderException the finder exception
     * @throws CheckException  the check exception
     * @throws CreateException the create exception
     */
    @GetMapping("/getProductsById/{id}")
    ProductDTO getAllProductsByCategoryId(@PathVariable("id") long id) throws FinderException, CheckException, CreateException {
        return iCatalogueFacade.findProductsById(id);
    }

    /**
     * Gets all items.
     *
     * @return the all items
     * @throws FinderException the finder exception
     */
    @GetMapping("/getAllItems")
    List<ItemDTO> getAllItems() throws FinderException {
        return iCatalogueFacade.findItems();
    }

    /**
     * Gets all items by product id.
     *
     * @param id the id
     * @return the all items by product id
     * @throws FinderException the finder exception
     * @throws CheckException  the check exception
     * @throws CreateException the create exception
     */
    @GetMapping("/getAllItemsByProductId/{id}")
    List<ItemDTO> getAllItemsByProductId(@PathVariable("id") long id) throws FinderException, CheckException, CreateException {
        return iCatalogueFacade.findItemsByProductId(id);
    }
}
