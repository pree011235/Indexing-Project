/*
 * Copyright (c) 2013 Nutanix Inc. All rights reserved.
 */
package com.nutanix.test;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * A bare-bones SearchEngine. Complete the implementation of this class in
 * SearchEngineImpl.java.
 */
public interface SearchEngine {

  /**
   * Constructs the search indexes based on the files supplied.
   * @param files  A list of files to search. Each string is a URI
   *               representing a path to either a file or a folder
   *               containing files.
   */
  public SearchEngineIndex buildIndex(final ArrayList<File> files);

  /**
   * Perform a search, which returns a SearchResult object.
   * @param searchString       Can contain spaces.
   * @param index              The previously-generated search engine index
   *                           to use when performing the search.
   * @see   SimpleSearchResult
   */
  public ArrayList<SearchResult>
  performSearch(final String searchString, final SearchEngineIndex index);

  /**
   * Advanced
   * Supplies a comparator to facilitate sorting the output of the
   * search result APIs.
   */
  public void setSortComparator(final Comparator<SearchResult> c);
}
