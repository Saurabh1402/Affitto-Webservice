package in.co.massacre.affittowebservice.service.interfaces;

import in.co.massacre.affittowebservice.model.AdCategory;

import java.util.List;

/**
 * Created by saurabh on 2/11/17.
 */
public interface AdCategoryService {
    List<AdCategory> findAll();
    AdCategory findById(long adCategoryId);
}
