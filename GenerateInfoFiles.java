public class GenerateInfoFiles {

    // Método para generar un archivo plano pseudoaleatorio
    public static void generateFile(String filename, int numLines) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));

            // Generar datos pseudoaleatorios y escribirlos en el archivo
            Random random = new Random();
            for (int i = 0; i < numLines; i++) {
                int randomValue = random.nextInt(100); // Ejemplo de valor pseudoaleatorio entre 0 y 99
                writer.write(Integer.toString(randomValue));
                writer.newLine();
            }

            writer.close();
            System.out.println("Archivo " + filename + " generado exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo " + filename + ": " + e.getMessage());
        }
    }

    // Método main para ejecutar el programa
    public static void main(String[] args) {
        // Especifica el nombre del archivo y el número de líneas
        String filename = "datos.txt";
        int numLines = 100; // Por ejemplo, generará 100 números pseudoaleatorios

        // Generar el archivo
        generateFile(filename, numLines);
    }
}
