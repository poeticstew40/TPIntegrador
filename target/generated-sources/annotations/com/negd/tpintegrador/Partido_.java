package com.negd.tpintegrador;

import com.negd.tpintegrador.Equipo;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-04-16T18:29:00", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Partido.class)
public class Partido_ { 

    public static volatile SingularAttribute<Partido, Equipo> equipo2;
    public static volatile SingularAttribute<Partido, Integer> golesEquipo2;
    public static volatile SingularAttribute<Partido, Equipo> equipo1;
    public static volatile SingularAttribute<Partido, Integer> golesEquipo1;
    public static volatile SingularAttribute<Partido, Integer> id;

}