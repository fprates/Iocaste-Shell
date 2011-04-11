<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <title><%=session.getAttribute("app_title")%></title>
    </head>
    <body>
        <jsp:include page="<%=(String)session.getAttribute(\"app_url\")%>" flush="true"/>
    </body>
</html>