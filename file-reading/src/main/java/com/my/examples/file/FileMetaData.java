package com.my.examples.file;

public class FileMetaData {
    private String fileName;
    private String mimeType;
    private Long fileSize;
    private String fileExtention;
    
    //To get file meta data.
    public FileMetaData(String fileName, String mimeType, Long fileSize, String fileExtention) {
        this.fileName = fileName;
        this.mimeType = mimeType;
        this.fileSize = fileSize;
        this.fileExtention = fileExtention;
    }
    //To get file name.
    public String getFileName() {
        return fileName;
    }
    //To get file mimetype.
    public String getMimeType() {
        return mimeType;
    }
    //To get file size.
    public Long getFileSize() {
        return fileSize;
    }
    //To get file extension.
    public String getFileExtention() {
        return fileExtention;
    }
    
    @Override
    public String toString() {
        return "FileData{" +
               "fileName='" + fileName + '\'' +
               ", mimeType='" + mimeType + '\'' +
               ", fileSize=" + fileSize +
               ", fileExtention='" + fileExtention + '\'' +
               '}';
    }
}
