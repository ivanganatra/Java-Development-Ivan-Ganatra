package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main_Class1 {

    /** Stores name of current file which is open for reading */
    static String file_name;

    /** File name storing all the words*/
    static String words_file;

    /** If eof=true, then file reading will get terminated.*/
    static boolean eof=false;

    /**Storing All the words from SampleWords into map*/
    static TreeMap<String,Integer> allWords=new TreeMap<String,Integer>();

    /**Treemap storing (Key=Word,Value=WordCount) pair present in combined all files<*/
    static TreeMap<String,Integer> allWordsCount =new TreeMap<String,Integer>();

    /**
     * Reads the word until (' ' or end of file) character doesn't occur
     * @param reader
     * @return Word
     * @throws IOException
     */
    static String readWord(BufferedReader reader) throws IOException
    {
        char character=(char)-1;

        //Stores the word
        String word="";

        //Runs until it finds the space character
        while((character=(char)reader.read())!=' ')
        {
            //At EOF - Stops storing words and marks end of file to true.
            if(character==(char)-1)
            {
                eof=true;
                break;
            }

            //Ignore the new line character
            if(character=='\r' || character==' ')
            {
                continue;
            }
            if(character=='\n')
            {
                break;
            }
            word+=character;
        }
        return word;
    }

    /**
     * Read all elements in the file and stores them
     * in a list.
     * @param  allWords=Map storing all words in all files
     * @return List storing (Key=Word,Value=WordCount) pair present in the file
     * @throws IOException
     */
    static  List<Map.Entry<String,Integer>>descendingOrder(TreeMap<String,Integer> allWords)
    {
        List<Map.Entry<String,Integer>> q=new ArrayList<>();
        for(Map.Entry<String,Integer>all:allWords.entrySet())
        {
            q.add(Map.entry(all.getKey(), all.getValue()));
        }
        Collections.sort(q, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return -1*(o1.getValue()).compareTo(o2.getValue());
            }
        });
        return q;
    }

    /**Storing count of all the words in all the files*/
    static List<Map.Entry<String,Integer>> storeAllWords(BufferedReader reader) throws IOException
    {
        while(eof!=true)
        {
            String word=readWord(reader);

            if(word.length()>0)
                allWords.put(word,1);
        }
        eof=false;
        return descendingOrder(allWords);
    }

    /**Storing count of all the words in each individual file*/
    static  List<Map.Entry<String,Integer>> WordsCountInTheFile(BufferedReader reader) throws IOException
    {
        TreeMap<String,Integer> allWordsInFile=new TreeMap<String,Integer>();
        while(eof!=true)
        {
            Integer prev_count=0;
            String word=readWord(reader);
            /**Increment count of only SampleWords in the map*/
            if(allWords.containsKey(word))
            {
                if (allWordsCount.containsKey(word)) {
                    prev_count = allWordsCount.get(word);
                }
                allWordsCount.put(word, prev_count + 1);
            }
            prev_count=0;

            /**Increment count of only SampleWords in the map*/
            if(allWords.containsKey(word))
            {
                if (allWordsInFile.containsKey(word)) {
                    prev_count = allWordsInFile.get(word);
                }
                allWordsInFile.put(word, prev_count + 1);
            }
        }
        eof=false;
        return descendingOrder(allWordsInFile);
    }

    /**For printing (Word - Count) pair for all words in a file*/
    static void printAllWordCountOfFile(String file_name, List<Map.Entry<String,Integer>>allWordsInFile)
    {
        System.out.println("File Name: "+file_name);
        if(allWordsInFile.size()==0)
        {
            System.out.println("There are no matching words in this file.");
        }
        for(Map.Entry<String, Integer> word:allWordsInFile)
        {
            System.out.println(word.getKey()+" - "+ word.getValue());
        }
    }
    /**
     *Opens the file,
     *WordsCountInFile-Store words,
     *printAllWordCountOfFile-prints words
     */
    static void storeAndPrintWordsInFile(String file_name) throws  IOException
    {
        FileReader file = new FileReader(file_name);
        BufferedReader reader = new BufferedReader(file);
        List<Map.Entry<String,Integer>>allWordsInFile=WordsCountInTheFile(reader);
        printAllWordCountOfFile(file_name,allWordsInFile);
    }
    public static void main(String[] args)
    {

        try {
            //Storing All the words from SampleWords into map
            words_file="SampleFolder/SampleWords.txt";
            FileReader file = new FileReader(words_file);
            BufferedReader reader = new BufferedReader(file);
            List<Map.Entry<String,Integer>> store=storeAllWords(reader);

            //Printing count of words in Each sample file
            for(int i=1;i<=3;i++)
            {
                System.out.println("=====================");
                System.out.println("Output #"+i);
                storeAndPrintWordsInFile("SampleFolder/"+"SampleFile"+ i+".txt");
            }

            //Printing count of words in All Sample files
            System.out.println("=====================");
            System.out.println("Count of all the words stored in all the files.");
            printAllWordCountOfFile(words_file,store);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("ALERT: We are not able to open your file named: "+ file_name);
        }
        catch(IOException e)
        {
            System.out.println("Input/Output exception occurred.");
        }

    }
}
