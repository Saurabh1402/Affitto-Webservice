package in.co.massacre.affittowebservice.dbhelper;

/**
 * Created by saurabh on 30/9/17.
 */
public class AffittoContract {
    public static class AdvertisementContract{
        //VARIABLE
        public static final String TABLE_NAME="ADVERTISEMENT";
        public static final String ID_PK="advertisement_id_pk";
        public static final String TITLE="title";
        public static final String PRICE="price";
        public static final String DESC="description";
        public static final String TYPE="type";
        public static final String DATE_CREATED="date_created";
        public static final String LONGITUDE="longitude";
        public static final String LATITUDE="latitude";
        public static final String AD_STATUS_FK="ad_status_fk";
        public static final String CONTACT_FK="contact_fk";
        public static final String AD_CATEGORY_FK="ad_category_fk";
        public static final String AD_SUB_CATEGORY_FK="ad_sub_category_fk";

        //QUERY
        public static final String FINDALL_NAME="Advertisement.findAll",
                FINDALL_QUERY="select a from Advertisement a";
        public static final String FINDBYID_NAME="Advertisement.findById",
                FIND_BY_ID_QUERY="select a from Advertisement where a.advertisement_id_pk=:id";
        //public static final String FINDBY
    }

    // CAR ADVERTISEMENT TYPE
    public static class CarContract{
        public static final String TABLE_NAME="CAR";
        public static final String ID_PK="car_id_pk";
        public static final String KM_DRIVEN="km_driven";
        public static final String YR_OF_REG="yr_of_reg";
        public static final String COLOR_FK="color_fk";
        public static final String INSURANCE_VALIDITY="insurance_validity";
        public static final String ADVERTISEMENT_FK="advertisement_FK";
        public static final String CAR_FUELTYPE_FK="car_fueltype_fk";
        public static final String CAR_BRANDNAME_FK="car_brandname_fk";
        public static final String CAR_MODELNAME_FK="car_modelname_fk";
    }
    public static class Metadata_CarBrandNameContract{
        public static final String TABLE_NAME="METADATA_CAR_BRANDNAME";
        public static final String ID_PK="car_brandname_id_pk";
        public static final String TITLE="title";


        //QUERY
        public static final String FINDALL_NAME="MetadataCarBrandName.findAll",
                FINDALL_QUERY="select b from MetadataCarBrandName b";
    }
    public static class Metadata_CarModelNameContract{
        public static final String TABLE_NAME="METADATA_CAR_MODELNAME";
        public static final String ID_PK="car_modelname_id_pk";
        public static final String TITLE="title";
        public static final String CAR_BRAND_NAME_FK="car_brandname_fk";

        //QUERY
        public static final String FINDALL_NAME="MetadataCarModel.findAll",
                FINDALL_QUERY="select b from MetadataCarModelName b";
    }
    public static class Metadata_CarFuelTypeContract{
        public static final String TABLE_NAME="METADATA_CAR_FUELTYPE";
        public static final String ID_PK="car_fueltype_id_pk";
        public static final String TITLE="title";

        //QUERY
        public static final String FINDALL_NAME="MetadataCarFuelType.findAll",
                FINDALL_QUERY="select b from MetadataCarFuelType b";
    }

    // BIKE AND SCOOTER TYPE
    public static class BikeScooterContract{
        public static final String TABLE_NAME="BIKESCOOTER";
        public static final String ID_PK="bikescooter_id_pk";
        public static final String KM_DRIVEN="km_driven";
        public static final String YR_OF_REG="yr_of_reg";
        public static final String COLOR_FK="color_fk";
        public static final String ADVERTISEMENT_FK="advertisement_FK";
        public static final String BIKESCOOTER_FUELTYPE_FK="bikescooter_fueltype_fk";
        public static final String BIKESCOOTER_BRANDNAME_FK="bikescooter_brandname_fk";
        public static final String BIKESCOOTER_MODELNAME_FK="bikescooter_modelname_fk";

    }
    public static class Metadata_BikeScooterBrandNameContract{
        public static final String TABLE_NAME="METADATA_BIKESCOOTER_BRANDNAME";
        public static final String ID_PK="bikescooter_brandname_id_pk";
        public static final String TITLE="title";

        //QUERY
        public static final String FIND_ALL_STRING="MetadataBikeScooterBrandName.findAll";
        public static final String FIND_ALL_QUERY="select M from MetadataBikeScooterBrandName M";
    }


    public static class Metadata_BikeScooterModelNameContract{
        public static final String TABLE_NAME="METADATA_BIKESCOOTER_MODELNAME";
        public static final String ID_PK="bikescooter_modelname_id_pk";
        public static final String TITLE="title";
        public static final String BIKESCOOTER_BRANDNAME_FK="metadata_bikescooter_brandname_fk";
    }

    public static class Metadata_BikeScooterFuelTypeContract{
        public static final String TABLE_NAME="METADATA_BIKESCOOTER_FULETYPE";
        public static final String ID_PK="bikescooter_fueltype_id_pk";
        public static final String TITLE="title";
    }



