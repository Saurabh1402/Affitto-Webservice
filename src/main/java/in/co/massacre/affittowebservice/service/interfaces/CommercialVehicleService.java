package in.co.massacre.affittowebservice.service.interfaces;

import in.co.massacre.affittowebservice.model.Advertisement;
import in.co.massacre.affittowebservice.model.CommercialVehicle;
import in.co.massacre.affittowebservice.model.metadata.MetadataCommercialVehicleFuelType;
import in.co.massacre.affittowebservice.model.metadata.MetadataCommercialVehicleType;

import java.util.List;

/**
 * Created by saurabh on 7/11/17.
 */
public interface CommercialVehicleService {
    List<CommercialVehicle> findAll(int page);
    CommercialVehicle findById(long id);
    CommercialVehicle findByAdvertisement(Advertisement advertisement);
    List<CommercialVehicle> findBycommercialVehicleType(MetadataCommercialVehicleType commercialVehicleType, int page);
    List<CommercialVehicle> findByCommercialVehicleFuelType(MetadataCommercialVehicleFuelType commercialVehicleFuelType, int page);
    List<CommercialVehicle> findByAfterYearOfRegistration(int yearOfRegistration, int page);


}
