package com.stackroute.hackathon;

public class TextEditor {

        String text;
        String author;
        int length;

        String getText() {
            return text;
        }

        void setText(String s) {
            text = s;
        }

        String getAuthor() {
            return author;
        }

        void setAuthor(String s) {
            author = s;
        }

        int getLength() {
            return length;
        }

        void setLength(int k) {
            length = k;
        }

    }

        class ChangeTheText extends TextEditor {

            void allLettersToUpperCase() {
                System.out.println("changing to uppercase");
            }


            void findSubTextAndDelete(String s) {
                System.out.println("finding subtext and deleting");
            }
        }


        class PrintingText extends ChangeTheText {
            void printText() {
                allLettersToUpperCase();
                findSubTextAndDelete("stackroute");
                System.out.println("printing");


            }
        }

        class Text1 {
            public static void main(String[] args) {
                PrintingText text = new PrintingText();
                text.printText();
            }
}
