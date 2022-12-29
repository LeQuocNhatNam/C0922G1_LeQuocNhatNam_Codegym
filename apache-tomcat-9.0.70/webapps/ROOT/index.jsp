<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h2>Product Discount Calculator</h2>
<form action="/calculate-discount" method="post">
    <input type="text" name="productInfo" placeholder="Product information">
    <input type="text" name="listPrice" placeholder="List Price">
    <input type="text" name="discountPercent" placeholder="discount Percent">
    <button type="submit">Calculate Discount</button>

</form>
</body>
</html>