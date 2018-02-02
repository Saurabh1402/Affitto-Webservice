package in.co.massacre.affittowebservice.service.interfaces;

import in.co.massacre.affittowebservice.model.AdCategory;
import in.co.massacre.affittowebservice.model.AdSubCategory;

import java.util.List;

/**
 * Created by saurabh on 2/11/17.
 */
public interface AdSubCategoryService {
    List<AdSubCategory> findAllAdSubCategories();
    List<AdSubCategory> findByAdCategory(AdCategory adCategory);
    List<AdSubCategory> findByAdCategoryId(long adCategoryId);
    AdSubCategory findById(long id);

}
