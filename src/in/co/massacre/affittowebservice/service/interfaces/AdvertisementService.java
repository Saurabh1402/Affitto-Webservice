package in.co.massacre.affittowebservice.service.interfaces;

import in.co.massacre.affittowebservice.model.AdCategory;
import in.co.massacre.affittowebservice.model.AdSubCategory;
import in.co.massacre.affittowebservice.model.Advertisement;

import java.util.List;

/**
 * Created by saurabh on 31/10/17.
 */
public interface AdvertisementService {
    public List<Advertisement> findAll();
    public Advertisement findById(long id);
    public Advertisement save(Advertisement advertisement);
    public List<Advertisement> findByCategory(AdCategory adCategory);
    public List<Advertisement> findByCategory(long adCategoryId);
    public List<Advertisement> findBySubCategory(AdSubCategory adSubCategory);
    public List<Advertisement> findBySubCategory(long adSubCategoryId);
}
