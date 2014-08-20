/*
 * Copyright (c) 2013 Nutanix Inc. All rights reserved.
 */
package com.nutanix.test;

import java.io.File;
import java.util.ArrayList;

/**
 * Class responsible for running (and testing) the search engine.
 * This class triggers the following behavior:
 * - Creates the search engine
 * - Builds the search engine index
 * - Performs some rudimentary searches
 * - Prints the output of the sample searches
 *
 * Providing additional test searches is by all means allowed.
 */
public final class Runner {

  public static void main(final String[] args) {

    final SearchEngine se = new SearchEngineImpl();
    final File file1 = new File("/home/user/files/nutanix-solution.txt");
    final File file2 = new File("/home/user/files/big-data.txt");
    final File dir1 = new File("/home/user/files/careers");
    final ArrayList<File> files = new ArrayList<File>();

    files.add(file1);
    files.add(file2);
    files.add(dir1);
    final SearchEngineIndex index = se.buildIndex(files);
    final ArrayList<SearchResult> result1 =
        se.performSearch("big data", index);
    final ArrayList<SearchResult> result2 =
        se.performSearch("solution", index);

    for (final SearchResult singleResult : result1) {
      System.out.println(singleResult);
    }
    for (final SearchResult singleResult : result2) {
      System.out.println(singleResult);
    }
  }
}
