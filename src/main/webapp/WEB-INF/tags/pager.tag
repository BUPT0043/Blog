<%@ tag language="java" pageEncoding="UTF-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<table class="pager">  
    <tr>
    <td>
 <c:if test="${page.hasPreviousPage}">
                 <td><a href="${url}?pageNum=${page.prePage}&pageSize=${page.pageSize}">前一页</a></td>
             </c:if>
             <c:forEach items="${page.navigatepageNums}" var="nav">
                 <c:if test="${nav == page.pageNum}">
                     <td style="font-weight: bold;">${nav}</td>
                 </c:if>
                 <c:if test="${nav != page.pageNum}">
                     <td><a href="${url}?pageNum=${nav}&pageSize=${page.pageSize}">${nav}</a></td>
                 </c:if>
             </c:forEach>
             <c:if test="${page.hasNextPage}">
                 <td><a href="${url}?pageNum=${page.nextPage}&pageSize=${page.pageSize}">下一页</a></td>
             </c:if>
 </td>
 </tr>
 </table>
