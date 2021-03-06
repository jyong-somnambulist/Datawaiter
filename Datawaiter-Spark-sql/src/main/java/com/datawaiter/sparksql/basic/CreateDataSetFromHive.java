package com.datawaiter.sparksql.basic;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class CreateDataSetFromHive {
    public static void main(String[] args) {
        SparkSession spark = SparkSession
                .builder()
                .appName("JavaSparkHive")
                .master("local")
                .config("hive.metastore.uris","thrift://c7node1:9083")
                .enableHiveSupport()
                .getOrCreate();

//        com.jyong.scala.com.jyong.scala.spark.sql("CREATE TABLE IF NOT EXISTS src (key INT, value STRING) USING hive");
//        com.jyong.scala.com.jyong.scala.spark.sql("LOAD DATA LOCAL INPATH 'examples/src/main/resources/kv1.txt' INTO TABLE src");
        Dataset<Row> sql = spark.sql("SELECT * FROM src");
//                sql.show();
    }
}
