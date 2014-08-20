/*
 * Copyright (c) 2013 Nutanix Inc. All rights reserved.
 */
package com.nutanix.test;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * The implementation of the SearchEngine interface.
 * @see SearchEngine
 */
public class SearchEngineImpl implements SearchEngine {

  @Override
  public SearchEngineIndex buildIndex(final ArrayList<File> files) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ArrayList<SearchResult> performSearch(final String searchString,
      final SearchEngineIndex index) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void setSortComparator(final Comparator<SearchResult> c) {
    // TODO Auto-generated method stub
  }
}
