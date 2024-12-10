package ge.automation;

public class Main {

    public static void main(String[] args) {

        // 1 დავალება
        Vowel counter = new Vowel(); // Vowel კლასის ობიექტი, რომელიც დაითვლის ხმოვნებს
        String string = "SoftwareTesting"; // სტრინგი სადაც უნდა დავთვალოთ ხმოვნები
        string = string.toLowerCase();
        int count = counter.countVowel(string);
        System.out.println("ხმოვნების რაოდენობა: " + count);


        // 2 დავალება
        Replace replacer = new Replace();
        String inputString = "AlphaAndBetaTesters";
        String resultA = replacer.replaceSymbolA(inputString); // მეთოდი რომელიც შეცვლის ყველა "a" სიმბოლოს "z" -თი
        System.out.println("შეცვლილი 'a': " + resultA);
        String resultB = replacer.replaceSymbolB(inputString); // მეთოდი რომელიც შეცვლის ყველა "b" სიმბოლოს "w" -თი
        System.out.println("შეცვლილი 'b': " + resultB);


        // 3 დავალება
        int[] array = {18, -3, 5, -7, 6, 89, 13, 0, -89}; // მასივის ელემენტები
        int classify; // ცვლადი, რომელიც გამოიყენება ელემენტების ადგილების გადასანაცვლებლად
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) { // ბოლო ელემენტი ყოველი პასის შემდეგ დალაგებული იქნება
                if (array[j] > array[j + 1]) {
                    // ადგილების გაცვლის ლოგიკა
                    classify = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = classify;
                }
            }
        }

        // მასივის დაბეჭდვა ყველა ელემენტით
        System.out.print("მასივი: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "; ");
        }
    }
}

// 1 დავალება
abstract class Abstract { // აბსტრაქტული კლასი, რომელიც განსაზღვრავს ხმოვნების დათვლის მეთოდს
    abstract int countVowel(String input); // მეთოდი იღებს სტრინგს და უნდა დააბრუნოს ხმოვნების რაოდენობა
}

class Vowel extends Abstract { // კლასი რომელიც ანხორციელებს countVowel მეთოდის იმპლემენტაციას
    @Override
    int countVowel(String input) {
        int vowelCount = 0; // ცვლადი, რომელიც ინახავს ხმოვნების რაოდენობას
        for (char character : input.toCharArray()) {
            if ("aeiou".indexOf(character) != -1) {
                vowelCount++;
            }
        }
        return vowelCount;
    }
}

// 2 დავალება
class Replace implements ReplaceSymbolA, ReplaceSymbolB {
    @Override
    public String replaceSymbolA(String input) { // მეთოდი replaceSymbolA: ყველა 'a' სიმბოლო შეიცვლება 'z' სიმბოლოდ
        return input.replaceAll("a", "z");
    }

    @Override
    public String replaceSymbolB(String input) { // მეთოდი replaceSymbolB: ყველა 'b' სიმბოლო შეიცვლება 'w' სიმბოლოდ
        return input.replaceAll("b", "w");
    }
}

interface ReplaceSymbolA {
    String replaceSymbolA(String input);
}

interface ReplaceSymbolB {
    String replaceSymbolB(String input);
}
