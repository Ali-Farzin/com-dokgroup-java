package com.dokgroup.bank_project_java.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/home")
public class HomeController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // مقداردهی یک متغیر برای نمایش در JSP
        req.setAttribute("var_in_bag", "این صفحه به درخواست متدی از کنترولر و سرولت و پس از زدن دکمه روی همین صفحه، به نمایش درآمد.");

        // انتقال به login.jsp
        RequestDispatcher dispatcher = req.getRequestDispatcher("home.jsp");
        dispatcher.forward(req, resp);

    }}
