package in.co.massacre.affittowebservice.service.interfaces;

import in.co.massacre.affittowebservice.model.metadata.MetadataLocality;
import in.co.massacre.affittowebservice.model.metadata.MetadataPincode;
import in.co.massacre.affittowebservice.model.metadata.MetadataState;

import java.util.List;

/**
 * Created by saurabh on 7/11/17.
 */
public interface MetadataLocalityService {
    MetadataLocality findByPincode(MetadataPincode pincode);
    List<MetadataState> findByTag(String tag, int page);
}
