package fundamentosHerencia.ejercicio024StringBuilder;

public class ReporteListaTareas extends Reporte{
    private String[] tareas = new String[10];
    private boolean[] completadas = new boolean[10];

    public ReporteListaTareas(String titulo, String[] tareas, boolean[] completadas) {
        super(titulo);
        this.tareas = tareas;
        this.completadas = completadas;
    }

    @Override
    public String generarContenido() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < tareas.length; i++){
            if(completadas [i]){
                sb.append(tareas[i])
                        .append(" ")
                        .append("| Estado: ")
                        .append("Tarea completada.")
                        .append("\n");
            }else{
                sb.append(tareas[i])
                        .append(" ")
                        .append("| Estado: ")
                        .append("Tarea pendiente.")
                        .append("\n");
            }
        }
        return sb.toString();


    }
}
