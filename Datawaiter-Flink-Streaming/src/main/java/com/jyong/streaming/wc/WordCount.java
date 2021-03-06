package com.jyong.streaming.wc;

import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.operators.DataSource;

public class WordCount {

    public static void main(String[] args) throws Exception {

        ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();


        DataSource<String> stringDataSource = env.readTextFile("D:\\codding\\Somnambulist\\Somnambulist-flink-streaming\\src\\main\\resources\\words");


        stringDataSource.flatMap(new StreamWordCount.myFlatMapper()).groupBy(0)
                .sum(1)
                .print();


    }

}
