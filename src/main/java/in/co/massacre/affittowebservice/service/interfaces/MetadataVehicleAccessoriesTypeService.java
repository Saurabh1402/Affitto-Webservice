package in.co.massacre.affittowebservice.service.interfaces;

import in.co.massacre.affittowebservice.model.metadata.MetadataVehicleAccessoriesType;

import java.util.List;

/**
 * Created by saurabh on 7/11/17.
 */
public interface MetadataVehicleAccessoriesTypeService {
    List<MetadataVehicleAccessoriesType> findAll();
    MetadataVehicleAccessoriesType findById(long id);

}
