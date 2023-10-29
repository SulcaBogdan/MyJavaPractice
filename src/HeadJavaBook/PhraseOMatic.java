package HeadJavaBook;

public class PhraseOMatic {
    public static void main(String[] args) {

        String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};
        String[] wordListTwo = {"empowered", "sticky" , "value-added", "oriented", "centric", "distributed", "clustered", "branded" , "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
        String[] wordListThree = {"process", "tipping-point" , "solution", "arhitecture" , "core competency" , "strategy", "mindshare", "portal", "space", "vision" , "paradigm" , "mission"};


        //task 1 find how many words are in every list

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //task 2 generate 3 random numbers

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        //task 3 build a phrase

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        //task 4 print the phrase

        System.out.println(phrase);




    }
}
