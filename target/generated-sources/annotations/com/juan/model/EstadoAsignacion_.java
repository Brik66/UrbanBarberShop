package com.juan.model;

import com.juan.model.Cita;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-07-16T18:03:56")
@StaticMetamodel(EstadoAsignacion.class)
public class EstadoAsignacion_ { 

    public static volatile SingularAttribute<EstadoAsignacion, String> descripcion;
    public static volatile SingularAttribute<EstadoAsignacion, Integer> idEstadoAsignacion;
    public static volatile ListAttribute<EstadoAsignacion, Cita> citaList;

}