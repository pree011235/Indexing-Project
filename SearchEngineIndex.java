/*
 * Copyright (c) 2013 Nutanix Inc. All rights reserved.
 */
package com.nutanix.test;

import java.io.File;

/**
 * An object to encapsulate the index(es) that will assist
 * when a search is performed.
 */
public interface SearchEngineIndex {

  /*
   * Advanced
   * Save the index to disk.
   */
  public void persistToDisk(File path);

  /**
   * Advanced
   * Read a (previously-saved) index from disk.
   */
  public void getFromDisk(File path);
}
