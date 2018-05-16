package in.co.massacre.affittowebservice.service.interfaces;

import in.co.massacre.affittowebservice.model.metadata.MetadataCity;
import in.co.massacre.affittowebservice.model.metadata.MetadataPincode;
import in.co.massacre.affittowebservice.model.metadata.MetadataState;

import java.util.List;

/**
 * Created by saurabh on 7/11/17.
 */
public interface MetadataStateService {
    MetadataState findAll();
    MetadataState findById(long stateId);
    MetadataState findByPincode(MetadataPincode pincode);
    MetadataState findByCity(MetadataCity city);
    List<MetadataState> findByTag(String tag, int page);

}
