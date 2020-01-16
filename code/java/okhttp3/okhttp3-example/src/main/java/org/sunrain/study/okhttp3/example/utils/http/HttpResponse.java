package org.sunrain.study.okhttp3.example.utils.http;

import java.util.HashMap;
import java.util.Map;

public class HttpResponse {

    private String url;

    private int code;

    private Map<String, String> headers = new HashMap<>();

    private String body;

}
