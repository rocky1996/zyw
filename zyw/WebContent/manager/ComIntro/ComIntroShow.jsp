<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/detail.css">
    <script src="${pageContext.request.contextPath }/js/jquery-3.0.0.min.js"></script>
    <script src="${pageContext.request.contextPath }/js/markdownit.js"></script>
    <style>
        .topic_content .markdown-text p {
            text-indent: 2em;
            font-size: 1rem;
        }
    </style>
    </style>
</head>

<body>
    <div id="main" style="display: inline-block;">
        <div id="content">
            <div class="panel">
                <div>
                    <div style="margin-top: 10px;display: inline-block;">
                        <a href="/topic" style="font-size: 25px;background-color: #7aba7b;color: white;padding: 5px;font-weight:200;"> &lt; 返回 </a>
                    </div>

                    <span class="topic_full_title">
                  		<tr>
                  			<th>标题</th>
                  			<th>内容</th>
                  		</tr>
                	</span>
                </div>
                <div class="header topic_header" style="display: inline-block;">
                    <div class="author_content">
                        <div class="topic_content">
                            <div class="markdown-text" style="padding: 2rem;">
                               <c:forEach items="${ci }" var="c">
                               		<tr>
                               			<td align="center">${c.title }</td>
                               			<td align="center">${c.control }</td>
                               		</tr>
                               </c:forEach>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>