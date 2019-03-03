package net.unadeca.testbasedatos.database.models;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

import net.unadeca.testbasedatos.database.TestDatabase;

@Table(database = TestDatabase.class)
public class Arbolito extends BaseModel {

    @Column
    @PrimaryKey(autoincrement = true)
    public int id;

    @Column
    public int altura;

    @Column
    public String fecha_plantado;

    @Column
    public String fecha_ultima_revision;

    @Column
    public String plantado_por;
}
