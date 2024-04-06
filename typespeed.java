import java.util.*;

public class typespeed {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        List<String> wordList = Arrays.asList(
            "example", "random", "words", "test", "java", "keyboard", "speed", "typing",
            "practice", "accuracy", "efficient", "performance", "measure", "computer", "language"
        );

       
        int numberOfWords = 5;

        
        List<String> teste = new ArrayList<>();
        for (int i = 0; i < numberOfWords; i++) {
            int randomIndex = rd.nextInt(wordList.size());
            teste.add(wordList.get(randomIndex));
        }

        System.out.println("Type the following words as fast as you can and press Enter after each one:");
        System.out.println(teste);

        int correctCharsCount = 0;
        long startTime = System.currentTimeMillis();

        for (String word : teste) {
            System.out.print(word + ": ");
            String userInput = sc.nextLine().trim();
            if (userInput.equals(word)) {
                correctCharsCount += word.length();
            }
        }

        long endTime = System.currentTimeMillis();
        double timeTaken = (endTime - startTime) / 60000.0; 

        double wpm = (correctCharsCount / 5.0) / timeTaken;
        System.out.printf("Your typing speed is %.2f words per minute.\n", wpm);
    }
}
