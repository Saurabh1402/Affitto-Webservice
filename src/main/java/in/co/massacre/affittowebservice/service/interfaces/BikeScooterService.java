package in.co.massacre.affittowebservice.service.interfaces;

import in.co.massacre.affittowebservice.model.Advertisement;
import in.co.massacre.affittowebservice.model.BikeScooter;
import in.co.massacre.affittowebservice.model.metadata.MetadataBikeScooterBrandName;
import in.co.massacre.affittowebservice.model.metadata.MetadataBikeScooterModelName;

import java.util.List;

/**
 * Created by saurabh on 7/11/17.
 */
public interface BikeScooterService {
    List<BikeScooter> findAll();
    BikeScooter findByAdvertisement(Advertisement advertisement);
    BikeScooter findByAdvertisementId(long advertisementId);
    List<BikeScooter> findByTag(String tag, int page);
    List<BikeScooter> findByBrandName(MetadataBikeScooterBrandName brandName, int page);
    List<BikeScooter> findByBrandNameId(long brandNameId, int page);
    List<BikeScooter> findByModelName(MetadataBikeScooterModelName modelName, int page);
    List<BikeScooter> findByModelNameId(long modelNameId, int page);

}
