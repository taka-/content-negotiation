package com.sample.controller;

import java.util.Locale;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

public class JsonPViewResolver implements ViewResolver {
    @Override
    public View resolveViewName(String viewName, Locale locale)
            throws Exception {
        return new JsonPView();
    }
}
