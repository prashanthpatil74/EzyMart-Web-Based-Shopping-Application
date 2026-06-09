# 🛒 EzyMart Web Based Shopping Application


## 📌 Project Overview

EzyMart Web Based Shopping Application that allows users to browse products, add items to a cart, place orders, and make payments online.

The application supports role-based access for **Admin** and **Customer** users, ensuring efficient product management and a seamless shopping experience.

This project focuses on of core functionalities, UI validation, usability, and data integrity.

---

## 🚀 Tech Stack

| Component | Technology |
|-----------|------------|
| Frontend | React JS / HTML / CSS / JavaScript |
| Backend | Spring Boot / Node.js (Assumed) |
| Database | MySQL |
| Testing Type | Manual Testing , Automation Testing|
| Testing Techniques | Functional Testing, Black Box Testing, UI Testing, Regression Testing |

---

## 🎯 Features Tested

- User Registration & Login
- Role-Based Access Control
- Product Browsing & Search
- Shopping Cart Management
- Checkout & Payment
- Order Management
- User Profile Management
- Responsive UI Validation

---

## 📂 Modules Covered

### 1. Authentication Module
- User Registration
- User Login
- Role-Based Redirection
- Logout Functionality

### 2. Admin Module
- Add Product
- View Product
- Update Product
- Delete Product
- Manage Categories
- View Orders
- Update Order Status

### 3. Customer Module
- View Products
- Search Products
- Filter Products
- Add to Cart
- Remove from Cart
- Place Orders
- View Order History

### 4. Cart & Order Module
- Cart Summary
- Quantity Update
- Price Calculation
- Checkout Process

### 5. Common Module
- User Profile
- Header & Footer
- Navigation Menu
- Responsive Design

### 6. Dashboard Module
- Home Page
- Admin Dashboard
- Customer Dashboard

---

## 👥 User Roles & Permissions

| Role | Permissions |
|------|------------|
| Admin | Manage Products, Categories, Orders, Profile |
| Customer | Browse Products, Manage Cart, Place Orders, View Order History, Profile |

---

## ✅ Test Scenarios Covered

### Authentication Testing
- Valid Registration
- Invalid Email Validation
- Empty Fields Validation
- Weak Password Validation
- Duplicate Email Validation
- Valid Login
- Invalid Login
- SQL Injection Validation
- Case Sensitivity Validation

### Product Testing
- Product Listing
- Product Search
- Empty Product Catalog
- Special Character Search

### Cart Testing
- Add Product to Cart
- Remove Product from Cart
- Add Product Without Login
- Out-of-Stock Product Validation
- Maximum Quantity Validation

### Order Testing
- Successful Checkout
- Payment Failure Handling
- Empty Cart Validation
- Invalid Card Validation
- Session Timeout Handling

### Admin Testing
- Unauthorized Access Validation
- Empty Product Field Validation
- Large Price Value Validation

---

## 📄 Pages Tested

- Login Page
- Registration Page
- Product Listing Page
- Cart Page
- Checkout Page

---

## 🧪 Test Environment

| Parameter | Value |
|------------|---------|
| Operating System | Windows 10 |
| Browser | Chrome, Edge |
| Backend Server | Localhost |
| Database | MySQL |

---

## 🐞 Defects Identified

| Defect ID | Description | Severity | Status |
|------------|------------|----------|--------|
| D-01 | Cart count not updating after page refresh | Medium | Fixed |

---

## 📊 Test Summary

| Metric | Count |
|---------|-------|
| User Stories Covered | 6 |
| Modules Tested | 6 |
| Defects Found | 1 |
| Defects Fixed | 1 |
| Critical Defects | 0 |

---

## 🎯 Testing Outcome

- Core functionalities tested successfully.
- Negative and boundary test scenarios executed.
- Security validation performed.
- UI and usability verified.
- One medium-severity defect identified and fixed.
- Admin product management requires additional testing.

---
