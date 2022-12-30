<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h2>Simple Calculator</h2>
<form action="/calculator" method="get">
    <table>
        <tr>
            <td>First Operand:</td>
            <td>
                <input type="text" name="firstOperand">
            </td>
        </tr>
        <tr>
            <td> Operator</td>
            <td>
                <select name="operator" id="">
                    <option value="add">Addition</option>
                    <option value="sub">Subtraction</option>
                    <option value="mul">Multiplication</option>
                    <option value="div">Division</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>Second Operand:</td>
            <td>
                <input type="text" name="secondOperand">
            </td>
        </tr>
        <tr>
            <td></td>
            <td><button type="submit">Calculate</button></td>
        </tr>
    </table>
</form>
</body>
</html>