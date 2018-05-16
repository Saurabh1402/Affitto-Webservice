package in.co.massacre.affittowebservice.service.interfaces;

import in.co.massacre.affittowebservice.model.AdImage;
import in.co.massacre.affittowebservice.model.Advertisement;

import java.util.List;

/**
 * Created by saurabh on 7/11/17.
 */
public interface AdImageService {
    List<AdImage> findAllByAdvertisement(Advertisement advertisement);
    AdImage findOneByAdvertisement(Advertisement advertisement);
}
