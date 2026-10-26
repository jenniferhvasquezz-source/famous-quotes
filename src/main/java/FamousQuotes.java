public class FamousQuotes {
    public static void main(String[] args) {
        // 1. Create an array of Strings to store 10 favorite quotes
        String[] quotes = {
                "Never let the fear of striking out keep you from playing the game.- Babe Ruth",
                " Life is short, Break the rules. Forgive quickly, Kiss slowly. Love truly. Laugh uncontrollably And never regret ANYTHING That makes you smile. - Mark Twain"
                " Life is too deep for words, so don't try to describe it, just live it. - C.S. Lewis"
                " The key to lasting happiness is to stop looking for it, and to know that you already have it. - Deepak Chopra"
                " No one can make you feel inferior without your consent. - Eleanor Roosevelt"
                "No one is you, and that is your superpower. - Dave Grohl"
                " She remembered who she was and the game changed. -Lalah Delian"
                "There is no limit to what we, as women, can accomplish - Michelle Obama"
                "We all have purpose even if we're still striving to understand what that is - Angela Basset"
                " Do the thing you think you cannot do. - Eleanor Roosevelt"
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please eneter a number between 1 and 10 to see a quote: ");
        int choice = scanner.nextInt();

        // Without try/catch, entering a number outside 1-10 throws an ArrayIndexOutOfBoundsException
        System.out.println(quotes[choice - 1]);

        }

    }
}
