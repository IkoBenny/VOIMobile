package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.VehicleOfInterest;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-07-26T23:13:31")
@StaticMetamodel(ReasonForInterest.class)
public class ReasonForInterest_ { 

    public static volatile SingularAttribute<ReasonForInterest, String> reason;
    public static volatile CollectionAttribute<ReasonForInterest, VehicleOfInterest> vehicleOfInterestCollection;
    public static volatile SingularAttribute<ReasonForInterest, String> description;

}