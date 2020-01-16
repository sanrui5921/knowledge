package org.sunrain.study.okhttp3.example.utils.http;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest {

    private String url;

    private Map<String, String> headers = new HashMap<>();

    private Map<String, String> params = new HashMap<>();

    private String body;
}
