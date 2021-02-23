public class Principal {
    public static void main(String[] args) {
        Alumno pepe = new Alumno("Pepe", "bb6251", 7.0);
        pepe.matricularAsignatura("Estructura de Datos");
        pepe.matricularAsignatura("Algebra");
        pepe.matricularAsignatura("Etica");
        pepe.mostrarAlumno();
        //pepe.mostrarAlumnos();
    }
}
