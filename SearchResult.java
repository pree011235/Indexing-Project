/*
 * Copyright (c) 2013 Nutanix Inc. All rights reserved.
 */
package com.nutanix.test;

import java.util.Map;

/**
 * The encapsulation of the search result.
 * Includes the document name, and a map of words to their frequency
 * within the document.
 * Also includes an additional map which gives the location details about
 * each of the hits, which should be treated as extra credit.
 */
public final class SearchResult {

  /**
   * The displayable name of the document.
   */
  public String documentName;

  /**
   * A map containing the following:
   * Key: a String. One for each word searched for.
   * Value: an Integer representing the
   * frequency of this word within the document.
   */
  public Map<String, Integer> wordCounts;

  /**
   * A mapping of words to their position within the document,
   * defined as the number of words preceding this word
   * in the document. In the current comment, THIS word is position 26.
   * Extra credit.
   */
  public Map<String, Integer> hits;

  public String toString() {
    final String newline = System.getProperty("line.separator");
    final StringBuilder sb = new StringBuilder();
    sb.append(documentName).append(newline);
    sb.append("word counts:").append(newline);
    for (final Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
      sb.append(entry.getKey() + "|" + entry.getValue()).append(newline);
    }
    sb.append("hits:").append(newline);
    for (final Map.Entry<String, Integer> entry : hits.entrySet()) {
      sb.append(entry.getKey() + "|" + entry.getValue()).append(newline);
    }
    return sb.toString();
  }
}
