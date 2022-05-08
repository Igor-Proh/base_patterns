package com.prokhnov.patterns.pattern_4_dao.example;

public class Main_ex_1 {

    static DaoData daoData = new DaoDataDB();

    public static void main(String[] args) {
        System.out.println(daoData.getData());
    }
}

interface DaoData{
    String getData();
}

class DaoDataDB implements DaoData{

    @Override
    public String getData() {
        return "Data from DB";
    }
}

class DaoDataFileSystem implements DaoData{

    @Override
    public String getData() {
        return "Data from FileSystem";
    }
}