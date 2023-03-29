package com.here.competition.task5;

import java.util.List;

public interface StorageHandler {

    /***
     * Lists the files in the directory.
     */
    List<String> listFiles(String dir);

    /***
     * Lists the directories in the directory.
     */
    List<String> listDirectories(String dir);

    /***
     * Returns file size in bytes.
     */
    long fileSize(String file);
}
