/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unigis;

import javax.xml.datatype.XMLGregorianCalendar;
//import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Properties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeFactory;

/**
 *
 * @author Gabriel Valenzuela
 */
public class Unigis {

    /**
     * @param args the command line arguments
     */
    static String cadena = "";

    static String id = "";
    static String dominio = "";
    static String nroSerie = "";
    static String codigo = "";
    static double latitud = 0;
    static double longitud = 0;
    static double altitud = 0;
    static double velocidad = 0;
    static double rumbo = 0;

    static XMLGregorianCalendar fechaHoraEvento;
    static XMLGregorianCalendar fechaHoraRecepcion;

    static String crudo = "";
    /*----------------------------------*/
    static String user = "";
    static String pass = "";
    static String codflota = "";
    static String db_connect_string = "";
    static String db_user = "";
    static String db_pass = "";
    static String interval1 = "";
    static String interval2 = "";
    static String[] flotas;

    /*----------------------------------*/
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Properties prop = new Properties();
        InputStreamReader input = null;
        input = new FileReader("config.properties");
        prop.load(input);

        user = prop.getProperty("user");
        pass = prop.getProperty("pass");
        codflota = prop.getProperty("codflota");
        db_connect_string = prop.getProperty("db_connect_string");
        db_user = prop.getProperty("db_user");
        db_pass = prop.getProperty("db_pass");
        interval1 = prop.getProperty("interval1");
        interval2 = prop.getProperty("interval2");
        flotas = prop.getProperty("codflota").split(",");
        System.out.println("*******************************************");
        System.out.println(prop.getProperty("user"));
        System.out.println(prop.getProperty("pass"));
        System.out.println(prop.getProperty("codflota"));
        System.out.println(prop.getProperty("db_connect_string"));
        System.out.println(prop.getProperty("db_user"));
        System.out.println(prop.getProperty("db_pass"));
        System.out.println(prop.getProperty("interval1"));
        System.out.println(prop.getProperty("interval2"));

        String FORMATER1 = "yyyy-MM-dd'T'HH:mm:ss";
        DateFormat format1 = new SimpleDateFormat(FORMATER1);

        System.out.println("*******************************************");

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection conn = null;
        Statement st, st1, st11, st111, st2, st22, st222;
        ResultSet rs, rs1, rs11, rs111, rs2, rs21, rs22, rs3;

