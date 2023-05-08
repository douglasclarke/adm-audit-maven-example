/*
 * Copyright (C) 2023, Oracle and/or its affiliates.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.oracle.oci.adm.examples.hello;

import java.util.Map;
import java.util.HashMap;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

import org.yaml.snakeyaml.Yaml;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class HelloWorld { 

    private static final Logger logger = LogManager.getLogger(HelloWorld.class);
    
    public static void main(String[] args) { 
        logger.debug("HelloWorld.main started");

        Map<String, Object> data = new HashMap<String, Object>();
        data.put("Hello", "World");

       Yaml yaml = new Yaml();
       BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
       yaml.dump(data, out);
    } 
}
