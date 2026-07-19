package fundamentosHerencia.ejercicio024StringBuilder;

public class ReporteFactura extends Reporte{
    private String[] productos = new String[10];
    private double[] precios = new double[10];

    public ReporteFactura(String titulo, String[] productos, double[] precios) {
        super(titulo);
        this.productos = productos;
        this.precios = precios;
    }

    @Override
    public String generarContenido() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < productos.length; i++){
            sb.append(productos[i])
                    .append(" - $")
                    .append(precios[i])
                    .append("\n");
        }
        return sb.toString();
    }
}
