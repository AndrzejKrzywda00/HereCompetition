package com.here.competition.task5;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class DirectoryCalculator {
    private StorageHandler storageHandler;

    /***
     * Find the total size of the directory.
     */
    public long directorySize(String directory) {
        List<String> directories = storageHandler.listDirectories(directory);
        return calculateFilesSize(directory) + directories
                .stream()
                .map(this::calculateFilesSize)
                .reduce(0L, Long::sum);
    }

    private long calculateFilesSize(String directory) {
        return storageHandler.listFiles(directory)
                .stream()
                .map(fileName -> storageHandler.fileSize(fileName))
                .reduce(0L, Long::sum);
    }
}
