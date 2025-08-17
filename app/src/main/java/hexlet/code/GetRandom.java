package hexlet.code;

public class GetRandom {
    public static int generateRandomNumber(int num) {  // Должен быть static!
        return (int) (Math.random() * num) + 1;
    }
}