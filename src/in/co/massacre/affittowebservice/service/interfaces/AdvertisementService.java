package in.co.massacre.affittowebservice.service.interfaces;

import in.co.massacre.affittowebservice.model.AdCategory;
import in.co.massacre.affittowebservice.model.AdContact;
import in.co.massacre.affittowebservice.model.AdSubCategory;
import in.co.massacre.affittowebservice.model.Advertisement;
import in.co.massacre.affittowebservice.model.metadata.MetadataCity;
import in.co.massacre.affittowebservice.model.metadata.MetadataPincode;
import in.co.massacre.affittowebservice.model.metadata.MetadataState;

import java.util.List;

/**
 * Created by saurabh on 31/10/17.
 */
public interface AdvertisementService {
    List<Advertisement> findAll(int page);
    Advertisement findById(long id);
    Advertisement save(Advertisement advertisement);
    List<Advertisement> findByUserCurrentLocation(long longitude,long latitude,int page);
    List<Advertisement> findByCity(MetadataCity city, int page);
    List<Advertisement> findByCity(long cityId,int page);
    List<Advertisement> findByState(MetadataState state, int page);
    List<Advertisement> findByState(long stateId,int page);
    List<Advertisement> findByPincode(MetadataPincode pincode, int page);
    List<Advertisement> findByPincode(long pincodeId,int page);
    List<Advertisement> findByCategory(AdCategory adCategory,int page);
    List<Advertisement> findByCategory(long adCategoryId,int page);
    List<Advertisement> findBySubCategory(AdSubCategory adSubCategory,int page);
    List<Advertisement> findBySubCategory(long adSubCategoryId,int page);
    List<Advertisement> findByAdContact(AdContact adContact,int page);
    List<Advertisement> findByAdContact(long adContactId,int page);
    List<Advertisement> findByTag(String tag,int page);
}
