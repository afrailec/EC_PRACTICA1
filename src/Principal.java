public class Principal {
    public static void main(String[] args) {
        Alumno felipe = new Alumno("Felipe Arias González", "aa1253", 3.50);
        Alumno manuel = new Alumno("Manuel García Sacedón", "ax0074", 8.35);
        Alumno margarita = new Alumno("Margarita López Medina", "mj7726", 7.70);
        Alumno estela = new Alumno("Estela Sánchez Arellano", "bc2658", 6.75);

        felipe.matricularAsignatura("Estructura de Datos");
        manuel.matricularAsignatura("Estructura de Datos");
        margarita.matricularAsignatura("Estructura de Datos");
        estela.matricularAsignatura("Estructura de Datos");
        estela.matricularAsignatura("Algebra");
        estela.matricularAsignatura("Estructuras de Computadores");

        System.out.println("---------------------------------------------------");
        estela.mostrarAsignaturas();
        System.out.println("---------------------------------------------------");
        felipe.mostrarAlumno();
        System.out.println("---------------------------------------------------");
        estela.mostrarAsignaturas();

    }
}
