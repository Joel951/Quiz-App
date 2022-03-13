package com.example.offlinequiz;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionsList> javaQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionsList class and pass aquestions along with options and answer
        final QuestionsList question1 = new QuestionsList("What is the size of int variable", "16 bit", "8 bit", "64 bit", "32 bit", "32 bit", "");
        final QuestionsList question2 = new QuestionsList("What is the default value of boolean variable", "true", "false", "null", "not defined", "false", "");
        final QuestionsList question3 = new QuestionsList("What of the following is the default value of an instance variable ?", "Depends on type of variable", "null", "0", "not assigned", "Depends on type of variable", "");
        final QuestionsList question4 = new QuestionsList("Which is the reserved word in the java programming language?", "method", "native", "reference", "array", "native", "");
        final QuestionsList question5 = new QuestionsList("Which of the follwing is NOT a keyword or reserves word in Java", "if", "then", "goto", "while", "then", "");
        final QuestionsList question6 = new QuestionsList("Which is the reserved word in the java programming language?", "public double method()", "public final double method()", "static void method(double dl)", "protected void method(double dl)", "public double method()", "");
        final QuestionsList question7 = new QuestionsList("In which memory a String is stored, when we create a string using new operator?", "Stack", "String memory", "Heap memory", "Random storage space", "Heap memory", "");
        final QuestionsList question8 = new QuestionsList("Which keyword is used for accessing the features of a package?", "Package", "Import", "Extends", "Export", "Import", "");
        final QuestionsList question9 = new QuestionsList("In java, jar stands for_____.", "Java Archive Runner", "Java Application Resource", "Java Application Runner", "None of the above", "None of the above", "");
        final QuestionsList question10 = new QuestionsList("What is the initial quantity of the ArrayList list?", "5", "10", "0", "100", "10", "");



        //add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);


        return questionsLists;
    }

    private static List<QuestionsList> phpQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionsList class and pass aquestions along with options and answer
        final QuestionsList question1 = new QuestionsList("What does Php stands for?", "Professional Home Page", "Hypertext Processor", "Pretext Hypertext Processor", "Preprocessor Home Page", "Hypertext Preprocessor", "");
        final QuestionsList question2 = new QuestionsList("Who is the father of Php?", "Rasmus Lerdorf", "William Makepiece", "Drek Kolkevi", "List Barely", "Rasmus Lerdorf", "");
        final QuestionsList question3 = new QuestionsList("Php file have a default file extension of?", ".html", ".php", ".xml", ".java", ".php", "");
        final QuestionsList question4 = new QuestionsList("A Php script should start with _____ and end with ____", "<php>", "<php />", "<? ?>", "<?php ?>", "<?php ?>", "");
        final QuestionsList question5 = new QuestionsList("Which version of Php introduced Try/catch Exception?", "PHP 4", "PHP 5", "PHP 6", "PHP 5.3", "PHP 5", "");
        final QuestionsList question6 = new QuestionsList("if $a =12 what will be returned when ($a == 12)? 5 : 1 is executed?", "12", "1", "5", "error", "5", "");
        final QuestionsList question7 = new QuestionsList("Which of the following function is used to find files in PHP?", "glob()", "fold()", "file()", "None of the above", "glob()", "");
        final QuestionsList question8 = new QuestionsList("Which of the following function is used to set cookie in PHP?", "createcookie()", "makecookie()", "setcookie()", "None of the above", "setcookie()", "");
        final QuestionsList question9 = new QuestionsList("Which of the following function is used to unset a variable in PHP?", "delete()", "unset()", "unlink()", "None of the above", "unset()", "");
        final QuestionsList question10 = new QuestionsList("Which of the following function converts a string to all uppercase?", "upper()", "uppercase()", "struppercase()", "strtoupper()", "strtoupper()", "");

        //add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);



        return questionsLists;
    }

    private static List<QuestionsList> htmlQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionsList class and pass aquestions along with options and answer
        final QuestionsList question1 = new QuestionsList("HTML stands for?", "Hyper Text Markup Language", "HighText Machine Language", "HyperText and links Markup Language", "None of these", "Hyper Text Markup Language", "");
        final QuestionsList question2 = new QuestionsList("How to create a hyperlink in HTML?", "<a href = www.javatpoint.com> javaTpoint.com </a>", "<a url = www.javatpoint.com javaTpoint.com /a>", "<a link = www.javatpoint.com> javaTpoint.com </a>", "<a> www.javatpoint.com <javaTpoint.com /a>", "<a href = www.javatpoint.com> javaTpoint.com </a>", "");
        final QuestionsList question3 = new QuestionsList("How to add a background color in HTML?", "<marquee bg color: \"red\">", "<marquee bg-color = \"red\">", "<marquee bgcolor = \"red\">", "<marquee color = \"red\">", "<marquee color = \"red\">", "");
        final QuestionsList question4 = new QuestionsList("<input> is ? ", "a format tag.", "an empty tag.", "None of the above", "All of the above", "an empty tag.", "");
        final QuestionsList question5 = new QuestionsList("Which of the following attribute is used to provide a unique name to an element?", "class", "id", "type", "None of the above", "id", "");
        final QuestionsList question6 = new QuestionsList("Which of the following is the container for <tr>, <th>, and <td> ?", "<data>", "<table>", "<group>", "All of the above", "<table>", "");
        final QuestionsList question7 = new QuestionsList("Which of the following HTML attribute is used to define inline styles?", "style", "type", "class", "None of the above", "style", "");
        final QuestionsList question8 = new QuestionsList("A program in HTML can be rendered and read by -", "Web browse", "Server", "Interpreter", "None of the above", "Web browse", "");
        final QuestionsList question9 = new QuestionsList("To show deleted text, which HTML element is used?", "<del>", "<em>", "<strong>", "<ins>", "<del>", "");
        final QuestionsList question10 = new QuestionsList("Which HTML element is used for YouTube videos?", "<samp>", "<small>", "<frame>", "<iframe>", "<iframe>", "");





        //add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);


        return questionsLists;
    }

    private static List<QuestionsList> androidQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionsList class and pass aquestions along with options and answer
        final QuestionsList question1 = new QuestionsList("Under which of the following Android is licensed?", "OSS", "Sourceforge", "Apache/MIT", "None of these", "Apache/MIT", "");
        final QuestionsList question2 = new QuestionsList("APK stands for?", "Android Phone Kit", "Android Page Kit", "Android Package Kit", "None of the above", "Android Package Kit", "");
        final QuestionsList question3 = new QuestionsList("What does API stand for?", "Application Programming Interface", "Android Programming Interface", "Android Page Interface", "Application Page Interface", "Application Programming Interface", "");
        final QuestionsList question4 = new QuestionsList("Which of the following kernel is used in Android?", "MAC", "Windows", "Linux", "Redhat", "Linux", "");
        final QuestionsList question5 = new QuestionsList("Which of the following is the parent class of Activity?", "context", "object", "contextThemeWrapper", "None of the above", "contextThemeWrapper", "");
        final QuestionsList question6 = new QuestionsList("What is contained in manifest.xml?", "Source code", "List of strings used in the app", "Permission that the application requires", "All of the above", "Permission that the application requires", "");
        final QuestionsList question7 = new QuestionsList("Which video format is not supported by Android", "MP4", "AVI", "MIDI", "MPEG", "AVI", "");
        final QuestionsList question8 = new QuestionsList("For which of the following Android is mainly developed?", "Servers", "Desktops", "Laptops", "Mobile devices", "Mobile devices", "");
        final QuestionsList question9 = new QuestionsList("ADB stands for -", "Android debug bridge", "Android delete bridge", "Android destroy bridge", "None of the above", "Android debug bridge", "");
        final QuestionsList question10 = new QuestionsList("We require an AVD to create an emulator. What does AVD stand for?", "Android Virtual device", "Android Virtual display", "Active Virtual display", "Active Virtual device", "Android Virtual device", "");





        //add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);


        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName) {
        switch (selectedTopicName) {
            case "Java":
                return javaQuestions();
            case "Php":
                return phpQuestions();
            case "Android":
                return androidQuestions();
            default:
                return htmlQuestions();
        }



    }

}