        while (true) {
            try {

                conn = DriverManager.getConnection(db_connect_string, db_user, db_pass);
            } catch (SQLException e) {
                e.printStackTrace();
                Log.log(e.toString());
                if (conn != null) {
                    conn.close();
                }
                int c = 0;
                while (c == 0) {
                    try {
                        conn = DriverManager.getConnection(db_connect_string, db_user, db_pass);
                        c = 1;
                    } catch (SQLException s) {
                        s.printStackTrace();
                        Log.log(s.toString());
                    }
                    Thread.sleep(15000);
                }
            }

            String imei, reg = "";
            int cont = 0;
            try {
                System.out.println("*******************************************");
                System.out.println("****************Inicio App*****************");
                System.out.println("*******************************************");
                st = conn.createStatement();

                for (int i = 0; i < flotas.length; i++) {
                    System.out.println("|-------------------------------------------|");
                    System.out.println("|  Codigo Flota: " + flotas[i]);
                    System.out.println("|-------------------------------------------|");

                    String SQuery1 = "select  a.imei, b.Patente, c.CodFlota from IdVehC4 a left join Vehiculo b on a.id_veh COLLATE Latin1_General_CS_AS =b.id_veh \n"
                            + "left join FlotaVehiculo c on a.id_veh collate latin1_general_cs_as = c.id_veh where c.CodFlota in (" + flotas[i] + ")\n"
                            + "order by c.CodFlota desc";

                    rs = st.executeQuery(SQuery1);
//                 System.out.println(SQuery1);

                    while (rs.next()) {
                        cont++;
                        imei = rs.getObject(1).toString();
                        System.out.println("---------------------------------");
                        System.out.println(cont + " " + imei);

                        //[VehiculosUnigis]
                        st1 = conn.createStatement();
                        rs1 = st1.executeQuery("select * from VehiculosUnigis where imei='" + imei + "'");
                        rs1.next();

                        if (rs1.getRow() > 0) {
                            int contx = 1;
                            String cod;
                            cod = rs1.getObject(2).toString();

                            System.out.println("Ultimo cod: " + cod);
                            System.out.println("---------------------------------");

                            st2 = conn.createStatement();
                            String Query1 = "select id, fecha_ingreso from rxc4 a  where a.imei='" + imei + "' and  a.canal in (9) \n"
                                    + "and SUBSTRING(a.data,1,2) COLLATE Latin1_General_CS_AS in  ('aY')  and a.id>='" + cod + "' order by id asc";

//                            System.out.println(Query1);
                            rs2 = st2.executeQuery(Query1);
                            rs3 = rs2;
                            rs3.next();
                            if (rs3.getRow() > 0) {
                                try {
                                    while (rs2.next()) {
                                        id = rs2.getObject(1).toString();
                                        System.out.println(contx + ") " + id);

                                        st22 = conn.createStatement();

                                        String Query2 = "select case when len (c.Patente)>=3 then SUBSTRING(replace(c.Patente,'-','') , 1, len(replace(c.Patente,'-',''))-2 )+'-'+SUBSTRING( replace(c.Patente,'-','') , len(replace(c.Patente,'-',''))-1, len(replace(c.Patente,'-',''))-1 ) else c.Patente end as 'Dominio', "
                                                + "a.imei as 'NroSerie',case when canal='9' then case SUBSTRING(data,1,2) when 'aY' then '25' end end as 'Codigo' ,\n"
                                                + "SUBSTRING(dbo.TokenString(a.data,',',3),1,3)+'.'+ SUBSTRING(dbo.TokenString(a.data,',',3),4,  len(dbo.TokenString(a.data,',',3))-1) as 'lat', \n"
                                                + "SUBSTRING(dbo.TokenString(a.data,',',4),1,3)+'.'+ SUBSTRING(dbo.TokenString(a.data,',',4),4,  len(dbo.TokenString(a.data,',',4))-1)  as 'lon',\n"
                                                + "'0' as 'Altitud', dbo.TokenString(a.data,',',5) as 'vel', dbo.TokenString(a.data,',',6) as 'Rumbo',\n"
                                                + " case when   DATEDIFF ( SECOND , (convert(varchar, dateadd(HOUR,-3,'20'+SUBSTRING(dbo.TokenString(a.data,',',1),5,2)+'-'+SUBSTRING(dbo.TokenString(a.data,',',1),3,2)+'-'+SUBSTRING(dbo.TokenString(a.data,',',1),1,2)+' '+SUBSTRING(dbo.TokenString(a.data,',',2),1,2)+':'+SUBSTRING(dbo.TokenString(a.data,',',2),3,2)+':'+SUBSTRING(dbo.TokenString(a.data,',',2),5,2) ),126))\n"
                                                + "  , (SUBSTRING(a.fecha_ingreso,1,10)+'T'+ SUBSTRING(a.fecha_ingreso,12,8)) )<1 then SUBSTRING(a.fecha_ingreso,1,10)+'T'+ SUBSTRING(a.fecha_ingreso,12,8) else  convert(varchar, dateadd(HOUR,-3,'20'+SUBSTRING(dbo.TokenString(a.data,',',1),5,2)+'-'+SUBSTRING(dbo.TokenString(a.data,',',1),3,2)+'-'+SUBSTRING(dbo.TokenString(a.data,',',1),1,2)+' '+SUBSTRING(dbo.TokenString(a.data,',',2),1,2)+':'+SUBSTRING(dbo.TokenString(a.data,',',2),3,2)+':'+SUBSTRING(dbo.TokenString(a.data,',',2),5,2) ),126) end  as 'FechaHoraEvento',\n"
                                                + " case when DATEDIFF ( SECOND , (convert(varchar, dateadd(HOUR,-3,'20'+SUBSTRING(dbo.TokenString(a.data,',',1),5,2)+'-'+SUBSTRING(dbo.TokenString(a.data,',',1),3,2)+'-'+SUBSTRING(dbo.TokenString(a.data,',',1),1,2)+' '+SUBSTRING(dbo.TokenString(a.data,',',2),1,2)+':'+SUBSTRING(dbo.TokenString(a.data,',',2),3,2)+':'+SUBSTRING(dbo.TokenString(a.data,',',2),5,2) ),126))\n"
                                                + "  , (SUBSTRING(a.fecha_ingreso,1,10)+'T'+ SUBSTRING(a.fecha_ingreso,12,8)) )>1 then SUBSTRING(a.fecha_ingreso,1,10)+'T'+ SUBSTRING(a.fecha_ingreso,12,8) else  convert(varchar, dateadd(HOUR,-3,'20'+SUBSTRING(dbo.TokenString(a.data,',',1),5,2)+'-'+SUBSTRING(dbo.TokenString(a.data,',',1),3,2)+'-'+SUBSTRING(dbo.TokenString(a.data,',',1),1,2)+' '+SUBSTRING(dbo.TokenString(a.data,',',2),1,2)+':'+SUBSTRING(dbo.TokenString(a.data,',',2),3,2)+':'+SUBSTRING(dbo.TokenString(a.data,',',2),5,2) ),126) end as 'FechaHoraRecepcion',  '' as 'Crudo' \n"
                                                + "from RxC4 a inner join IdVehC4 b on a.imei  COLLATE Latin1_General_CS_AS = b.imei\n"
                                                + "left join Vehiculo c on b.id_veh COLLATE Latin1_General_CS_AS  = c.id_veh where  a.imei ='" + imei + "'  \n"
                                                + "and a.canal in (9) and SUBSTRING(a.data,1,2) COLLATE Latin1_General_CS_AS in  ('aY')  and id='" + id + "' order by id asc";

//                                        System.out.println(Query2);
                                        rs22 = st22.executeQuery(Query2);

                                        try {
                                            while (rs22.next()) {

                                                cadena = cadena + rs22.getObject(1).toString() + ",";
                                                dominio = rs22.getObject(1).toString();
                                                nroSerie = rs22.getObject(2).toString();
                                                codigo = rs22.getObject(3).toString();
                                                latitud = Double.parseDouble(rs22.getObject(4).toString());
                                                longitud = Double.parseDouble(rs22.getObject(5).toString());
                                                altitud = Double.parseDouble(rs22.getObject(6).toString());
                                                velocidad = Double.parseDouble(rs22.getObject(7).toString());
                                                rumbo = Double.parseDouble(rs22.getObject(8).toString());

                                                Date date1 = format1.parse(rs22.getObject(9).toString());
                                                fechaHoraEvento = DatatypeFactory.newInstance().newXMLGregorianCalendar(format1.format(date1));

                                                Date date2 = format1.parse(rs22.getObject(10).toString());
                                                fechaHoraRecepcion = DatatypeFactory.newInstance().newXMLGregorianCalendar(format1.format(date2));

                                                cadena = user + "," + pass + "," + dominio + "," + nroSerie + "," + codigo + "," + latitud + ","
                                                        + longitud + "," + altitud + "," + velocidad + ","
                                                        + rumbo + "," + fechaHoraEvento + "," + fechaHoraRecepcion;
                                                
//                                                System.out.println(contx + ")"+ login(user, pass ));

//                                                loginYInsertarEvento(user,pass,dominio,nroSerie,codigo,latitud, longitud,altitud ,velocidad, fechaHoraEvento,fechaHoraRecepcion);
                                                System.out.println(contx + ") " + loginYInsertarEvento(user, pass, dominio, nroSerie, codigo, latitud, longitud, altitud, velocidad, fechaHoraEvento, fechaHoraRecepcion));
                                                System.out.println(contx + ") " + cadena);
                                                Log.log(imei + "(" + contx + " " + id + ") " + cadena);

                                                cadena = "";
                                                dominio = "";
                                                nroSerie = "";
                                                codigo = "";
                                                latitud = 0;
                                                longitud = 0;
                                                altitud = 0;
                                                velocidad = 0;
                                                rumbo = 0;
//                                                fechaHoraEvento = "";
//                                                fechaHoraRecepcion = "";

                                            }
                                        } catch (Exception e) {
                                            e.printStackTrace();
                                            Log.log(imei + ") |1| " + e.toString());
                                        }

                                        contx++;
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                    Log.log(imei + ") |2| " + e.toString());
                                }

                                if (!id.isEmpty()) {

                                    try {

                                        System.out.println("Ultimo a insertar: " + id);
                                        st222 = conn.createStatement();
                                        st222.executeUpdate("update VehiculosUnigis set CodReg='" + id + "' where imei='" + imei + "'");
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                        Log.log(imei + "|3| " + e.toString());
                                        cadena = "";
                                        id = "";
                                        //*************************//
                                        dominio = "";
                                        nroSerie = "";
                                        codigo = "";
                                        latitud = 0;
                                        longitud = 0;
                                        altitud = 0;
                                        velocidad = 0;
                                        rumbo = 0;
//                                         fechaHoraEvento= "";
//                                         fechaHoraRecepcion="";
                                        crudo = "";
                                        //*************************//
                                        contx = 1;
                                    }
                                    cadena = "";
                                    id = "";
                                    contx = 1;
                                }
                                cadena = "";
                                id = "";
                                contx = 1;

                            }

                        } else {

                            try {
                                System.out.println("No se encuentra en la tabla VehiculosUnigis: el imei: " + imei);
                                st11 = conn.createStatement();
                                rs11 = st11.executeQuery("select top 1 a.id, a.imei from RxC4 a where  a.imei ='" + imei + "'  and a.canal in (9) and SUBSTRING(a.data,1,2) COLLATE Latin1_General_CS_AS in ('aY') order by id desc ");

                                rs11.next();

                                if (rs11.getRow() > 0) {
                                    String im, cod;

                                    cod = rs11.getObject(1).toString();
                                    im = rs11.getObject(2).toString();
                                    System.out.println("imei: " + im + " cod: " + cod);
                                    st111 = conn.createStatement();
                                    st111 = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                                    String Query = "insert into VehiculosUnigis (imei, codreg) values('" + im + "','" + cod + "')";
                                    st111.executeUpdate(Query);
                                } else {
                                    System.out.println("***VEHICULO SIN REGISTROS***");
                                }

                            } catch (Exception e) {
                                e.printStackTrace();
                                Log.log("Ins) " + e.toString());
                            }

                        }

                        Thread.sleep(Integer.parseInt(interval1) * 1000);

                    }
                    cont = 0;
                    Thread.sleep(Integer.parseInt(interval2) * 1000);

                }

            } catch (Exception e) {
                e.printStackTrace();
                Log.log("Inicio app) " + e.toString());
            }
        }
    }


    private static int loginYInsertarEvento(java.lang.String systemUser, java.lang.String password, java.lang.String dominio, java.lang.String nroSerie, java.lang.String codigo, double latitud, double longitud, double altitud, double velocidad, javax.xml.datatype.XMLGregorianCalendar fechaHoraEvento, javax.xml.datatype.XMLGregorianCalendar fechaHoraRecepcion) {
        com.micrologica.UnigisProduccion.Service service = new com.micrologica.UnigisProduccion.Service();
        com.micrologica.UnigisProduccion.ServiceSoap port = service.getServiceSoap12();
        return port.loginYInsertarEvento(systemUser, password, dominio, nroSerie, codigo, latitud, longitud, altitud, velocidad, fechaHoraEvento, fechaHoraRecepcion);
    }

    private static boolean login(java.lang.String systemUser, java.lang.String password) {
        com.micrologica.UnigisProduccion.Service service = new com.micrologica.UnigisProduccion.Service();
        com.micrologica.UnigisProduccion.ServiceSoap port = service.getServiceSoap12();
        return port.login(systemUser, password);
    }



    
    

}
