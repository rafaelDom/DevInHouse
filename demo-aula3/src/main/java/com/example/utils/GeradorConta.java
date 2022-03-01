package com.example.utils;

public class GeradorConta {
	private static int ID = 1;

    public static int getProximaConta() {
        return ID++;
    }
}
