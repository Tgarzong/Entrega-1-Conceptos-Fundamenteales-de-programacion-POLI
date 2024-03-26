public class GenerateInfoFiles {

    // Method to generate a pseudo-random flat file
    public static void generateFile(String filename, int numLines) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));

            // Generate pseudo-random data and write it to the file
            Random random = new Random();
            for (int i = 0; i < numLines; i++) {
                int randomValue = random.nextInt(100); // Example of pseudo-random value between 0 and 99
                writer.write(Integer.toString(randomValue));
                writer.newLine();
            }

            writer.close();
            System.out.println("File " + filename + " sucessfully generated.");
        } catch (IOException e) {
            System.err.println("Error writing to file " + filename + ": " + e.getMessage());
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Specify file name and number of lines
        String filename = "data.txt";
        int numLines = 100; // For example, will generate 100 pseudo-random numbers

        // Generate the fileS
        generateFile(filename, numLines);
    }
}