    public static class CommercialVehicleContract{
        public static final String TABLE_NAME="COMMERCIAL_VEHICLE";
        public static final String ID_PK="commercialvehicle_id_pk";
        public static final String YR_OF_REG="yr_of_reg";
        public static final String ADVERTISEMENT_FK="advertisement_FK";
        public static final String COMMERCIAL_VEHICLE_FUELTYPE_FK="commercial_vehicle_fueltype_fk";
        public static final String COMMERCIAL_VEHICLE_TYPE_FK="commercial_vehicle_type_fk";
    }
    public static class Metadata_CommercialVehicleTypeContract{
        public static final String TABLE_NAME="METADATA_COMMERCIAL_VEHICLE_TYPE";
        public static final String ID_PK="commercialvehicle_type_id_pk";
        public static final String TITLE="title";
    }
    public static class Metadata_CommercialVehicleFuelTypeContract{
        public static final String TABLE_NAME="METADATA_COMMERCIAL_VEHICLE_FUELTYPE";
        public static final String ID_PK="commercialvehicle_fueltype_id_pk";
        public static final String TITLE="title";
    }

    //Vehicle Accessories
    public static class VehicleAccessoriesContract{
        public static final String TABLE_NAME="VEHICLE_ACCESSORIES";
        public static final String ADVERTISEMENT_FK="advertisement_FK";
        public static final String ID_PK="vehicleaccessories_id_pk";
        public static final String TITLE="title";
        public static final String VehicleAccessoriesTypeFK="vehicle_accessories_typ_fk";
    }
    public static class Metadata_VehicleAccessoriesTypeContract{
        public static final String TABLE_NAME="METADATA_VEHICLE_ACCESSORIES_TYPE";
        public static final String ID_PK="vehicleaccessories_type_id_pk";
        public static final String TITLE="title";
    }


    //MOBILE AND TABLET



    // GLOBAL TABLE DATA
    public static class AdImageContract{
        public static final String TABLE_NAME="AD_IMAGE";
        public static final String ID_PK="adimage_id_pk";
        public static final String TITLE="title";
        public static final String ADVERTISEMENT_FK="advertisement_fk";

        //QUERY
        public static final String FINDALL_NAME="AdImage.findAll",
                FINDALL_QUERY="select b from AdImage b";
        public static final String FINDBYADVERTISEMENT_NAME="AdImage.findByAdvertisement",
                FINDBYADVERTISEMENT_QUERY="select b from AdImage b where b.advertisement_fk=:advertisement_fk";

    }
    public static class AdCategoryContract{
        public static final String TABLE_NAME="AD_CATEGORY";
        public static final String ID_PK="adcategory_id_pk";
        public static final String TITLE="title";
        public static final String ICON_RESOURCE="icon_resource";

        //QUERY
        public static final String FINDALL_NAME="AdCategory.findAll",
                FINDALL_QUERY="select b from AdCategory b";
    }
    public static class AdSubCategoryContract{
        public static final String TABLE_NAME="AD_SUBCATEGORY";
        public static final String ID_PK="adsubcategory_id_pk";
        public static final String TITLE="title";
        public static final String AD_CATEGORY_FK="ad_category_fk";

        //QUERY
        public static final String FINDALL_NAME="AdSubCategory.findAll",
                FINDALL_QUERY="select b from AdSubCategory b";
    }
    public static class Metadata_StateContract{
        public static final String TABLE_NAME="METADATA_STATUS";
        public static final String ID_PK="adsubcategory_id_pk";
        public static final String TITLE="title";

        //QUERY
        public static final String FINDALL_NAME="MetadataState.findAll",
                FINDALL_QUERY="select b from MetadataState b";
    }

    public static class Metadata_CityContract{
        public static final String TABLE_NAME="METADATA_CITY";
        public static final String ID_PK="city_id_pk";
        public static final String TITLE="title";
        public static final String STATE_FK="state_fk";

        //QUERY
        public static final String FINDALL_NAME="MetadataCity.findAll",
                FINDALL_QUERY="select b from MetadataCity b";

        public static final String FINDBYSTATE_NAME="MetadataCity.findByState",
                FINDBYSTATE_QUERY="select b from MetadataCity b where b.state_fk=:state_fk";

    }
    public static class Metadata_LocalityContract{
        public static final String TABLE_NAME="METADATA_LOCALITY";
        public static final String ID_PK="locality_id_pk";
        public static final String TITLE="title";
        public static final String CITY_FK="CITY_fk";

    }
    public static class Metadata_PincodeContract{
        public static final String TABLE_NAME="METADATA_PINCODE";
        public static final String ID_PK="pincode_id_pk";
        public static final String TITLE="title";
        public static final String LOCALITY_FK="locality_fk";
    }
    public static class Metadata_ColorContract{
        public static final String TABLE_NAME="METADATA_COLOR";
        public static final String ID_PK="color_id_pk";
        public static final String TITLE="title";
        public static final String HEXCODE="hexcode";
    }
    public static class AdStatusContract{
        public static final String TABLE_NAME="ADSTATUS";
        public static final String ID_PK="adstatus_id_pk";
        public static final String TITLE="title";
    }
    public static class AdContactContract{
        public static final String TABLE_NAME="ADCONTACT";
        public static final String ID_PK="adcontact_id_pk";
        public static final String NAME="name";
        public static final String EMAIL="email";
        public static final String MOBILE="mobile";
        public static final String PRIVACY="privacy";
        public static final String DATE_CREATED="date_created";
        public static final String PROFILE_PHOTO_FK="profile_photo_fk";
        public static final String METADATA_LOCALIY_FK="metadata_locality_fk";
        public static final String METADATA_CITY_FK="metadata_city_fk";
        public static final String METADATA_STATE_FK="metadata_state_fk";
        public static final String METADATA_PINCODE_FK="metadata_pincode_fk";

    }
}
