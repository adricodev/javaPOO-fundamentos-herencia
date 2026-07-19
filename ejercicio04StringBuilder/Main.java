package fundamentosHerencia.ejercicio024StringBuilder;

public class Main {
    public static void main(String[] args) {
        String[] productos = {"Manzana", "Pan", "Leche"};
        double[] precios = {2.5,1.2,3};


        ReporteFactura rfra1 = new ReporteFactura("Factura proforma",productos,precios);

        ReporteListaTareas pdte1 = new ReporteListaTareas("Mis tareas", new String[]{"Hacer la cama","Cita médica","Pintar el garage","Recoger trastero"},new boolean[]{true,false,true,false});

        //Aplicando métodos
        //System.out.println(rfra1.generarContenido());
        //System.out.println(pdte1.generarContenido());

        //A traves del concepto de polimorfismo
        Reporte[] reportes = {rfra1,pdte1};
        for(Reporte r : reportes){
            System.out.println(r.generarContenido());
        }

        //Más detallado y cohesionamos toda la información
        for(Reporte r: reportes){
            r.imprimir();
        }
    }
}
