/*How would you return a random item from an ArrayList?

Use Eliza or the Magic 8 Ball assignment.
Modify either assignment to use an ArrayList in place of an array where you need to get a random element.
How would you do this with an ArrayList?

Can you move your code to a method that returns a random element?*/

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[]args){
        // using arrays
        magicEightBall();

        // using array lists
        modifiedMagicEight();

        Random rnd = new Random();
        String replyHedge = modifiedReplyHedge(rnd);
        String replyQualifier = modifiedReplyQualifier(rnd);
    }

    public static String modifiedReplyHedge(Random rnd){
        ArrayList<String> hedges = new ArrayList<>();
        hedges.add("Please tell me more");
        hedges.add("Many of my patients tell me the same thing");
        hedges.add("It is getting late, maybe we had better quit");
        return hedges.get(rnd.nextInt(hedges.size()));
    }

    public static String modifiedReplyQualifier(Random rnd){
        ArrayList<String> qualifiers = new ArrayList<>();
        qualifiers.add("Why do you say that ");
        qualifiers.add("You seem to think that ");
        qualifiers.add("So, you are concerned that ");
        return qualifiers.get(rnd.nextInt(qualifiers.size()));
    }

    public static String replyHedge(){
        Random rnd = new Random();
        String[] hedges = {"Please tell me more",
                "Many of my patients tell me the same thing",
                "It is getting late, maybe we had better quit"};
        int index = rnd.nextInt(hedges.length);
        return hedges[index];
    }

    public static String replyQualifier(String str){
        Random rnd = new Random();
        String replacedStr = ""; //= replaceWords(str);
        String[] qualifiers = {"Why do you say that ",
                "You seem to think that ",
                "So, you are concerned that "};
        int index = rnd.nextInt(qualifiers.length);
        String newStr = qualifiers[index] + replacedStr;
        return newStr;
    }

    public static String modifiedMagicEight(){
        ArrayList<String> responses = new ArrayList<>();
        responses.add("It is certain");
        responses.add("It is decidedly so");
        responses.add("Without a Doubt");
        responses.add("Yes definitely");
        responses.add("You may rely on it");
        responses.add("As I see it, yes");
        responses.add("Most likely");
        responses.add("Outlook good");
        responses.add("Yes");
        responses.add("Signs point to yes");
        responses.add("Reply hazy try again");
        responses.add("Ask again later");
        responses.add("Better not tell you now");
        responses.add("Cannot predict now");
        responses.add("Concentrate and ask again");
        responses.add("Don't count on it");
        responses.add("My reply is no");
        responses.add("My sources say no");
        responses.add("Outlook not so good");
        responses.add("Very doubtful");

        Random rnd = new Random();
        return responses.get(rnd.nextInt(responses.size()));
    }

    public static String magicEightBall(){
        // Create an array of all possible responses
        String[] str = new String[]{"It is certain", "It is decidedly so", "Without a Doubt", "Yes definitely",
                "It is decidedly so", "Without a doubt", "Yes definitely", "You may rely on it",
                "As I see it, yes", "Most likely", "Outlook good", "Yes", "Signs point to yes", "Reply hazy try again",
                "Ask again later", "Better not tell you now", "Cannot predict now", "Concentrate and ask again",
                "Don't count on it", "My reply is no", "My sources say no", "Outlook not so good", "Very doubtful"};

        // Generate a random number between 1 and 20
        int number = 0;
        Random rnd = new Random();
        number = rnd.nextInt(20)+1;

        // Get a random selection from the responses
        return str[number];
    }

}
