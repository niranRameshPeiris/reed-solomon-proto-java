package com.proto;

import erasure.SampleDecoder;
import erasure.SampleEncoder;


public class Main {

    public static void main(String[] args)
    {
        //use to encode
        //SampleEncoder encode=new SampleEncoder("file.mkv");
        //use to decode
        SampleDecoder decode=new SampleDecoder("file.mkv");

        System.out.println("Process Successfully ");
    }
}
