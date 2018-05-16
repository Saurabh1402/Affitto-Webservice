package in.co.massacre.affittowebservice.service.filter;

import in.co.massacre.affittowebservice.model.metadata.MetadataCarBrandName;
import in.co.massacre.affittowebservice.model.metadata.MetadataCarFuelType;
import in.co.massacre.affittowebservice.model.metadata.MetadataCarModelName;
import in.co.massacre.affittowebservice.model.metadata.MetadataColor;

import java.util.List;

/**
 * Created by saurabh on 23/1/18.
 */
public class CarFilter {

    public long greateThanKMDriven;
    public int afterYearOfRegistration;
    public List<MetadataColor> colors;
    public List<MetadataCarFuelType> fuelTypes;
    public List<MetadataCarBrandName> brandNames;
    public List<MetadataCarModelName> modelNames;
}
